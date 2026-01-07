{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/list/AbstractLinkedList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinkedList",
      "is_interface": false,
      "parent_types": [
        "java.util.List\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 1067,
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
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.isEmpty()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.get(int)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.iterator()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.listIterator()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.listIterator(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.indexOf(java.lang.Object)",
      "begin_line": 132,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 18)",
        "(line 134,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.lastIndexOf(java.lang.Object)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.contains(java.lang.Object)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 158,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toArray()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toArray(T[])",
      "begin_line": 173,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 18)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.subList(int, int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Gets a sublist of the main list.\n     *\n     * @param fromIndexInclusive  the index to start from\n     * @param toIndexExclusive  the index to end at\n     * @return the new sublist\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.add(E)",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 23)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.add(int, E)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 50)",
        "(line 212,col 9)-(line 212,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 219,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.remove(int)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 51)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.remove(java.lang.Object)",
      "begin_line": 236,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 255,
      "end_line": 265,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this list, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s contained, it\u0027s removed\n     * from this list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 258,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 278,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this list, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s not contained, it\u0027s removed\n     * from this list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.set(int, E)",
      "begin_line": 290,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 32)",
        "(line 294,col 9)-(line 294,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.clear()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getFirst()",
      "begin_line": 303,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 41)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getLast()",
      "begin_line": 311,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 45)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addFirst(E)",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 32)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addLast(E)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 33)",
        "(line 326,col 9)-(line 326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeFirst()",
      "begin_line": 329,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 43)",
        "(line 335,col 9)-(line 335,col 25)",
        "(line 336,col 9)-(line 336,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeLast()",
      "begin_line": 339,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 45)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 43)",
        "(line 345,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 346,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 372,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 44)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 363,col 9)-(line 363,col 57)",
        "(line 364,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.hashCode()",
      "begin_line": 374,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 25)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.toString()",
      "begin_line": 383,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 65)",
        "(line 389,col 9)-(line 389,col 24)",
        "(line 391,col 9)-(line 391,col 42)",
        "(line 392,col 9)-(line 392,col 39)",
        "(line 393,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 24)",
        "(line 402,col 9)-(line 402,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.isEqualValue(java.lang.Object, java.lang.Object)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Compares two values for equals.\n     * This implementation uses the equals method.\n     * Subclasses can override this to match differently.\n     *\n     * @param value1  the first value to compare, may be null\n     * @param value2  the second value to compare, may be null\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.updateNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Updates the node with a new value.\n     * This implementation sets the value on the node.\n     * Subclasses can override this to record the change.\n     *\n     * @param node  node to update\n     * @param value  new value of the node\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createHeaderNode()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Creates a new node with previous, next and element all set to null.\n     * This implementation creates a new empty Node.\n     * Subclasses can override this to create a different class.\n     *\n     * @return  newly created node\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createNode(E)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Creates a new node with the specified properties.\n     * This implementation creates a new Node with data.\n     * Subclasses can override this to create a different class.\n     *\n     * @param value  value of the new node\n     * @return a new node containing the value\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNodeBefore(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * Creates a new node with the specified object as its\n     * \u003ccode\u003evalue\u003c/code\u003e and inserts it before \u003ccode\u003enode\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation uses {@link #createNode(Object)} and\n     * {@link #addNode(AbstractLinkedList.Node,AbstractLinkedList.Node)}.\n     *\n     * @param node  node to insert before\n     * @param value  value of the newly added node\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 50)",
        "(line 467,col 9)-(line 467,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNodeAfter(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\n     * Creates a new node with the specified object as its\n     * \u003ccode\u003evalue\u003c/code\u003e and inserts it after \u003ccode\u003enode\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation uses {@link #createNode(Object)} and\n     * {@link #addNode(AbstractLinkedList.Node,AbstractLinkedList.Node)}.\n     *\n     * @param node  node to insert after\n     * @param value  value of the newly added node\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 50)",
        "(line 483,col 9)-(line 483,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.addNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 493,
      "end_line": 500,
      "comment": "\n     * Inserts a new node into the list.\n     *\n     * @param nodeToInsert  new node to insert\n     * @param insertBeforeNode  node to insert before\n     * @throws NullPointerException if either node is null\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 45)",
        "(line 495,col 9)-(line 495,col 58)",
        "(line 496,col 9)-(line 496,col 54)",
        "(line 497,col 9)-(line 497,col 49)",
        "(line 498,col 9)-(line 498,col 15)",
        "(line 499,col 9)-(line 499,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 508,
      "end_line": 513,
      "comment": "\n     * Removes the specified node from the list.\n     *\n     * @param node  the node to remove\n     * @throws NullPointerException if \u003ccode\u003enode\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 39)",
        "(line 510,col 9)-(line 510,col 43)",
        "(line 511,col 9)-(line 511,col 15)",
        "(line 512,col 9)-(line 512,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.removeAllNodes()",
      "begin_line": 518,
      "end_line": 523,
      "comment": "\n     * Removes all nodes by resetting the circular list marker.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 29)",
        "(line 520,col 9)-(line 520,col 33)",
        "(line 521,col 9)-(line 521,col 17)",
        "(line 522,col 9)-(line 522,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.getNode(int, boolean)",
      "begin_line": 536,
      "end_line": 567,
      "comment": "\n     * Gets the node at a particular index.\n     *\n     * @param index  the index, starting from 0\n     * @param endMarkerAllowed  whether or not the end marker can be returned if\n     * startIndex is set to the list\u0027s size\n     * @return the node at the given index\n     * @throws IndexOutOfBoundsException if the index is less than 0; equal to\n     * the size of the list and endMakerAllowed is false; or greater than the\n     * size of the list\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 21)",
        "(line 553,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createSubListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "\n     * Creates an iterator for the sublist.\n     *\n     * @param subList  the sublist to get an iterator for\n     * @return a new iterator on the given sublist\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.createSubListListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Creates a list iterator for the sublist.\n     *\n     * @param subList  the sublist to get an iterator for\n     * @param fromIndex  the index to start from, relative to the sublist\n     * @return a new list iterator on the given sublist\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 601,
      "end_line": 607,
      "comment": "\n     * Serializes the data held in this object to the stream specified.\n     * \u003cp\u003e\n     * The first serializable subclass must call this method from\n     * \u003ccode\u003ewriteObject\u003c/code\u003e.\n     *\n     * @param outputStream  the stream to write the object to\n     * @throws IOException  if anything goes wrong\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 38)",
        "(line 604,col 9)-(line 606,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 619,
      "end_line": 626,
      "comment": "\n     * Deserializes the data held in this object to the stream specified.\n     * \u003cp\u003e\n     * The first serializable subclass must call this method from\n     * \u003ccode\u003ereadObject\u003c/code\u003e.\n     *\n     * @param inputStream  the stream to read the object from\n     * @throws IOException  if any error occurs while reading from the stream\n     * @throws ClassNotFoundException  if a class read from the stream can not be loaded\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 15)",
        "(line 622,col 9)-(line 622,col 47)",
        "(line 623,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 635,
      "end_line": 736,
      "comment": "\n     * A node within the linked list.\n     * \u003cp\u003e\n     * From Commons Collections 3.1, all access to the \u003ccode\u003evalue\u003c/code\u003e property\n     * is via the methods on this class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": " A pointer to the node before this node "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 640,
      "end_line": 640,
      "comment": " A pointer to the node after this node "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": " The object contained within this node "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node()",
      "begin_line": 647,
      "end_line": 651,
      "comment": "\n         * Constructs a new header node.\n         ",
      "child_ranges": [
        "(line 648,col 13)-(line 648,col 20)",
        "(line 649,col 13)-(line 649,col 28)",
        "(line 650,col 13)-(line 650,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node(E)",
      "begin_line": 658,
      "end_line": 661,
      "comment": "\n         * Constructs a new node.\n         *\n         * @param value  the value to store\n         ",
      "child_ranges": [
        "(line 659,col 13)-(line 659,col 20)",
        "(line 660,col 13)-(line 660,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.Node(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e, E)",
      "begin_line": 670,
      "end_line": 675,
      "comment": "\n         * Constructs a new node.\n         *\n         * @param previous  the previous node in the list\n         * @param next  the next node in the list\n         * @param value  the value to store\n         ",
      "child_ranges": [
        "(line 671,col 13)-(line 671,col 20)",
        "(line 672,col 13)-(line 672,col 37)",
        "(line 673,col 13)-(line 673,col 29)",
        "(line 674,col 13)-(line 674,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getValue()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n         * Gets the value of the node.\n         *\n         * @return the value\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 684,col 13)-(line 684,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setValue(E)",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n         * Sets the value of the node.\n         *\n         * @param value  the value\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 694,col 13)-(line 694,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getPreviousNode()",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\n         * Gets the previous node.\n         *\n         * @return the previous node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 704,col 13)-(line 704,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setPreviousNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 713,
      "end_line": 715,
      "comment": "\n         * Sets the previous node.\n         *\n         * @param previous  the previous node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 714,col 13)-(line 714,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.getNextNode()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n         * Gets the next node.\n         *\n         * @return the next node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 724,col 13)-(line 724,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.Node.setNextNode(org.apache.commons.collections4.list.AbstractLinkedList.Node\u003cE\u003e)",
      "begin_line": 733,
      "end_line": 735,
      "comment": "\n         * Sets the next node.\n         *\n         * @param next  the next node\n         * @since 3.1\n         ",
      "child_ranges": [
        "(line 734,col 13)-(line 734,col 29)"
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
      "begin_line": 742,
      "end_line": 888,
      "comment": "\n     * A list iterator over the linked list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": " The parent list "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": "\n         * The node that will be returned by {@link #next()}. If this is equal\n         * to {@link AbstractLinkedList#header} then there are no more values to return.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 756,
      "end_line": 756,
      "comment": "\n         * The index of {@link #next}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 766,
      "end_line": 766,
      "comment": "\n         * The last node that was returned by {@link #next()} or {@link\n         * #previous()}. Set to \u003ccode\u003enull\u003c/code\u003e if {@link #next()} or {@link\n         * #previous()} haven\u0027t been called, or if the node has been removed\n         * with {@link #remove()} or a new node added with {@link #add(Object)}.\n         * Should be accessed through {@link #getLastNodeReturned()} to enforce\n         * this behaviour.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": "\n         * The modification count that the list is expected to have. If the list\n         * doesn\u0027t have this count, then a\n         * {@link java.util.ConcurrentModificationException} may be thrown by\n         * the operations.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.LinkedListIterator(org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e, int)",
      "begin_line": 783,
      "end_line": 790,
      "comment": "\n         * Create a ListIterator for a list.\n         *\n         * @param parent  the parent list\n         * @param fromIndex  the index to start at\n         * @throws IndexOutOfBoundsException if fromIndex is less than 0 or greater than the size of the list\n         ",
      "child_ranges": [
        "(line 785,col 13)-(line 785,col 20)",
        "(line 786,col 13)-(line 786,col 33)",
        "(line 787,col 13)-(line 787,col 52)",
        "(line 788,col 13)-(line 788,col 56)",
        "(line 789,col 13)-(line 789,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.checkModCount()",
      "begin_line": 799,
      "end_line": 803,
      "comment": "\n         * Checks the modification count of the list is the value that this\n         * object expects.\n         *\n         * @throws ConcurrentModificationException If the list\u0027s modification\n         * count isn\u0027t the value that was expected.\n         ",
      "child_ranges": [
        "(line 800,col 13)-(line 802,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.getLastNodeReturned()",
      "begin_line": 812,
      "end_line": 817,
      "comment": "\n         * Gets the last node returned.\n         *\n         * @return the last node returned\n         * @throws IllegalStateException If {@link #next()} or {@link #previous()} haven\u0027t been called,\n         * or if the node has been removed with {@link #remove()} or a new node added with {@link #add(Object)}.\n         ",
      "child_ranges": [
        "(line 813,col 13)-(line 815,col 13)",
        "(line 816,col 13)-(line 816,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.hasNext()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 820,col 13)-(line 820,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.next()",
      "begin_line": 823,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 824,col 13)-(line 824,col 28)",
        "(line 825,col 13)-(line 827,col 13)",
        "(line 828,col 13)-(line 828,col 44)",
        "(line 829,col 13)-(line 829,col 27)",
        "(line 830,col 13)-(line 830,col 29)",
        "(line 831,col 13)-(line 831,col 24)",
        "(line 832,col 13)-(line 832,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.hasPrevious()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 836,col 13)-(line 836,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.previous()",
      "begin_line": 839,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 840,col 13)-(line 840,col 28)",
        "(line 841,col 13)-(line 843,col 13)",
        "(line 844,col 13)-(line 844,col 33)",
        "(line 845,col 13)-(line 845,col 44)",
        "(line 846,col 13)-(line 846,col 27)",
        "(line 847,col 13)-(line 847,col 24)",
        "(line 848,col 13)-(line 848,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.nextIndex()",
      "begin_line": 851,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 852,col 13)-(line 852,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.previousIndex()",
      "begin_line": 855,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 857,col 13)-(line 857,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.remove()",
      "begin_line": 860,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 28)",
        "(line 862,col 13)-(line 870,col 13)",
        "(line 871,col 13)-(line 871,col 27)",
        "(line 872,col 13)-(line 872,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.set(E)",
      "begin_line": 875,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 28)",
        "(line 877,col 13)-(line 877,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator.add(E)",
      "begin_line": 880,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 881,col 13)-(line 881,col 28)",
        "(line 882,col 13)-(line 882,col 44)",
        "(line 883,col 13)-(line 883,col 27)",
        "(line 884,col 13)-(line 884,col 24)",
        "(line 885,col 13)-(line 885,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedSubListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator\u003cE\u003e"
      ],
      "begin_line": 894,
      "end_line": 932,
      "comment": "\n     * A list iterator over the linked sub list.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sub"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": " The parent list "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.LinkedSubListIterator(org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList\u003cE\u003e, int)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 900,col 13)-(line 900,col 55)",
        "(line 901,col 13)-(line 901,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.hasNext()",
      "begin_line": 904,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 906,col 13)-(line 906,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.hasPrevious()",
      "begin_line": 909,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 911,col 13)-(line 911,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.nextIndex()",
      "begin_line": 914,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 916,col 13)-(line 916,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.add(E)",
      "begin_line": 919,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 921,col 13)-(line 921,col 27)",
        "(line 922,col 13)-(line 922,col 51)",
        "(line 923,col 13)-(line 923,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubListIterator.remove()",
      "begin_line": 926,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 928,col 13)-(line 928,col 27)",
        "(line 929,col 13)-(line 929,col 51)",
        "(line 930,col 13)-(line 930,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedSubList",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cE\u003e"
      ],
      "begin_line": 938,
      "end_line": 1065,
      "comment": "\n     * The sublist implementation for AbstractLinkedList.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": " The main list "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 942,
      "end_line": 942,
      "comment": " Offset from the main list "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 944,
      "end_line": 944,
      "comment": " Sublist size "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": " Sublist modCount "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.LinkedSubList(org.apache.commons.collections4.list.AbstractLinkedList\u003cE\u003e, int, int)",
      "begin_line": 948,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 949,col 13)-(line 951,col 13)",
        "(line 952,col 13)-(line 954,col 13)",
        "(line 955,col 13)-(line 957,col 13)",
        "(line 958,col 13)-(line 958,col 33)",
        "(line 959,col 13)-(line 959,col 36)",
        "(line 960,col 13)-(line 960,col 44)",
        "(line 961,col 13)-(line 961,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.size()",
      "begin_line": 964,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 966,col 13)-(line 966,col 28)",
        "(line 967,col 13)-(line 967,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.get(int)",
      "begin_line": 970,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 972,col 13)-(line 972,col 36)",
        "(line 973,col 13)-(line 973,col 28)",
        "(line 974,col 13)-(line 974,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.add(int, E)",
      "begin_line": 977,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 40)",
        "(line 980,col 13)-(line 980,col 28)",
        "(line 981,col 13)-(line 981,col 44)",
        "(line 982,col 13)-(line 982,col 47)",
        "(line 983,col 13)-(line 983,col 19)",
        "(line 984,col 13)-(line 984,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.remove(int)",
      "begin_line": 987,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 989,col 13)-(line 989,col 36)",
        "(line 990,col 13)-(line 990,col 28)",
        "(line 991,col 13)-(line 991,col 59)",
        "(line 992,col 13)-(line 992,col 47)",
        "(line 993,col 13)-(line 993,col 19)",
        "(line 994,col 13)-(line 994,col 42)",
        "(line 995,col 13)-(line 995,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 998,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 13)-(line 1000,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 1003,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 13)-(line 1005,col 40)",
        "(line 1006,col 13)-(line 1006,col 42)",
        "(line 1007,col 13)-(line 1009,col 13)",
        "(line 1011,col 13)-(line 1011,col 28)",
        "(line 1012,col 13)-(line 1012,col 48)",
        "(line 1013,col 13)-(line 1013,col 47)",
        "(line 1014,col 13)-(line 1014,col 26)",
        "(line 1015,col 13)-(line 1015,col 42)",
        "(line 1016,col 13)-(line 1016,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.set(int, E)",
      "begin_line": 1019,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 13)-(line 1021,col 36)",
        "(line 1022,col 13)-(line 1022,col 28)",
        "(line 1023,col 13)-(line 1023,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.clear()",
      "begin_line": 1026,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 13)-(line 1028,col 28)",
        "(line 1029,col 13)-(line 1029,col 46)",
        "(line 1030,col 13)-(line 1033,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.iterator()",
      "begin_line": 1036,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 13)-(line 1038,col 28)",
        "(line 1039,col 13)-(line 1039,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.listIterator(int)",
      "begin_line": 1042,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 13)-(line 1044,col 40)",
        "(line 1045,col 13)-(line 1045,col 28)",
        "(line 1046,col 13)-(line 1046,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.subList(int, int)",
      "begin_line": 1049,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 13)-(line 1051,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.rangeCheck(int, int)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1057,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractLinkedList.LinkedSubList.checkModCount()",
      "begin_line": 1060,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 13)-(line 1063,col 13)"
      ]
    }
  ]
}