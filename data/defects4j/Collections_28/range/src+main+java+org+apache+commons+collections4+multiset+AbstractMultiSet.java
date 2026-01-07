{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multiset/AbstractMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiSet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cE\u003e",
        "org.apache.commons.collections4.MultiSet\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 509,
      "comment": "\n * Abstract implementation of the {@link MultiSet} interface to simplify the\n * creation of subclass implementations.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueSet"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " View of the elements "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " View of the entries "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractMultiSet()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.size()",
      "begin_line": 59,
      "end_line": 66,
      "comment": "\n     * Returns the number of elements in this multiset.\n     *\n     * @return current size of the multiset\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 26)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.getCount(java.lang.Object)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "\n     * Returns the number of occurrence of the given element in this multiset by\n     * iterating over its entrySet.\n     *\n     * @param object the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.setCount(E, int)",
      "begin_line": 87,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.contains(java.lang.Object)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Determines if the multiset contains the given element.\n     *\n     * @param object the object to search for\n     * @return true if the multiset contains the given element\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.iterator()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Gets an iterator over the multiset elements. Elements present in the\n     * MultiSet more than once will be returned repeatedly.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiSetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 129,
      "end_line": 180,
      "comment": "\n     * Inner class iterator for the MultiSet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryIterator"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.MultiSetIterator.MultiSetIterator(org.apache.commons.collections4.multiset.AbstractMultiSet\u003cE\u003e)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n         * Constructor.\n         *\n         * @param parent the parent multiset\n         ",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 33)",
        "(line 143,col 13)-(line 143,col 62)",
        "(line 144,col 13)-(line 144,col 32)",
        "(line 145,col 13)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.MultiSetIterator.hasNext()",
      "begin_line": 149,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.MultiSetIterator.next()",
      "begin_line": 155,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 13)-(line 160,col 13)",
        "(line 161,col 13)-(line 161,col 29)",
        "(line 162,col 13)-(line 162,col 24)",
        "(line 163,col 13)-(line 163,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.MultiSetIterator.remove()",
      "begin_line": 167,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 13)-(line 171,col 13)",
        "(line 172,col 13)-(line 172,col 49)",
        "(line 173,col 13)-(line 177,col 13)",
        "(line 178,col 13)-(line 178,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.add(E)",
      "begin_line": 183,
      "end_line": 187,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 23)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.add(E, int)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.clear()",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Clears the multiset removing all elements from the entrySet.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 54)",
        "(line 201,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.remove(java.lang.Object)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.remove(java.lang.Object, int)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 217,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 31)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.uniqueSet()",
      "begin_line": 235,
      "end_line": 241,
      "comment": "\n     * Returns a view of the unique elements of this multiset.\n     *\n     * @return the set of unique elements in this multiset\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.createUniqueSet()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Create a new view for the set of unique elements in this multiset.\n     *\n     * @return a view of the set of unique elements\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.createUniqueSetIterator()",
      "begin_line": 258,
      "end_line": 266,
      "comment": "\n     * Creates a unique set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the uniqueSet iterator\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 264,col 10)",
        "(line 265,col 9)-(line 265,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.Anonymous-5f1c144d-5a02-465e-926d-45713c8c765b.transform(org.apache.commons.collections4.MultiSet.Entry\u003cE\u003e)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.entrySet()",
      "begin_line": 273,
      "end_line": 279,
      "comment": "\n     * Returns an unmodifiable view of the entries of this multiset.\n     *\n     * @return the set of entries in this multiset\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.createEntrySet()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Create a new view for the set of entries in this multiset.\n     *\n     * @return a view of the set of entries\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.uniqueElements()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Returns the number of unique elements in this multiset.\n     *\n     * @return the number of unique elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.createEntrySetIterator()",
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @return the entrySet iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UniqueSet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cE\u003e"
      ],
      "begin_line": 309,
      "end_line": 352,
      "comment": "\n     * Inner class UniqueSet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " The parent multiset "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.UniqueSet(org.apache.commons.collections4.multiset.AbstractMultiSet\u003cE\u003e)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n         * Constructs a new unique element view of the MultiSet.\n         *\n         * @param parent  the parent MultiSet\n         ",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.iterator()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 13)-(line 325,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.contains(java.lang.Object)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.remove(java.lang.Object)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.size()",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet.clear()",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003corg.apache.commons.collections4.MultiSet.Entry\u003cE\u003e\u003e"
      ],
      "begin_line": 358,
      "end_line": 407,
      "comment": "\n     * Inner class EntrySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet.EntrySet(org.apache.commons.collections4.multiset.AbstractMultiSet\u003cE\u003e)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n         * Constructs a new view of the MultiSet.\n         *\n         * @param parent  the parent MultiSet\n         ",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet.size()",
      "begin_line": 371,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 13)-(line 373,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet.iterator()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet.contains(java.lang.Object)",
      "begin_line": 381,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 50)",
        "(line 387,col 13)-(line 387,col 54)",
        "(line 388,col 13)-(line 388,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet.remove(java.lang.Object)",
      "begin_line": 391,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 395,col 13)",
        "(line 396,col 13)-(line 396,col 50)",
        "(line 397,col 13)-(line 397,col 54)",
        "(line 398,col 13)-(line 404,col 13)",
        "(line 405,col 13)-(line 405,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiSet.Entry\u003cE\u003e"
      ],
      "begin_line": 412,
      "end_line": 439,
      "comment": "\n     * Inner class AbstractEntry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractEntry.equals(java.lang.Object)",
      "begin_line": 414,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 416,col 11)-(line 424,col 11)",
        "(line 425,col 11)-(line 425,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractEntry.hashCode()",
      "begin_line": 428,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 430,col 11)-(line 430,col 41)",
        "(line 431,col 11)-(line 431,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractEntry.toString()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * Write the multiset out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 462,
      "end_line": 471,
      "comment": "\n     * Read the multiset in using a custom routine.\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.equals(java.lang.Object)",
      "begin_line": 474,
      "end_line": 492,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 55)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.hashCode()",
      "begin_line": 494,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSet.toString()",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * Implement a toString() method suitable for debugging.\n     *\n     * @return a debugging toString\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 37)"
      ]
    }
  ]
}