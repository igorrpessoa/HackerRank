package br.com.igorrpessoa.challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeLinkedLists {

static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

static class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
    while (node != null) {
        bufferedWriter.write(String.valueOf(node.data));

        node = node.next;

        if (node != null) {
            bufferedWriter.write(sep);
        }
    }
}

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode finalLinkedList = null;
        SinglyLinkedListNode auxLinkedList = null;
        boolean first = true;
        while(true) {
            if(head1 == null && head2 == null) {
                break;
            }
            if(head2 == null || head1 != null && head1.data < head2.data) {
                if(first) {
                    System.out.println("Primeiro 1");
                    auxLinkedList = new SinglyLinkedListNode(head1.data);
                    finalLinkedList = auxLinkedList;
                    first = false;
                } else {
                    auxLinkedList.next = new SinglyLinkedListNode(head1.data);
                    auxLinkedList = auxLinkedList.next;
                }
                head1 = head1.next;
            } else {
                if(first) {
                    System.out.println("Primeiro 2");
                    auxLinkedList = new SinglyLinkedListNode(head2.data);
                    finalLinkedList = auxLinkedList;
                    first = false;
                } else {
                    auxLinkedList.next = new SinglyLinkedListNode(head2.data);
                    auxLinkedList = auxLinkedList.next;
                }
                head2 = head2.next;
            }
        }
        return finalLinkedList;
    }
}
