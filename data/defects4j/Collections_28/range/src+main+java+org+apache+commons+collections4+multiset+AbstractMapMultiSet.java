{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multiset/AbstractMapMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multiset.AbstractMultiSet\u003cE\u003e"
      ],
      "begin_line": 41,
      "end_line": 564,
      "comment": "\n * Abstract implementation of the {@link MultiSet} interface to simplify the\n * creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage. The\n * map will be used to map multiset elements to a number; the number represents the\n * number of occurrences of that element in the multiset.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The map to use to store the data "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The current total size of the multiset "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The modification count for fail fast iterators "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.AbstractMapMultiSet()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.AbstractMapMultiSet(java.util.Map\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructor that assigns the specified Map as the backing store. The map\n     * must be empty and non-null.\n     *\n     * @param map the map to assign\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.getMap()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Utility method for implementations to access the map that backs this multiset.\n     * Not intended for interactive use outside of subclasses.\n     *\n     * @return the map being used by the MultiSet\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.setMap(java.util.Map\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Sets the map being wrapped.\n     * \u003cp\u003e\n     * \u003cb\u003eNOTE:\u003c/b\u003e this method should only be used during deserialization\n     *\n     * @param map the map to wrap\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.size()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Returns the number of elements in this multiset.\n     *\n     * @return current size of the multiset\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.isEmpty()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Returns true if the underlying map is empty.\n     *\n     * @return true if multiset is empty\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.getCount(java.lang.Object)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Returns the number of occurrence of the given element in this multiset by\n     * looking up its count in the underlying map.\n     *\n     * @param object the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 53)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.contains(java.lang.Object)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Determines if the multiset contains the given element by checking if the\n     * underlying map contains the element as a key.\n     *\n     * @param object the object to search for\n     * @return true if the multiset contains the given element\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.iterator()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Gets an iterator over the multiset elements. Elements present in the\n     * MultiSet more than once will be returned repeatedly.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapBasedMultiSetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 154,
      "end_line": 214,
      "comment": "\n     * Inner class iterator for the MultiSet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryIterator"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mods"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MapBasedMultiSetIterator.MapBasedMultiSetIterator(org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n         * Constructor.\n         *\n         * @param parent the parent multiset\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 33)",
        "(line 169,col 13)-(line 169,col 66)",
        "(line 170,col 13)-(line 170,col 32)",
        "(line 171,col 13)-(line 171,col 40)",
        "(line 172,col 13)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MapBasedMultiSetIterator.hasNext()",
      "begin_line": 176,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MapBasedMultiSetIterator.next()",
      "begin_line": 182,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 13)-(line 186,col 13)",
        "(line 187,col 13)-(line 190,col 13)",
        "(line 191,col 13)-(line 191,col 29)",
        "(line 192,col 13)-(line 192,col 24)",
        "(line 193,col 13)-(line 193,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MapBasedMultiSetIterator.remove()",
      "begin_line": 197,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 13)-(line 201,col 13)",
        "(line 202,col 13)-(line 204,col 13)",
        "(line 205,col 13)-(line 205,col 58)",
        "(line 206,col 13)-(line 210,col 13)",
        "(line 211,col 13)-(line 211,col 26)",
        "(line 212,col 13)-(line 212,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.add(E, int)",
      "begin_line": 217,
      "end_line": 236,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 226,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.clear()",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * Clears the multiset by clearing the underlying map.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 19)",
        "(line 245,col 9)-(line 245,col 20)",
        "(line 246,col 9)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.remove(java.lang.Object, int)",
      "begin_line": 249,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 51)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MutableInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 277,
      "end_line": 301,
      "comment": "\n     * Mutable integer class for storing the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " The value of this mutable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.MutableInteger(int)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n         * Constructor.\n         * @param value the initial value\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.equals(java.lang.Object)",
      "begin_line": 289,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 291,col 13)-(line 293,col 13)",
        "(line 294,col 13)-(line 294,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger.hashCode()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.createUniqueSetIterator()",
      "begin_line": 304,
      "end_line": 307,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.uniqueElements()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.createEntrySetIterator()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UniqueSetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 323,
      "end_line": 362,
      "comment": "\n     * Inner class UniqueSetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " The parent multiset "
    },
    {
      "type": "field",
      "varNames": [
        "lastElement"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " The last returned element "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.UniqueSetIterator(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent multiset\n         ",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 28)",
        "(line 341,col 13)-(line 341,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.next()",
      "begin_line": 344,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 39)",
        "(line 347,col 13)-(line 347,col 29)",
        "(line 348,col 13)-(line 348,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator.remove()",
      "begin_line": 351,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 353,col 13)-(line 355,col 13)",
        "(line 356,col 13)-(line 356,col 59)",
        "(line 357,col 13)-(line 357,col 27)",
        "(line 358,col 13)-(line 358,col 46)",
        "(line 359,col 13)-(line 359,col 31)",
        "(line 360,col 13)-(line 360,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.collections4.MultiSet.Entry\u003cE\u003e\u003e"
      ],
      "begin_line": 367,
      "end_line": 412,
      "comment": "\n     * Inner class EntrySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "decorated"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.EntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e\u003e, org.apache.commons.collections4.multiset.AbstractMapMultiSet\u003cE\u003e)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent multiset\n         ",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 38)",
        "(line 388,col 13)-(line 388,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.hasNext()",
      "begin_line": 391,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 393,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.next()",
      "begin_line": 396,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 58)",
        "(line 399,col 13)-(line 399,col 29)",
        "(line 400,col 13)-(line 400,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator.remove()",
      "begin_line": 403,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 405,col 13)-(line 407,col 13)",
        "(line 408,col 13)-(line 408,col 31)",
        "(line 409,col 13)-(line 409,col 24)",
        "(line 410,col 13)-(line 410,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiSetEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractEntry\u003cE\u003e"
      ],
      "begin_line": 417,
      "end_line": 438,
      "comment": "\n     * Inner class MultiSetEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parentEntry"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.MultiSetEntry(java.util.Map.Entry\u003cE, org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger\u003e)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n         * Constructor.\n         * @param parentEntry  the entry to decorate\n         ",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.getElement()",
      "begin_line": 429,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry.getCount()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 446,
      "end_line": 453,
      "comment": "\n     * Write the multiset out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 33)",
        "(line 449,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 462,
      "end_line": 473,
      "comment": "\n     * Read the multiset in using a custom routine.\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 43)",
        "(line 466,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.toArray()",
      "begin_line": 481,
      "end_line": 493,
      "comment": "\n     * Returns an array of all of this multiset\u0027s elements.\n     *\n     * @return an array of all of this multiset\u0027s elements\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 51)",
        "(line 484,col 9)-(line 484,col 18)",
        "(line 485,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.toArray(T[])",
      "begin_line": 507,
      "end_line": 531,
      "comment": "\n     * Returns an array of all of this multiset\u0027s elements.\n     * If the input array has more elements than are in the multiset,\n     * trailing elements will be set to null.\n     *\n     * @param \u003cT\u003e the type of the array elements\n     * @param array the array to populate\n     * @return an array of all of this multiset\u0027s elements\n     * @throws ArrayStoreException if the runtime type of the specified array is not\n     *   a supertype of the runtime type of the elements in this list\n     * @throws NullPointerException if the specified array is null\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 32)",
        "(line 510,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 516,col 18)",
        "(line 517,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.equals(java.lang.Object)",
      "begin_line": 534,
      "end_line": 552,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 55)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMapMultiSet.hashCode()",
      "begin_line": 554,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 22)",
        "(line 557,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 21)"
      ]
    }
  ]
}