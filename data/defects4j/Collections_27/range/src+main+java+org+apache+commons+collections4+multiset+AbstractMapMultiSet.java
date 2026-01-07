{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/multiset/AbstractMapMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapMultiSet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cE\u003e",
        "org.apache.commons.collections4.MultiSet\u003cE\u003e"
      ],
      "begin_line": 46,
      "end_line": 780,
      "comment": "\n * Abstract implementation of the {@link MultiSet} interface to simplify the\n * creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage. The\n * map will be used to map multiset elements to a number; the number represents the\n * number of occurrences of that element in the multiset.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The map to use to store the data "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The current total size of the multiset "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The modification count for fail fast iterators "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueSet"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " View of the elements "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " View of the entries "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.AbstractMapMultiSet()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.AbstractMapMultiSet(java.util.Map\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructor that assigns the specified Map as the backing store. The map\n     * must be empty and non-null.\n     *\n     * @param map the map to assign\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.getMap()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Utility method for implementations to access the map that backs this multiset.\n     * Not intended for interactive use outside of subclasses.\n     *\n     * @return the map being used by the Bag\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.size()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Returns the number of elements in this multiset.\n     *\n     * @return current size of the multiset\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.isEmpty()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Returns true if the underlying map is empty.\n     *\n     * @return true if multiset is empty\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.getCount(java.lang.Object)",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Returns the number of occurrence of the given element in this multiset by\n     * looking up its count in the underlying map.\n     *\n     * @param object the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.setCount(E, int)",
      "begin_line": 124,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.contains(java.lang.Object)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Determines if the multiset contains the given element by checking if the\n     * underlying map contains the element as a key.\n     *\n     * @param object the object to search for\n     * @return true if the multiset contains the given element\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.iterator()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Gets an iterator over the multiset elements. Elements present in the\n     * MultiSet more than once will be returned repeatedly.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiSetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 167,
      "end_line": 227,
      "comment": "\n     * Inner class iterator for the MultiSet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryIterator"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mods"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetIterator.MultiSetIterator(org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n         * Constructor.\n         *\n         * @param parent the parent multiset\n         ",
      "child_ranges": [
        "(line 181,col 13)-(line 181,col 33)",
        "(line 182,col 13)-(line 182,col 66)",
        "(line 183,col 13)-(line 183,col 32)",
        "(line 184,col 13)-(line 184,col 40)",
        "(line 185,col 13)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetIterator.hasNext()",
      "begin_line": 189,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetIterator.next()",
      "begin_line": 195,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 13)-(line 199,col 13)",
        "(line 200,col 13)-(line 203,col 13)",
        "(line 204,col 13)-(line 204,col 29)",
        "(line 205,col 13)-(line 205,col 24)",
        "(line 206,col 13)-(line 206,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetIterator.remove()",
      "begin_line": 210,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 13)-(line 214,col 13)",
        "(line 215,col 13)-(line 217,col 13)",
        "(line 218,col 13)-(line 218,col 58)",
        "(line 219,col 13)-(line 223,col 13)",
        "(line 224,col 13)-(line 224,col 26)",
        "(line 225,col 13)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.add(E)",
      "begin_line": 230,
      "end_line": 234,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 23)",
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.add(E, int)",
      "begin_line": 236,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 51)",
        "(line 243,col 9)-(line 243,col 51)",
        "(line 245,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.clear()",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * Clears the multiset by clearing the underlying map.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.remove(java.lang.Object)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 51)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 19)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 276,col 26)",
        "(line 277,col 9)-(line 277,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.remove(java.lang.Object, int)",
      "begin_line": 280,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 51)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 33)",
        "(line 291,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 304,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MutableInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 320,
      "end_line": 344,
      "comment": "\n     * Mutable integer class for storing the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The value of this mutable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.MutableInteger(int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n         * Constructor.\n         * @param value the initial value\n         ",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.equals(java.lang.Object)",
      "begin_line": 332,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 336,col 13)",
        "(line 337,col 13)-(line 337,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.hashCode()",
      "begin_line": 340,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.toArray()",
      "begin_line": 352,
      "end_line": 364,
      "comment": "\n     * Returns an array of all of this multiset\u0027s elements.\n     *\n     * @return an array of all of this multiset\u0027s elements\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 51)",
        "(line 355,col 9)-(line 355,col 18)",
        "(line 356,col 9)-(line 356,col 55)",
        "(line 357,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.toArray(T[])",
      "begin_line": 378,
      "end_line": 402,
      "comment": "\n     * Returns an array of all of this multiset\u0027s elements.\n     * If the input array has more elements than are in the multiset,\n     * trailing elements will be set to null.\n     *\n     * @param \u003cT\u003e the type of the array elements\n     * @param array the array to populate\n     * @return an array of all of this multiset\u0027s elements\n     * @throws ArrayStoreException if the runtime type of the specified array is not\n     *   a supertype of the runtime type of the elements in this list\n     * @throws NullPointerException if the specified array is null\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 387,col 18)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.uniqueSet()",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\n     * Returns a view of the underlying map\u0027s key set.\n     *\n     * @return the set of unique elements in this multiset\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.createUniqueSetIterator(java.util.Iterator\u003cE\u003e)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * Creates a unique set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the uniqueSet iterator\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.entrySet()",
      "begin_line": 433,
      "end_line": 439,
      "comment": "\n     * Returns an unmodifiable view of the underlying map\u0027s key set.\n     *\n     * @return the set of unique elements in this multiset\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.createEntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e\u003e)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UniqueSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "java.util.Set\u003cE\u003e"
      ],
      "begin_line": 456,
      "end_line": 503,
      "comment": "\n     * Inner class UniqueSet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " The parent multiset "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.UniqueSet(org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 469,
      "end_line": 472,
      "comment": "\n         * Constructs a new unique element view of the MultiSet.\n         *\n         * @param parent  the parent MultiSet\n         ",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 39)",
        "(line 471,col 13)-(line 471,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.iterator()",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.contains(java.lang.Object)",
      "begin_line": 479,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 481,col 13)-(line 481,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.remove(java.lang.Object)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.equals(java.lang.Object)",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.hashCode()",
      "begin_line": 494,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 13)-(line 496,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSet.clear()",
      "begin_line": 499,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 13)-(line 501,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UniqueSetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 508,
      "end_line": 547,
      "comment": "\n     * Inner class UniqueSetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": " The parent multiset "
    },
    {
      "type": "field",
      "varNames": [
        "lastElement"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": " The last returned element "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.UniqueSetIterator(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 524,
      "end_line": 527,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent multiset\n         ",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 28)",
        "(line 526,col 13)-(line 526,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.next()",
      "begin_line": 529,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 531,col 13)-(line 531,col 39)",
        "(line 532,col 13)-(line 532,col 29)",
        "(line 533,col 13)-(line 533,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.remove()",
      "begin_line": 536,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 538,col 13)-(line 540,col 13)",
        "(line 541,col 13)-(line 541,col 59)",
        "(line 542,col 13)-(line 542,col 27)",
        "(line 543,col 13)-(line 543,col 46)",
        "(line 544,col 13)-(line 544,col 31)",
        "(line 545,col 13)-(line 545,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003corg.apache.commons.collections4.MultiSet.Entry\u003cE\u003e\u003e"
      ],
      "begin_line": 553,
      "end_line": 602,
      "comment": "\n     * Inner class EntrySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySet.EntrySet(org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySet.size()",
      "begin_line": 566,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 568,col 13)-(line 568,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySet.iterator()",
      "begin_line": 571,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 573,col 13)-(line 573,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySet.contains(java.lang.Object)",
      "begin_line": 576,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 578,col 13)-(line 580,col 13)",
        "(line 581,col 13)-(line 581,col 50)",
        "(line 582,col 13)-(line 582,col 54)",
        "(line 583,col 13)-(line 583,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySet.remove(java.lang.Object)",
      "begin_line": 586,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 588,col 13)-(line 590,col 13)",
        "(line 591,col 13)-(line 591,col 50)",
        "(line 592,col 13)-(line 592,col 54)",
        "(line 593,col 13)-(line 599,col 13)",
        "(line 600,col 13)-(line 600,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.collections4.MultiSet.Entry\u003cE\u003e\u003e"
      ],
      "begin_line": 607,
      "end_line": 652,
      "comment": "\n     * Inner class EntrySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "decorated"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 618,
      "end_line": 618,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.EntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e\u003e, org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 625,
      "end_line": 629,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent multiset\n         ",
      "child_ranges": [
        "(line 627,col 13)-(line 627,col 38)",
        "(line 628,col 13)-(line 628,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.hasNext()",
      "begin_line": 631,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.next()",
      "begin_line": 636,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 638,col 13)-(line 638,col 58)",
        "(line 639,col 13)-(line 639,col 29)",
        "(line 640,col 13)-(line 640,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.remove()",
      "begin_line": 643,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 645,col 13)-(line 647,col 13)",
        "(line 648,col 13)-(line 648,col 31)",
        "(line 649,col 13)-(line 649,col 24)",
        "(line 650,col 13)-(line 650,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiSetEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiSet.Entry\u003cE\u003e"
      ],
      "begin_line": 657,
      "end_line": 684,
      "comment": "\n     * Inner class MultiSetEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parentEntry"
      ],
      "begin_line": 659,
      "end_line": 659,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.MultiSetEntry(java.util.Map.Entry\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e)",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n         * Constructor.\n         * @param parentEntry  the entry to decorate\n         ",
      "child_ranges": [
        "(line 666,col 13)-(line 666,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.getElement()",
      "begin_line": 669,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 13)-(line 671,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.getCount()",
      "begin_line": 674,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.toString()",
      "begin_line": 679,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 13)-(line 681,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 692,
      "end_line": 698,
      "comment": "\n     * Write the map out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 33)",
        "(line 694,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.doReadObject(java.util.Map\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e, java.io.ObjectInputStream)",
      "begin_line": 708,
      "end_line": 719,
      "comment": "\n     * Read the map in using a custom routine.\n     * @param map the map to use\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 23)",
        "(line 711,col 9)-(line 711,col 43)",
        "(line 712,col 9)-(line 718,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.equals(java.lang.Object)",
      "begin_line": 722,
      "end_line": 740,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 55)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.hashCode()",
      "begin_line": 742,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 22)",
        "(line 745,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.toString()",
      "begin_line": 758,
      "end_line": 778,
      "comment": "\n     * Implement a toString() method suitable for debugging.\n     *\n     * @return a debugging toString\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 54)",
        "(line 764,col 9)-(line 764,col 24)",
        "(line 765,col 9)-(line 765,col 54)",
        "(line 766,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 24)",
        "(line 777,col 9)-(line 777,col 30)"
      ]
    }
  ]
}