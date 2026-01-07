{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/list/AbstractLinkedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinkedList",
      "is_interface": false,
      "parent_types": [
        "java.util.List\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 1099,
      "comment": "\n * An abstract implementation of a linked list which provides numerous points for\n * subclasses to override.\n * \u003cp\u003e\n * Overridable methods are provided to change the storage node and to change how\n * nodes are added to and removed. Hopefully, all you need for unusual subclasses\n * is here.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * A {@link Node} which indicates the start and end of the list and does not\n     * hold a value. The value of \u003ccode\u003enext\u003c/code\u003e is the first item in the\n     * list. The value of of \u003ccode\u003eprevious\u003c/code\u003e is the last item in the list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The size of the list "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Modification count for iterators "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.AbstractLinkedList()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructor that does nothing intended for deserialization.\n     * \u003cp\u003e\n     * If this constructor is used by a serializable subclass then the init()\n     * method must be called.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.AbstractLinkedList(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Constructs a list copying data from the specified collection.\n     *\n     * @param coll  the collection to copy\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)",
        "(line 87,col 9)-(line 87,col 15)",
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.init()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * The equivalent of a default constructor, broken out so it can be called\n     * by any constructor and by \u003ccode\u003ereadObject\u003c/code\u003e.\n     * Subclasses which override this method should make sure they call super,\n     * so the list is initialised properly.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.size()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.isEmpty()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.get(int)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 51)",
        "(line 116,col 9)-(line 116,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.iterator()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.listIterator()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.listIterator(int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.indexOf(java.lang.Object)",
      "begin_line": 138,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 18)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.lastIndexOf(java.lang.Object)",
      "begin_line": 150,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.contains(java.lang.Object)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 167,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toArray()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toArray(T[])",
      "begin_line": 184,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 18)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.subList(int, int)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Gets a sublist of the main list.\n     *\n     * @param fromIndexInclusive  the index to start from\n     * @param toIndexExclusive  the index to end at\n     * @return the new sublist\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.add(E)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 23)",
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.add(int, E)",
      "begin_line": 224,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 50)",
        "(line 227,col 9)-(line 227,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 235,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 50)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.remove(int)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 51)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.remove(java.lang.Object)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 274,
      "end_line": 285,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this list, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s contained, it\u0027s removed\n     * from this list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 42)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 298,
      "end_line": 309,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this list, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s not contained, it\u0027s removed\n     * from this list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 301,col 42)",
        "(line 302,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.set(int, E)",
      "begin_line": 311,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 316,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.clear()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getFirst()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 41)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getLast()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 45)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addFirst(E)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addLast(E)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeFirst()",
      "begin_line": 352,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 41)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 43)",
        "(line 358,col 9)-(line 358,col 25)",
        "(line 359,col 9)-(line 359,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeLast()",
      "begin_line": 362,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 45)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 43)",
        "(line 368,col 9)-(line 368,col 25)",
        "(line 369,col 9)-(line 369,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.equals(java.lang.Object)",
      "begin_line": 373,
      "end_line": 395,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 44)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 51)",
        "(line 386,col 9)-(line 386,col 57)",
        "(line 387,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.hashCode()",
      "begin_line": 397,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 25)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toString()",
      "begin_line": 406,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 65)",
        "(line 412,col 9)-(line 412,col 24)",
        "(line 414,col 9)-(line 414,col 42)",
        "(line 415,col 9)-(line 415,col 39)",
        "(line 416,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 24)",
        "(line 425,col 9)-(line 425,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.isEqualValue(java.lang.Object, java.lang.Object)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Compares two values for equals.\n     * This implementation uses the equals method.\n     * Subclasses can override this to match differently.\n     *\n     * @param value1  the first value to compare, may be null\n     * @param value2  the second value to compare, may be null\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.updateNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Updates the node with a new value.\n     * This implementation sets the value on the node.\n     * Subclasses can override this to record the change.\n     *\n     * @param node  node to update\n     * @param value  new value of the node\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createHeaderNode()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Creates a new node with previous, next and element all set to null.\n     * This implementation creates a new empty Node.\n     * Subclasses can override this to create a different class.\n     *\n     * @return  newly created node\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createNode(E)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Creates a new node with the specified properties.\n     * This implementation creates a new Node with data.\n     * Subclasses can override this to create a different class.\n     *\n     * @param value  value of the new node\n     * @return a new node containing the value\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNodeBefore(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 488,
      "end_line": 491,
      "comment": "\n     * Creates a new node with the specified object as its\n     * \u003ccode\u003evalue\u003c/code\u003e and inserts it before \u003ccode\u003enode\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation uses {@link #createNode(Object)} and\n     * {@link #addNode(AbstractLinkedList.Node,AbstractLinkedList.Node)}.\n     *\n     * @param node  node to insert before\n     * @param value  value of the newly added node\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 50)",
        "(line 490,col 9)-(line 490,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNodeAfter(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * Creates a new node with the specified object as its\n     * \u003ccode\u003evalue\u003c/code\u003e and inserts it after \u003ccode\u003enode\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation uses {@link #createNode(Object)} and\n     * {@link #addNode(AbstractLinkedList.Node,AbstractLinkedList.Node)}.\n     *\n     * @param node  node to insert after\n     * @param value  value of the newly added node\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 50)",
        "(line 506,col 9)-(line 506,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 516,
      "end_line": 523,
      "comment": "\n     * Inserts a new node into the list.\n     *\n     * @param nodeToInsert  new node to insert\n     * @param insertBeforeNode  node to insert before\n     * @throws NullPointerException if either node is null\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 45)",
        "(line 518,col 9)-(line 518,col 58)",
        "(line 519,col 9)-(line 519,col 54)",
        "(line 520,col 9)-(line 520,col 49)",
        "(line 521,col 9)-(line 521,col 15)",
        "(line 522,col 9)-(line 522,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 531,
      "end_line": 536,
      "comment": "\n     * Removes the specified node from the list.\n     *\n     * @param node  the node to remove\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 39)",
        "(line 533,col 9)-(line 533,col 43)",
        "(line 534,col 9)-(line 534,col 15)",
        "(line 535,col 9)-(line 535,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeAllNodes()",
      "begin_line": 541,
      "end_line": 546,
      "comment": "\n     * Removes all nodes by resetting the circular list marker.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 29)",
        "(line 543,col 9)-(line 543,col 33)",
        "(line 544,col 9)-(line 544,col 17)",
        "(line 545,col 9)-(line 545,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getNode(int, boolean)",
      "begin_line": 559,
      "end_line": 590,
      "comment": "\n     * Gets the node at a particular index.\n     *\n     * @param index  the index, starting from 0\n     * @param endMarkerAllowed  whether or not the end marker can be returned if\n     * startIndex is set to the list\u0027s size\n     * @return the node at the given index\n     * @throws IndexOutOfBoundsException if the index is less than 0; equal to\n     * the size of the list and endMakerAllowed is false; or greater than the\n     * size of the list\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 573,col 9)",
        "(line 575,col 9)-(line 575,col 21)",
        "(line 576,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createSubListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n     * Creates an iterator for the sublist.\n     *\n     * @param subList  the sublist to get an iterator for\n     * @return a new iterator on the given sublist\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createSubListListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Creates a list iterator for the sublist.\n     *\n     * @param subList  the sublist to get an iterator for\n     * @param fromIndex  the index to start from, relative to the sublist\n     * @return a new list iterator on the given sublist\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n     * Serializes the data held in this object to the stream specified.\n     * \u003cp\u003e\n     * The first serializable subclass must call this method from\n     * \u003ccode\u003ewriteObject\u003c/code\u003e.\n     *\n     * @param outputStream  the stream to write the object to\n     * @throws IOException  if anything goes wrong\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 38)",
        "(line 627,col 9)-(line 629,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 642,
      "end_line": 649,
      "comment": "\n     * Deserializes the data held in this object to the stream specified.\n     * \u003cp\u003e\n     * The first serializable subclass must call this method from\n     * \u003ccode\u003ereadObject\u003c/code\u003e.\n     *\n     * @param inputStream  the stream to read the object from\n     * @throws IOException  if any error occurs while reading from the stream\n     * @throws ClassNotFoundException  if a class read from the stream can not be loaded\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 15)",
        "(line 645,col 9)-(line 645,col 47)",
        "(line 646,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 658,
      "end_line": 759,
      "comment": "\n     * A node within the linked list.\n     * \u003cp\u003e\n     * From Commons Collections 3.1, all access to the \u003ccode\u003evalue\u003c/code\u003e property\n     * is via the methods on this class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": " A pointer to the node before this node "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": " A pointer to the node after this node "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 665,
      "end_line": 665,
      "comment": " The object contained within this node "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node()",
      "begin_line": 670,
      "end_line": 674,
      "comment": "\n         * Constructs a new header node.\n         ",
      "child_ranges": [
        "(line 671,col 13)-(line 671,col 20)",
        "(line 672,col 13)-(line 672,col 28)",
        "(line 673,col 13)-(line 673,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node(E)",
      "begin_line": 681,
      "end_line": 684,
      "comment": "\n         * Constructs a new node.\n         *\n         * @param value  the value to store\n         ",
      "child_ranges": [
        "(line 682,col 13)-(line 682,col 20)",
        "(line 683,col 13)-(line 683,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 693,
      "end_line": 698,
      "comment": "\n         * Constructs a new node.\n         *\n         * @param previous  the previous node in the list\n         * @param next  the next node in the list\n         * @param value  the value to store\n         ",
      "child_ranges": [
        "(line 694,col 13)-(line 694,col 20)",
        "(line 695,col 13)-(line 695,col 37)",
        "(line 696,col 13)-(line 696,col 29)",
        "(line 697,col 13)-(line 697,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getValue()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n         * Gets the value of the node.\n         *\n         * @return the value\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 707,col 13)-(line 707,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setValue(E)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n         * Sets the value of the node.\n         *\n         * @param value  the value\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 717,col 13)-(line 717,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getPreviousNode()",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n         * Gets the previous node.\n         *\n         * @return the previous node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 727,col 13)-(line 727,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setPreviousNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n         * Sets the previous node.\n         *\n         * @param previous  the previous node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 737,col 13)-(line 737,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getNextNode()",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\n         * Gets the next node.\n         *\n         * @return the next node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 747,col 13)-(line 747,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setNextNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n         * Sets the next node.\n         *\n         * @param next  the next node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 757,col 13)-(line 757,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cE\u003e"
      ],
      "begin_line": 765,
      "end_line": 920,
      "comment": "\n     * A list iterator over the linked list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": " The parent list "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": "\n         * The node that will be returned by {@link #next()}. If this is equal\n         * to {@link AbstractLinkedList#header} then there are no more values to return.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": "\n         * The index of {@link #next}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 789,
      "end_line": 789,
      "comment": "\n         * The last node that was returned by {@link #next()} or {@link\n         * #previous()}. Set to \u003ccode\u003enull\u003c/code\u003e if {@link #next()} or {@link\n         * #previous()} haven\u0027t been called, or if the node has been removed\n         * with {@link #remove()} or a new node added with {@link #add(Object)}.\n         * Should be accessed through {@link #getLastNodeReturned()} to enforce\n         * this behaviour.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 797,
      "end_line": 797,
      "comment": "\n         * The modification count that the list is expected to have. If the list\n         * doesn\u0027t have this count, then a\n         * {@link java.util.ConcurrentModificationException} may be thrown by\n         * the operations.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.LinkedListIterator(org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e, int)",
      "begin_line": 806,
      "end_line": 813,
      "comment": "\n         * Create a ListIterator for a list.\n         *\n         * @param parent  the parent list\n         * @param fromIndex  the index to start at\n         * @throws IndexOutOfBoundsException if fromIndex is less than 0 or greater than the size of the list\n         ",
      "child_ranges": [
        "(line 808,col 13)-(line 808,col 20)",
        "(line 809,col 13)-(line 809,col 33)",
        "(line 810,col 13)-(line 810,col 52)",
        "(line 811,col 13)-(line 811,col 56)",
        "(line 812,col 13)-(line 812,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.checkModCount()",
      "begin_line": 822,
      "end_line": 826,
      "comment": "\n         * Checks the modification count of the list is the value that this\n         * object expects.\n         *\n         * @throws ConcurrentModificationException If the list\u0027s modification\n         * count isn\u0027t the value that was expected.\n         ",
      "child_ranges": [
        "(line 823,col 13)-(line 825,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.getLastNodeReturned()",
      "begin_line": 835,
      "end_line": 840,
      "comment": "\n         * Gets the last node returned.\n         *\n         * @return the last node returned\n         * @throws IllegalStateException If {@link #next()} or {@link #previous()} haven\u0027t been called,\n         * or if the node has been removed with {@link #remove()} or a new node added with {@link #add(Object)}.\n         ",
      "child_ranges": [
        "(line 836,col 13)-(line 838,col 13)",
        "(line 839,col 13)-(line 839,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.hasNext()",
      "begin_line": 842,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 844,col 13)-(line 844,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.next()",
      "begin_line": 847,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 28)",
        "(line 850,col 13)-(line 852,col 13)",
        "(line 853,col 13)-(line 853,col 44)",
        "(line 854,col 13)-(line 854,col 27)",
        "(line 855,col 13)-(line 855,col 29)",
        "(line 856,col 13)-(line 856,col 24)",
        "(line 857,col 13)-(line 857,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.hasPrevious()",
      "begin_line": 860,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 862,col 13)-(line 862,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.previous()",
      "begin_line": 865,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 867,col 13)-(line 867,col 28)",
        "(line 868,col 13)-(line 870,col 13)",
        "(line 871,col 13)-(line 871,col 33)",
        "(line 872,col 13)-(line 872,col 44)",
        "(line 873,col 13)-(line 873,col 27)",
        "(line 874,col 13)-(line 874,col 24)",
        "(line 875,col 13)-(line 875,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.nextIndex()",
      "begin_line": 878,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 880,col 13)-(line 880,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.previousIndex()",
      "begin_line": 883,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 886,col 13)-(line 886,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.remove()",
      "begin_line": 889,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 891,col 13)-(line 891,col 28)",
        "(line 892,col 13)-(line 900,col 13)",
        "(line 901,col 13)-(line 901,col 27)",
        "(line 902,col 13)-(line 902,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.set(E)",
      "begin_line": 905,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 907,col 13)-(line 907,col 28)",
        "(line 908,col 13)-(line 908,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.add(E)",
      "begin_line": 911,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 913,col 13)-(line 913,col 28)",
        "(line 914,col 13)-(line 914,col 44)",
        "(line 915,col 13)-(line 915,col 27)",
        "(line 916,col 13)-(line 916,col 24)",
        "(line 917,col 13)-(line 917,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedSubListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator\u003cE\u003e"
      ],
      "begin_line": 926,
      "end_line": 964,
      "comment": "\n     * A list iterator over the linked sub list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sub"
      ],
      "begin_line": 929,
      "end_line": 929,
      "comment": " The parent list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.LinkedSubListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 931,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 932,col 13)-(line 932,col 55)",
        "(line 933,col 13)-(line 933,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.hasNext()",
      "begin_line": 936,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 13)-(line 938,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.hasPrevious()",
      "begin_line": 941,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 13)-(line 943,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.nextIndex()",
      "begin_line": 946,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 948,col 13)-(line 948,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.add(E)",
      "begin_line": 951,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 953,col 13)-(line 953,col 27)",
        "(line 954,col 13)-(line 954,col 51)",
        "(line 955,col 13)-(line 955,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.remove()",
      "begin_line": 958,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 960,col 13)-(line 960,col 27)",
        "(line 961,col 13)-(line 961,col 51)",
        "(line 962,col 13)-(line 962,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedSubList",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cE\u003e"
      ],
      "begin_line": 970,
      "end_line": 1097,
      "comment": "\n     * The sublist implementation for AbstractLinkedList.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": " The main list "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " Offset from the main list "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " Sublist size "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " Sublist modCount "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.LinkedSubList(org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e, int, int)",
      "begin_line": 980,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 981,col 13)-(line 983,col 13)",
        "(line 984,col 13)-(line 986,col 13)",
        "(line 987,col 13)-(line 989,col 13)",
        "(line 990,col 13)-(line 990,col 33)",
        "(line 991,col 13)-(line 991,col 36)",
        "(line 992,col 13)-(line 992,col 44)",
        "(line 993,col 13)-(line 993,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.size()",
      "begin_line": 996,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 998,col 13)-(line 998,col 28)",
        "(line 999,col 13)-(line 999,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.get(int)",
      "begin_line": 1002,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 13)-(line 1004,col 36)",
        "(line 1005,col 13)-(line 1005,col 28)",
        "(line 1006,col 13)-(line 1006,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.add(int, E)",
      "begin_line": 1009,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 13)-(line 1011,col 40)",
        "(line 1012,col 13)-(line 1012,col 28)",
        "(line 1013,col 13)-(line 1013,col 44)",
        "(line 1014,col 13)-(line 1014,col 47)",
        "(line 1015,col 13)-(line 1015,col 19)",
        "(line 1016,col 13)-(line 1016,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.remove(int)",
      "begin_line": 1019,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 13)-(line 1021,col 36)",
        "(line 1022,col 13)-(line 1022,col 28)",
        "(line 1023,col 13)-(line 1023,col 59)",
        "(line 1024,col 13)-(line 1024,col 47)",
        "(line 1025,col 13)-(line 1025,col 19)",
        "(line 1026,col 13)-(line 1026,col 42)",
        "(line 1027,col 13)-(line 1027,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 13)-(line 1032,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 1035,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 13)-(line 1037,col 40)",
        "(line 1038,col 13)-(line 1038,col 42)",
        "(line 1039,col 13)-(line 1041,col 13)",
        "(line 1043,col 13)-(line 1043,col 28)",
        "(line 1044,col 13)-(line 1044,col 48)",
        "(line 1045,col 13)-(line 1045,col 47)",
        "(line 1046,col 13)-(line 1046,col 26)",
        "(line 1047,col 13)-(line 1047,col 42)",
        "(line 1048,col 13)-(line 1048,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.set(int, E)",
      "begin_line": 1051,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 13)-(line 1053,col 36)",
        "(line 1054,col 13)-(line 1054,col 28)",
        "(line 1055,col 13)-(line 1055,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.clear()",
      "begin_line": 1058,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 13)-(line 1060,col 28)",
        "(line 1061,col 13)-(line 1061,col 46)",
        "(line 1062,col 13)-(line 1065,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.iterator()",
      "begin_line": 1068,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1070,col 13)-(line 1070,col 28)",
        "(line 1071,col 13)-(line 1071,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.listIterator(int)",
      "begin_line": 1074,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 13)-(line 1076,col 40)",
        "(line 1077,col 13)-(line 1077,col 28)",
        "(line 1078,col 13)-(line 1078,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.subList(int, int)",
      "begin_line": 1081,
      "end_line": 1084,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 13)-(line 1083,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.rangeCheck(int, int)",
      "begin_line": 1086,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 13)-(line 1089,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.checkModCount()",
      "begin_line": 1092,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 13)-(line 1095,col 13)"
      ]
    }
  ]
}