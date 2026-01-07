{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/TreeList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeList",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cE\u003e"
      ],
      "begin_line": 58,
      "end_line": 1120,
      "comment": "\n * A \u003ccode\u003eList\u003c/code\u003e implementation that is optimised for fast insertions and\n * removals at any index in the list.\n * \u003cp\u003e\n * This list implementation utilises a tree structure internally to ensure that\n * all insertions and removals are O(log n). This provides much faster performance\n * than both an \u003ccode\u003eArrayList\u003c/code\u003e and a \u003ccode\u003eLinkedList\u003c/code\u003e where elements\n * are inserted and removed repeatedly from anywhere in the list.\n * \u003cp\u003e\n * The following relative performance statistics are indicative of this class:\n * \u003cpre\u003e\n *              get  add  insert  iterate  remove\n * TreeList       3    5       1       2       1\n * ArrayList      1    1      40       1      40\n * LinkedList  5800    1     350       2     325\n * \u003c/pre\u003e\n * \u003ccode\u003eArrayList\u003c/code\u003e is a good general purpose list implementation.\n * It is faster than \u003ccode\u003eTreeList\u003c/code\u003e for most operations except inserting\n * and removing in the middle of the list. \u003ccode\u003eArrayList\u003c/code\u003e also uses less\n * memory as \u003ccode\u003eTreeList\u003c/code\u003e uses one object per entry.\n * \u003cp\u003e\n * \u003ccode\u003eLinkedList\u003c/code\u003e is rarely a good choice of implementation.\n * \u003ccode\u003eTreeList\u003c/code\u003e is almost always a good replacement for it, although it\n * does use slightly more memory.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The root node in the AVL tree "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The current size of the list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeList()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Constructs a new empty list.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeList(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Constructs a new empty list that copies the specified collection.\n     *\n     * @param coll  the collection to copy\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)",
        "(line 86,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.get(int)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Gets the element at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the element at the specified index\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 44)",
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.size()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Gets the current size of the list.\n     *\n     * @return the current size\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.iterator()",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Gets an iterator over the list.\n     *\n     * @return an iterator over the list\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.listIterator()",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Gets a ListIterator over the list.\n     *\n     * @return the new iterator\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.listIterator(int)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * Gets a ListIterator over the list.\n     *\n     * @param fromIndex  the index to start from\n     * @return the new iterator\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.indexOf(java.lang.Object)",
      "begin_line": 157,
      "end_line": 164,
      "comment": "\n     * Searches for the index of an object in the list.\n     *\n     * @param object  the object to search\n     * @return the index of the object, -1 if not found\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.contains(java.lang.Object)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Searches for the presence of an object in the list.\n     *\n     * @param object  the object to check\n     * @return true if the object is found\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.toArray()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Converts the list into an array.\n     *\n     * @return the list as an array\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 50)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.add(int, E)",
      "begin_line": 199,
      "end_line": 209,
      "comment": "\n     * Adds a new element to the list.\n     *\n     * @param index  the index to add before\n     * @param obj  the element to add\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 19)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 222,
      "end_line": 232,
      "comment": "\n     * Appends all of the elements in the specified collection to the end of this list,\n     * in the order that they are returned by the specified collection\u0027s Iterator.\n     * \u003cp\u003e\n     * This method runs in O(n + log m) time, where m is\n     * the size of this list and n is the size of {@code c}.\n     *\n     * @param c  the collection to be added to this list\n     * @return {@code true} if this list changed as a result of the call\n     * @throws NullPointerException {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 51)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.set(int, E)",
      "begin_line": 242,
      "end_line": 249,
      "comment": "\n     * Sets the element at the specified index.\n     *\n     * @param index  the index to set\n     * @param obj  the object to store at the specified index\n     * @return the previous object at that index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 246,col 36)",
        "(line 247,col 9)-(line 247,col 27)",
        "(line 248,col 9)-(line 248,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.remove(int)",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n     * Removes the element at the specified index.\n     *\n     * @param index  the index to remove\n     * @return the previous object at that index\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 19)",
        "(line 260,col 9)-(line 260,col 44)",
        "(line 261,col 9)-(line 261,col 36)",
        "(line 262,col 9)-(line 262,col 34)",
        "(line 263,col 9)-(line 263,col 15)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.clear()",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * Clears the list, removing all entries.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 19)",
        "(line 273,col 9)-(line 273,col 20)",
        "(line 274,col 9)-(line 274,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.checkInterval(int, int, int)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * Checks whether the index is valid.\n     *\n     * @param index  the index to check\n     * @param startIndex  the first allowed index\n     * @param endIndex  the last allowed index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AVLNode",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 305,
      "end_line": 976,
      "comment": "\n     * Implements an AVLNode which keeps the offset updated.\n     * \u003cp\u003e\n     * This node contains the real work.\n     * TreeList is just there to implement {@link java.util.List}.\n     * The nodes don\u0027t know the index of the object they are holding.  They\n     * do know however their position relative to their parent node.\n     * This allows to calculate the index of a node while traversing the tree.\n     * \u003cp\u003e\n     * The Faedelung calculation stores a flag for both the left and right child\n     * to indicate if they are a child (false) or a link as in linked list (true).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The left child node or the predecessor if {@link #leftIsPrevious}."
    },
    {
      "type": "field",
      "varNames": [
        "leftIsPrevious"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Flag indicating that left reference is not a subtree but the predecessor. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " The right child node or the successor if {@link #rightIsNext}. "
    },
    {
      "type": "field",
      "varNames": [
        "rightIsNext"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " Flag indicating that right reference is not a subtree but the successor. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " How many levels of left/right are below this one. "
    },
    {
      "type": "field",
      "varNames": [
        "relativePosition"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " The relative position, root holds absolute position. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The stored element. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.AVLNode(int, E, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\n         * Constructs a new node with a relative position.\n         *\n         * @param relativePosition  the relative position of the node\n         * @param obj  the value for the node\n         * @param rightFollower the node with the value following this one\n         * @param leftFollower the node with the value leading this one\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 53)",
        "(line 332,col 13)-(line 332,col 24)",
        "(line 333,col 13)-(line 333,col 31)",
        "(line 334,col 13)-(line 334,col 34)",
        "(line 335,col 13)-(line 335,col 34)",
        "(line 336,col 13)-(line 336,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.AVLNode(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n         * Constructs a new AVL tree from a collection.\n         * \u003cp\u003e\n         * The collection must be nonempty.\n         *\n         * @param coll  a nonempty collection\n         ",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.AVLNode(java.util.Iterator\u003c? extends E\u003e, int, int, int, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 371,
      "end_line": 389,
      "comment": "\n         * Constructs a new AVL tree from a collection.\n         * \u003cp\u003e\n         * This is a recursive helper for {@link #AVLNode(Collection)}. A call\n         * to this method will construct the subtree for elements {@code start}\n         * through {@code end} of the collection, assuming the iterator\n         * {@code e} already points at element {@code start}.\n         *\n         * @param iterator  an iterator over the collection, which should already point\n         *          to the element at index {@code start} within the collection\n         * @param start  the index of the first element in the collection that\n         *          should be in this subtree\n         * @param end  the index of the last element in the collection that\n         *          should be in this subtree\n         * @param absolutePositionOfParent  absolute position of this node\u0027s\n         *          parent, or 0 if this node is the root\n         * @param prev  the {@code AVLNode} corresponding to element (start - 1)\n         *          of the collection, or null if start is 0\n         * @param next  the {@code AVLNode} corresponding to element (end + 1)\n         *          of the collection, or null if end is the last element of the collection\n         ",
      "child_ranges": [
        "(line 373,col 13)-(line 373,col 54)",
        "(line 374,col 13)-(line 379,col 13)",
        "(line 380,col 13)-(line 380,col 36)",
        "(line 381,col 13)-(line 381,col 62)",
        "(line 382,col 13)-(line 387,col 13)",
        "(line 388,col 13)-(line 388,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.getValue()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n         * Gets the value.\n         *\n         * @return the value of this node\n         ",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.setValue(E)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n         * Sets the value.\n         *\n         * @param obj  the value to store\n         ",
      "child_ranges": [
        "(line 406,col 13)-(line 406,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.get(int)",
      "begin_line": 413,
      "end_line": 425,
      "comment": "\n         * Locate the element with the given index relative to the\n         * offset of the parent of this node.\n         ",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 67)",
        "(line 416,col 13)-(line 418,col 13)",
        "(line 420,col 13)-(line 420,col 101)",
        "(line 421,col 13)-(line 423,col 13)",
        "(line 424,col 13)-(line 424,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.indexOf(java.lang.Object, int)",
      "begin_line": 430,
      "end_line": 444,
      "comment": "\n         * Locate the index that contains the specified object.\n         ",
      "child_ranges": [
        "(line 431,col 13)-(line 436,col 13)",
        "(line 437,col 13)-(line 439,col 13)",
        "(line 440,col 13)-(line 442,col 13)",
        "(line 443,col 13)-(line 443,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.toArray(java.lang.Object[], int)",
      "begin_line": 452,
      "end_line": 460,
      "comment": "\n         * Stores the node and its children into the array specified.\n         *\n         * @param array the array to be filled\n         * @param index the index of this node\n         ",
      "child_ranges": [
        "(line 453,col 13)-(line 453,col 33)",
        "(line 454,col 13)-(line 456,col 13)",
        "(line 457,col 13)-(line 459,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.next()",
      "begin_line": 467,
      "end_line": 472,
      "comment": "\n         * Gets the next node in the list after this one.\n         *\n         * @return the next node\n         ",
      "child_ranges": [
        "(line 468,col 13)-(line 470,col 13)",
        "(line 471,col 13)-(line 471,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.previous()",
      "begin_line": 479,
      "end_line": 484,
      "comment": "\n         * Gets the node in the list before this one.\n         *\n         * @return the previous node\n         ",
      "child_ranges": [
        "(line 480,col 13)-(line 482,col 13)",
        "(line 483,col 13)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.insert(int, E)",
      "begin_line": 493,
      "end_line": 500,
      "comment": "\n         * Inserts a node at the position index.\n         *\n         * @param index is the index of the position relative to the position of\n         * the parent node.\n         * @param obj is the object to be stored in the position.\n         ",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 67)",
        "(line 496,col 13)-(line 498,col 13)",
        "(line 499,col 13)-(line 499,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.insertOnLeft(int, E)",
      "begin_line": 502,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 503,col 13)-(line 507,col 13)",
        "(line 509,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 45)",
        "(line 513,col 13)-(line 513,col 27)",
        "(line 514,col 13)-(line 514,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.insertOnRight(int, E)",
      "begin_line": 517,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 518,col 13)-(line 522,col 13)",
        "(line 523,col 13)-(line 525,col 13)",
        "(line 526,col 13)-(line 526,col 45)",
        "(line 527,col 13)-(line 527,col 27)",
        "(line 528,col 13)-(line 528,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.getLeftSubTree()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n         * Gets the left node, returning null if its a faedelung.\n         ",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.getRightSubTree()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n         * Gets the right node, returning null if its a faedelung.\n         ",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.max()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n         * Gets the rightmost child of this node.\n         *\n         * @return the rightmost child (greatest index)\n         ",
      "child_ranges": [
        "(line 552,col 13)-(line 552,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.min()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n         * Gets the leftmost child of this node.\n         *\n         * @return the leftmost child (smallest index)\n         ",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.remove(int)",
      "begin_line": 570,
      "end_line": 589,
      "comment": "\n         * Removes the node at a given position.\n         *\n         * @param index is the index of the element to be removed relative to the position of\n         * the parent node of the current node.\n         ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 67)",
        "(line 573,col 13)-(line 575,col 13)",
        "(line 576,col 13)-(line 586,col 13)",
        "(line 587,col 13)-(line 587,col 27)",
        "(line 588,col 13)-(line 588,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.removeMax()",
      "begin_line": 591,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 592,col 13)-(line 594,col 13)",
        "(line 595,col 13)-(line 595,col 53)",
        "(line 596,col 13)-(line 598,col 13)",
        "(line 599,col 13)-(line 599,col 27)",
        "(line 600,col 13)-(line 600,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.removeMin()",
      "begin_line": 603,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 604,col 13)-(line 606,col 13)",
        "(line 607,col 13)-(line 607,col 49)",
        "(line 608,col 13)-(line 610,col 13)",
        "(line 611,col 13)-(line 611,col 27)",
        "(line 612,col 13)-(line 612,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.removeSelf()",
      "begin_line": 620,
      "end_line": 669,
      "comment": "\n         * Removes this node from the tree.\n         *\n         * @return the node that replaces this one in the parent\n         ",
      "child_ranges": [
        "(line 621,col 13)-(line 623,col 13)",
        "(line 624,col 13)-(line 630,col 13)",
        "(line 631,col 13)-(line 635,col 13)",
        "(line 637,col 13)-(line 666,col 13)",
        "(line 667,col 13)-(line 667,col 27)",
        "(line 668,col 13)-(line 668,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.balance()",
      "begin_line": 675,
      "end_line": 694,
      "comment": "\n         * Balances according to the AVL algorithm.\n         ",
      "child_ranges": [
        "(line 676,col 13)-(line 693,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.getOffset(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 699,
      "end_line": 704,
      "comment": "\n         * Gets the relative position.\n         ",
      "child_ranges": [
        "(line 700,col 13)-(line 702,col 13)",
        "(line 703,col 13)-(line 703,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.setOffset(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, int)",
      "begin_line": 709,
      "end_line": 716,
      "comment": "\n         * Sets the relative position.\n         ",
      "child_ranges": [
        "(line 710,col 13)-(line 712,col 13)",
        "(line 713,col 13)-(line 713,col 50)",
        "(line 714,col 13)-(line 714,col 46)",
        "(line 715,col 13)-(line 715,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.recalcHeight()",
      "begin_line": 721,
      "end_line": 725,
      "comment": "\n         * Sets the height by calculation.\n         ",
      "child_ranges": [
        "(line 722,col 13)-(line 724,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.getHeight(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n         * Returns the height of the node or -1 if the node is null.\n         ",
      "child_ranges": [
        "(line 731,col 13)-(line 731,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.heightRightMinusLeft()",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n         * Returns the height difference right - left\n         ",
      "child_ranges": [
        "(line 738,col 13)-(line 738,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.rotateLeft()",
      "begin_line": 741,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 44)",
        "(line 743,col 13)-(line 743,col 76)",
        "(line 745,col 13)-(line 745,col 76)",
        "(line 746,col 13)-(line 746,col 63)",
        "(line 747,col 13)-(line 747,col 79)",
        "(line 749,col 13)-(line 749,col 40)",
        "(line 750,col 13)-(line 750,col 39)",
        "(line 752,col 13)-(line 752,col 46)",
        "(line 753,col 13)-(line 753,col 43)",
        "(line 754,col 13)-(line 754,col 48)",
        "(line 755,col 13)-(line 755,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.rotateRight()",
      "begin_line": 758,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 759,col 13)-(line 759,col 43)",
        "(line 760,col 13)-(line 760,col 76)",
        "(line 762,col 13)-(line 762,col 76)",
        "(line 763,col 13)-(line 763,col 63)",
        "(line 764,col 13)-(line 764,col 79)",
        "(line 766,col 13)-(line 766,col 39)",
        "(line 767,col 13)-(line 767,col 40)",
        "(line 769,col 13)-(line 769,col 46)",
        "(line 770,col 13)-(line 770,col 43)",
        "(line 771,col 13)-(line 771,col 48)",
        "(line 772,col 13)-(line 772,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.setLeft(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 781,
      "end_line": 785,
      "comment": "\n         * Sets the left field to the node, or the previous node if that is null\n         *\n         * @param node  the new left subtree node\n         * @param previous  the previous node in the linked list\n         ",
      "child_ranges": [
        "(line 782,col 13)-(line 782,col 42)",
        "(line 783,col 13)-(line 783,col 52)",
        "(line 784,col 13)-(line 784,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.setRight(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e)",
      "begin_line": 793,
      "end_line": 797,
      "comment": "\n         * Sets the right field to the node, or the next node if that is null\n         *\n         * @param node  the new left subtree node\n         * @param next  the next node in the linked list\n         ",
      "child_ranges": [
        "(line 794,col 13)-(line 794,col 39)",
        "(line 795,col 13)-(line 795,col 46)",
        "(line 796,col 13)-(line 796,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.addAll(org.apache.commons.collections4.list.TreeList.AVLNode\u003cE\u003e, int)",
      "begin_line": 810,
      "end_line": 903,
      "comment": "\n         * Appends the elements of another tree list to this tree list by efficiently\n         * merging the two AVL trees. This operation is destructive to both trees and\n         * runs in O(log(m + n)) time.\n         *\n         * @param otherTree\n         *            the root of the AVL tree to merge with this one\n         * @param currentSize\n         *            the number of elements in this AVL tree\n         * @return the root of the new, merged AVL tree\n         ",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 45)",
        "(line 812,col 13)-(line 812,col 60)",
        "(line 820,col 13)-(line 868,col 13)",
        "(line 869,col 13)-(line 869,col 46)",
        "(line 871,col 13)-(line 871,col 78)",
        "(line 872,col 13)-(line 872,col 32)",
        "(line 873,col 13)-(line 873,col 55)",
        "(line 874,col 13)-(line 874,col 44)",
        "(line 875,col 13)-(line 882,col 13)",
        "(line 884,col 13)-(line 884,col 51)",
        "(line 885,col 13)-(line 885,col 45)",
        "(line 886,col 13)-(line 889,col 13)",
        "(line 890,col 13)-(line 893,col 13)",
        "(line 894,col 13)-(line 894,col 82)",
        "(line 896,col 13)-(line 896,col 29)",
        "(line 897,col 13)-(line 901,col 13)",
        "(line 902,col 13)-(line 902,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.AVLNode.toString()",
      "begin_line": 960,
      "end_line": 975,
      "comment": "\n         * Used for debugging.\n         ",
      "child_ranges": [
        "(line 962,col 13)-(line 974,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TreeListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cE\u003e"
      ],
      "begin_line": 981,
      "end_line": 1118,
      "comment": "\n     * A list iterator over the linked list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 983,
      "end_line": 983,
      "comment": " The parent list "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": "\n         * Cache of the next node that will be returned by {@link #next()}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 991,
      "end_line": 991,
      "comment": "\n         * The index of the next node to be returned.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": "\n         * Cache of the last node that was returned by {@link #next()}\n         * or {@link #previous()}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "currentIndex"
      ],
      "begin_line": 1000,
      "end_line": 1000,
      "comment": "\n         * The index of the last node that was returned.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1007,
      "end_line": 1007,
      "comment": "\n         * The modification count that the list is expected to have. If the list\n         * doesn\u0027t have this count, then a\n         * {@link java.util.ConcurrentModificationException} may be thrown by\n         * the operations.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.TreeListIterator(org.apache.commons.collections4.list.TreeList\u003cE\u003e, int)",
      "begin_line": 1015,
      "end_line": 1022,
      "comment": "\n         * Create a ListIterator for a list.\n         *\n         * @param parent  the parent list\n         * @param fromIndex  the index to start at\n         ",
      "child_ranges": [
        "(line 1016,col 13)-(line 1016,col 20)",
        "(line 1017,col 13)-(line 1017,col 33)",
        "(line 1018,col 13)-(line 1018,col 52)",
        "(line 1019,col 13)-(line 1019,col 80)",
        "(line 1020,col 13)-(line 1020,col 39)",
        "(line 1021,col 13)-(line 1021,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.checkModCount()",
      "begin_line": 1031,
      "end_line": 1035,
      "comment": "\n         * Checks the modification count of the list is the value that this\n         * object expects.\n         *\n         * @throws ConcurrentModificationException If the list\u0027s modification\n         * count isn\u0027t the value that was expected.\n         ",
      "child_ranges": [
        "(line 1032,col 13)-(line 1034,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.hasNext()",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 13)-(line 1038,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.next()",
      "begin_line": 1041,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 28)",
        "(line 1043,col 13)-(line 1045,col 13)",
        "(line 1046,col 13)-(line 1048,col 13)",
        "(line 1049,col 13)-(line 1049,col 44)",
        "(line 1050,col 13)-(line 1050,col 27)",
        "(line 1051,col 13)-(line 1051,col 39)",
        "(line 1052,col 13)-(line 1052,col 31)",
        "(line 1053,col 13)-(line 1053,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.hasPrevious()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 13)-(line 1057,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.previous()",
      "begin_line": 1060,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 13)-(line 1061,col 28)",
        "(line 1062,col 13)-(line 1064,col 13)",
        "(line 1065,col 13)-(line 1069,col 13)",
        "(line 1070,col 13)-(line 1070,col 44)",
        "(line 1071,col 13)-(line 1071,col 27)",
        "(line 1072,col 13)-(line 1072,col 39)",
        "(line 1073,col 13)-(line 1073,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.nextIndex()",
      "begin_line": 1076,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 13)-(line 1077,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.previousIndex()",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 13)-(line 1081,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.remove()",
      "begin_line": 1084,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1085,col 13)-(line 1085,col 28)",
        "(line 1086,col 13)-(line 1088,col 13)",
        "(line 1089,col 13)-(line 1089,col 40)",
        "(line 1090,col 13)-(line 1093,col 13)",
        "(line 1096,col 13)-(line 1096,col 24)",
        "(line 1097,col 13)-(line 1097,col 27)",
        "(line 1098,col 13)-(line 1098,col 30)",
        "(line 1099,col 13)-(line 1099,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.set(E)",
      "begin_line": 1102,
      "end_line": 1108,
      "comment": "",
      "child_ranges": [
        "(line 1103,col 13)-(line 1103,col 28)",
        "(line 1104,col 13)-(line 1106,col 13)",
        "(line 1107,col 13)-(line 1107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.TreeList.TreeListIterator.add(E)",
      "begin_line": 1110,
      "end_line": 1117,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 13)-(line 1111,col 28)",
        "(line 1112,col 13)-(line 1112,col 39)",
        "(line 1113,col 13)-(line 1113,col 27)",
        "(line 1114,col 13)-(line 1114,col 30)",
        "(line 1115,col 13)-(line 1115,col 24)",
        "(line 1116,col 13)-(line 1116,col 31)"
      ]
    }
  ]
}