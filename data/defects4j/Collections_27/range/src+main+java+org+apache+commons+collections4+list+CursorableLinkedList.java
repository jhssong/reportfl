{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/CursorableLinkedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CursorableLinkedList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 620,
      "comment": "\n * A \u003ccode\u003eList\u003c/code\u003e implementation with a \u003ccode\u003eListIterator\u003c/code\u003e that\n * allows concurrent modifications to the underlying list.\n * \u003cp\u003e\n * This implementation supports all of the optional {@link List} operations.\n * It extends \u003ccode\u003eAbstractLinkedList\u003c/code\u003e and thus provides the\n * stack/queue/dequeue operations available in {@link java.util.LinkedList}.\n * \u003cp\u003e\n * The main feature of this class is the ability to modify the list and the\n * iterator at the same time. Both the {@link #listIterator()} and {@link #cursor()}\n * methods provides access to a \u003ccode\u003eCursor\u003c/code\u003e instance which extends\n * \u003ccode\u003eListIterator\u003c/code\u003e. The cursor allows changes to the list concurrent\n * with changes to the iterator. Note that the {@link #iterator()} method and\n * sublists do \u003cb\u003enot\u003c/b\u003e provide this cursor behaviour.\n * \u003cp\u003e\n * The \u003ccode\u003eCursor\u003c/code\u003e class is provided partly for backwards compatibility\n * and partly because it allows the cursor to be directly closed. Closing the\n * cursor is optional because references are held via a \u003ccode\u003eWeakReference\u003c/code\u003e.\n * For most purposes, simply modify the iterator and list at will, and then let\n * the garbage collector to the rest.\n * \u003cp\u003e\n * \u003cb\u003eNote that this implementation is not synchronized.\u003c/b\u003e\n *\n * @see java.util.LinkedList\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Ensure serialization compatibility "
    },
    {
      "type": "field",
      "varNames": [
        "cursors"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A list of the cursor currently open on this list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.CursorableLinkedList()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructor that creates.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 16)",
        "(line 72,col 9)-(line 72,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.CursorableLinkedList(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Constructor that copies the specified collection\n     *\n     * @param coll  the collection to copy\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.init()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * The equivalent of a default constructor called\n     * by any constructor and by \u003ccode\u003ereadObject\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.iterator()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Returns an iterator that does \u003cb\u003enot\u003c/b\u003e support concurrent modification.\n     * \u003cp\u003e\n     * If the underlying list is modified while iterating using this iterator\n     * a ConcurrentModificationException will occur.\n     * The cursor behaviour is available via {@link #listIterator()}.\n     *\n     * @return a new iterator that does \u003cb\u003enot\u003c/b\u003e support concurrent modification\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.listIterator()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Returns a cursor iterator that allows changes to the underlying list in parallel.\n     * \u003cp\u003e\n     * The cursor enables iteration and list changes to occur in any order without\n     * invalidating the iterator (from one thread). When elements are added to the\n     * list, an event is fired to all active cursors enabling them to adjust to the\n     * change in the list.\n     * \u003cp\u003e\n     * When the \"current\" (i.e., last returned by {@link ListIterator#next}\n     * or {@link ListIterator#previous}) element of the list is removed,\n     * the cursor automatically adjusts to the change (invalidating the\n     * last returned value such that it cannot be removed).\n     *\n     * @return a new cursor iterator\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.listIterator(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Returns a cursor iterator that allows changes to the underlying list in parallel.\n     * \u003cp\u003e\n     * The cursor enables iteration and list changes to occur in any order without\n     * invalidating the iterator (from one thread). When elements are added to the\n     * list, an event is fired to all active cursors enabling them to adjust to the\n     * change in the list.\n     * \u003cp\u003e\n     * When the \"current\" (i.e., last returned by {@link ListIterator#next}\n     * or {@link ListIterator#previous}) element of the list is removed,\n     * the cursor automatically adjusts to the change (invalidating the\n     * last returned value such that it cannot be removed).\n     *\n     * @param fromIndex  the index to start from\n     * @return a new cursor iterator\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.cursor()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns a {@link Cursor} for iterating through the elements of this list.\n     * \u003cp\u003e\n     * A \u003ccode\u003eCursor\u003c/code\u003e is a \u003ccode\u003eListIterator\u003c/code\u003e with an additional\n     * \u003ccode\u003eclose()\u003c/code\u003e method. Calling this method immediately discards the\n     * references to the cursor. If it is not called, then the garbage collector\n     * will still remove the reference as it is held via a \u003ccode\u003eWeakReference\u003c/code\u003e.\n     * \u003cp\u003e\n     * The cursor enables iteration and list changes to occur in any order without\n     * invalidating the iterator (from one thread). When elements are added to the\n     * list, an event is fired to all active cursors enabling them to adjust to the\n     * change in the list.\n     * \u003cp\u003e\n     * When the \"current\" (i.e., last returned by {@link ListIterator#next}\n     * or {@link ListIterator#previous}) element of the list is removed,\n     * the cursor automatically adjusts to the change (invalidating the\n     * last returned value such that it cannot be removed).\n     * \u003cp\u003e\n     * The {@link #listIterator()} method returns the same as this method, and can\n     * be cast to a \u003ccode\u003eCursor\u003c/code\u003e if the \u003ccode\u003eclose\u003c/code\u003e method is required.\n     *\n     * @return a new cursor iterator\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.cursor(int)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Returns a {@link Cursor} for iterating through the elements of this list\n     * starting from a specified index.\n     * \u003cp\u003e\n     * A \u003ccode\u003eCursor\u003c/code\u003e is a \u003ccode\u003eListIterator\u003c/code\u003e with an additional\n     * \u003ccode\u003eclose()\u003c/code\u003e method. Calling this method immediately discards the\n     * references to the cursor. If it is not called, then the garbage collector\n     * will still remove the reference as it is held via a \u003ccode\u003eWeakReference\u003c/code\u003e.\n     * \u003cp\u003e\n     * The cursor enables iteration and list changes to occur in any order without\n     * invalidating the iterator (from one thread). When elements are added to the\n     * list, an event is fired to all active cursors enabling them to adjust to the\n     * change in the list.\n     * \u003cp\u003e\n     * When the \"current\" (i.e., last returned by {@link ListIterator#next}\n     * or {@link ListIterator#previous}) element of the list is removed,\n     * the cursor automatically adjusts to the change (invalidating the\n     * last returned value such that it cannot be removed).\n     * \u003cp\u003e\n     * The {@link #listIterator(int)} method returns the same as this method, and can\n     * be cast to a \u003ccode\u003eCursor\u003c/code\u003e if the \u003ccode\u003eclose\u003c/code\u003e method is required.\n     *\n     * @param fromIndex  the index to start from\n     * @return a new cursor iterator\n     * @throws IndexOutOfBoundsException if the index is out of range\n     *      (index \u0026lt; 0 || index \u0026gt; size()).\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 64)",
        "(line 206,col 9)-(line 206,col 31)",
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.updateNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * Updates the node with a new value.\n     * This implementation sets the value on the node.\n     * Subclasses can override this to record the change.\n     *\n     * @param node  node to update\n     * @param value  new value of the node\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.addNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 232,
      "end_line": 236,
      "comment": "\n     * Inserts a new node into the list.\n     *\n     * @param nodeToInsert  new node to insert\n     * @param insertBeforeNode  node to insert before\n     * @throws NullPointerException if either node is null\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 54)",
        "(line 235,col 9)-(line 235,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.removeNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * Removes the specified node from the list.\n     *\n     * @param node  the node to remove\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 31)",
        "(line 247,col 9)-(line 247,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.removeAllNodes()",
      "begin_line": 253,
      "end_line": 263,
      "comment": "\n     * Removes all nodes by iteration.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.registerCursor(org.apache.commons.collections4.list.CursorableLinkedList.Cursor\u003cE\u003e)",
      "begin_line": 271,
      "end_line": 281,
      "comment": "\n     * Registers a cursor to be notified of changes to this list.\n     *\n     * @param cursor  the cursor to register\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.unregisterCursor(org.apache.commons.collections4.list.CursorableLinkedList.Cursor\u003cE\u003e)",
      "begin_line": 288,
      "end_line": 303,
      "comment": "\n     * Deregisters a cursor from the list to be notified of changes.\n     *\n     * @param cursor  the cursor to deregister\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.broadcastNodeChanged(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 312,
      "end_line": 323,
      "comment": "\n     * Informs all of my registered cursors that the specified\n     * element was changed.\n     *\n     * @param node  the node that was changed\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 73)",
        "(line 314,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.broadcastNodeRemoved(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 331,
      "end_line": 342,
      "comment": "\n     * Informs all of my registered cursors that the specified\n     * element was just removed from my list.\n     *\n     * @param node  the node that was changed\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 73)",
        "(line 333,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.broadcastNodeInserted(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 350,
      "end_line": 361,
      "comment": "\n     * Informs all of my registered cursors that the specified\n     * element was just added to my list.\n     *\n     * @param node  the node that was changed\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 73)",
        "(line 352,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\n     * Serializes the data held in this object to the stream specified.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 33)",
        "(line 369,col 9)-(line 369,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.readObject(java.io.ObjectInputStream)",
      "begin_line": 375,
      "end_line": 378,
      "comment": "\n     * Deserializes the data held in this object to the stream specified.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 31)",
        "(line 377,col 9)-(line 377,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.createSubListListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 388,
      "end_line": 393,
      "comment": "\n     * Creates a list iterator for the sublist.\n     *\n     * @param subList  the sublist to get an iterator for\n     * @param fromIndex  the index to start from, relative to the sublist\n     * @return the list iterator for the sublist\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 73)",
        "(line 391,col 9)-(line 391,col 31)",
        "(line 392,col 9)-(line 392,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Cursor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator\u003cE\u003e"
      ],
      "begin_line": 400,
      "end_line": 566,
      "comment": "\n     * An extended \u003ccode\u003eListIterator\u003c/code\u003e that allows concurrent changes to\n     * the underlying list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valid"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " Is the cursor valid (not closed) "
    },
    {
      "type": "field",
      "varNames": [
        "nextIndexValid"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " Is the next index valid "
    },
    {
      "type": "field",
      "varNames": [
        "currentRemovedByAnother"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Flag to indicate if the current element was removed by another object. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.Cursor(org.apache.commons.collections4.list.CursorableLinkedList\u003cE\u003e, int)",
      "begin_line": 414,
      "end_line": 417,
      "comment": "\n         * Constructs a new cursor.\n         *\n         * @param parent  the parent list\n         * @param index  the index to start from\n         ",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 33)",
        "(line 416,col 13)-(line 416,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.remove()",
      "begin_line": 430,
      "end_line": 444,
      "comment": "\n         * Removes the item last returned by this iterator.\n         * \u003cp\u003e\n         * There may have been subsequent alterations to the list\n         * since you obtained this item, however you can still remove it.\n         * You can even remove it if the item is no longer in the main list.\n         * However, you can\u0027t call this method on the same iterator more\n         * than once without calling next() or previous().\n         *\n         * @throws IllegalStateException if there is no item to remove\n         ",
      "child_ranges": [
        "(line 434,col 13)-(line 442,col 13)",
        "(line 443,col 13)-(line 443,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.add(E)",
      "begin_line": 452,
      "end_line": 459,
      "comment": "\n         * Adds an object to the list.\n         * The object added here will be the new \u0027previous\u0027 in the iterator.\n         *\n         * @param obj  the object to add\n         ",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 27)",
        "(line 458,col 13)-(line 458,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.nextIndex()",
      "begin_line": 471,
      "end_line": 488,
      "comment": "\n         * Gets the index of the next element to be returned.\n         *\n         * @return the next index\n         ",
      "child_ranges": [
        "(line 473,col 13)-(line 486,col 13)",
        "(line 487,col 13)-(line 487,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.nodeChanged(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n         * Handle event from the list when a node has changed.\n         *\n         * @param node  the node that changed\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.nodeRemoved(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 504,
      "end_line": 525,
      "comment": "\n         * Handle event from the list when a node has been removed.\n         *\n         * @param node  the node that was removed\n         ",
      "child_ranges": [
        "(line 505,col 13)-(line 524,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.nodeInserted(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 532,
      "end_line": 540,
      "comment": "\n         * Handle event from the list when a node has been added.\n         *\n         * @param node  the node that was added\n         ",
      "child_ranges": [
        "(line 533,col 13)-(line 539,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.checkModCount()",
      "begin_line": 545,
      "end_line": 550,
      "comment": "\n         * Override superclass modCount check, and replace it with our valid flag.\n         ",
      "child_ranges": [
        "(line 547,col 13)-(line 549,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.Cursor.close()",
      "begin_line": 560,
      "end_line": 565,
      "comment": "\n         * Mark this cursor as no longer being needed. Any resources\n         * associated with this cursor are immediately released.\n         * In previous versions of this class, it was mandatory to close\n         * all cursor objects to avoid memory leaks. It is \u003ci\u003eno longer\u003c/i\u003e\n         * necessary to call this close method; an instance of this class\n         * can now be treated exactly like a normal iterator.\n         ",
      "child_ranges": [
        "(line 561,col 13)-(line 564,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubCursor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.CursorableLinkedList.Cursor\u003cE\u003e"
      ],
      "begin_line": 574,
      "end_line": 618,
      "comment": "\n     * A cursor for the sublist based on LinkedSubListIterator.\n     *\n     * @since 3.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sub"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": " The parent list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.SubCursor(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\n         * Constructs a new cursor.\n         *\n         * @param sub  the sub list\n         * @param index  the index to start from\n         ",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 76)",
        "(line 587,col 13)-(line 587,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.hasNext()",
      "begin_line": 590,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 13)-(line 592,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.hasPrevious()",
      "begin_line": 595,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 597,col 13)-(line 597,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.nextIndex()",
      "begin_line": 600,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.add(E)",
      "begin_line": 605,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 27)",
        "(line 608,col 13)-(line 608,col 51)",
        "(line 609,col 13)-(line 609,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.CursorableLinkedList.SubCursor.remove()",
      "begin_line": 612,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 614,col 13)-(line 614,col 27)",
        "(line 615,col 13)-(line 615,col 51)",
        "(line 616,col 13)-(line 616,col 23)"
      ]
    }
  ]
}