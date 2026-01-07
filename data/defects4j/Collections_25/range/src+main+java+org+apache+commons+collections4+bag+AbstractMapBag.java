{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bag/AbstractMapBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 604,
      "comment": "\n * Abstract implementation of the {@link Bag} interface to simplify the creation\n * of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage. The\n * map will be used to map bag elements to a number; the number represents the\n * number of occurrences of that element in the bag.\n *\n * @since 3.0 (previously DefaultMapBag v2.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The map to use to store the data "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The current total size of the bag "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The modification count for fail fast iterators "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueSet"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The modification count for fail fast iterators "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.AbstractMapBag()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.AbstractMapBag(java.util.Map\u003cE, org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger\u003e)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Constructor that assigns the specified Map as the backing store. The map\n     * must be empty and non-null.\n     *\n     * @param map the map to assign\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.getMap()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Utility method for implementations to access the map that backs this bag.\n     * Not intended for interactive use outside of subclasses.\n     *\n     * @return the map being used by the Bag\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.size()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns the number of elements in this bag.\n     *\n     * @return current size of the bag\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.isEmpty()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns true if the underlying map is empty.\n     *\n     * @return true if bag is empty\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.getCount(java.lang.Object)",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Returns the number of occurrence of the given element in this bag by\n     * looking up its count in the underlying map.\n     *\n     * @param object the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.contains(java.lang.Object)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Determines if the bag contains the given element by checking if the\n     * underlying map contains the element as a key.\n     *\n     * @param object the object to search for\n     * @return true if the bag contains the given element\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n     * Determines if the bag contains the given elements.\n     *\n     * @param coll the collection to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains all the collection\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.containsAll(org.apache.commons.collections4.Bag\u003c?\u003e)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the bag contains all elements in the given\n     * collection, respecting cardinality.\n     *\n     * @param other the bag to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains all the collection\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 60)",
        "(line 151,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.iterator()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Gets an iterator over the bag elements. Elements present in the Bag more\n     * than once will be returned repeatedly.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BagIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 174,
      "end_line": 231,
      "comment": "\n     * Inner class iterator for the Bag.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryIterator"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mods"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.BagIterator(org.apache.commons.collections4.bag.AbstractMapBag\u003cE\u003e)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n         * Constructor.\n         *\n         * @param parent the parent bag\n         ",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 33)",
        "(line 189,col 13)-(line 189,col 66)",
        "(line 190,col 13)-(line 190,col 32)",
        "(line 191,col 13)-(line 191,col 40)",
        "(line 192,col 13)-(line 192,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.hasNext()",
      "begin_line": 196,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.next()",
      "begin_line": 201,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 13)-(line 204,col 13)",
        "(line 205,col 13)-(line 208,col 13)",
        "(line 209,col 13)-(line 209,col 29)",
        "(line 210,col 13)-(line 210,col 24)",
        "(line 211,col 13)-(line 211,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.remove()",
      "begin_line": 215,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 13)-(line 218,col 13)",
        "(line 219,col 13)-(line 221,col 13)",
        "(line 222,col 13)-(line 222,col 58)",
        "(line 223,col 13)-(line 227,col 13)",
        "(line 228,col 13)-(line 228,col 26)",
        "(line 229,col 13)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.add(E)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Adds a new element to the bag, incrementing its count in the underlying map.\n     *\n     * @param object the object to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.add(E, int)",
      "begin_line": 251,
      "end_line": 264,
      "comment": "\n     * Adds a new element to the bag, incrementing its count in the map.\n     *\n     * @param object the object to search for\n     * @param nCopies the number of copies to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 19)",
        "(line 253,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 272,
      "end_line": 280,
      "comment": "\n     * Invokes {@link #add(Object)} for each element in the given collection.\n     *\n     * @param coll the collection to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the bag\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 274,col 56)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.clear()",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * Clears the bag by clearing the underlying map.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 19)",
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 289,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.remove(java.lang.Object)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Removes all copies of the specified object from the bag.\n     *\n     * @param object the object to remove\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 51)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 19)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 26)",
        "(line 306,col 9)-(line 306,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.remove(java.lang.Object, int)",
      "begin_line": 316,
      "end_line": 333,
      "comment": "\n     * Removes a specified number of copies of an object from the bag.\n     *\n     * @param object the object to remove\n     * @param nCopies the number of copies to remove\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 51)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 19)",
        "(line 325,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 342,
      "end_line": 352,
      "comment": "\n     * Removes objects from the bag according to their count in the specified\n     * collection.\n     *\n     * @param coll the collection to use\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 31)",
        "(line 344,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 361,
      "end_line": 366,
      "comment": "\n     * Remove any members of the bag that are not in the given bag, respecting\n     * cardinality.\n     *\n     * @param coll the collection to retain\n     * @return true if this call changed the collection\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.retainAll(org.apache.commons.collections4.Bag\u003c?\u003e)",
      "begin_line": 376,
      "end_line": 394,
      "comment": "\n     * Remove any members of the bag that are not in the given bag, respecting\n     * cardinality.\n     * @see #retainAll(Collection)\n     *\n     * @param other the bag to retain\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 31)",
        "(line 378,col 9)-(line 378,col 47)",
        "(line 379,col 9)-(line 379,col 53)",
        "(line 380,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MutableInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 400,
      "end_line": 424,
      "comment": "\n     * Mutable integer class for storing the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " The value of this mutable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.MutableInteger(int)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n         * Constructor.\n         * @param value the initial value\n         ",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.equals(java.lang.Object)",
      "begin_line": 412,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 414,col 13)-(line 416,col 13)",
        "(line 417,col 13)-(line 417,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.hashCode()",
      "begin_line": 420,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 13)-(line 422,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toArray()",
      "begin_line": 432,
      "end_line": 443,
      "comment": "\n     * Returns an array of all of this bag\u0027s elements.\n     *\n     * @return an array of all of this bag\u0027s elements\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 51)",
        "(line 434,col 9)-(line 434,col 18)",
        "(line 435,col 9)-(line 435,col 55)",
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toArray(T[])",
      "begin_line": 457,
      "end_line": 480,
      "comment": "\n     * Returns an array of all of this bag\u0027s elements.\n     * If the input array has more elements than are in the bag,\n     * trailing elements will be set to null.\n     *\n     * @param \u003cT\u003e the type of the array elements\n     * @param array the array to populate\n     * @return an array of all of this bag\u0027s elements\n     * @throws ArrayStoreException if the runtime type of the specified array is not\n     *   a supertype of the runtime type of the elements in this list\n     * @throws NullPointerException if the specified array is null\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 18)",
        "(line 466,col 9)-(line 466,col 55)",
        "(line 467,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.uniqueSet()",
      "begin_line": 487,
      "end_line": 492,
      "comment": "\n     * Returns an unmodifiable view of the underlying map\u0027s key set.\n     *\n     * @return the set of unique elements in this bag\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\n     * Write the map out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 33)",
        "(line 502,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.doReadObject(java.util.Map\u003cE, org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger\u003e, java.io.ObjectInputStream)",
      "begin_line": 516,
      "end_line": 527,
      "comment": "\n     * Read the map in using a custom routine.\n     * @param map the map to use\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 23)",
        "(line 519,col 9)-(line 519,col 43)",
        "(line 520,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.equals(java.lang.Object)",
      "begin_line": 537,
      "end_line": 555,
      "comment": "\n     * Compares this Bag to another. This Bag equals another Bag if it contains\n     * the same number of occurrences of the same elements.\n     *\n     * @param object the Bag to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 45)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.hashCode()",
      "begin_line": 566,
      "end_line": 575,
      "comment": "\n     * Gets a hash code for the Bag compatible with the definition of equals.\n     * The hash code is defined as the sum total of a hash code for each\n     * element. The per element hash code is defined as\n     * \u003ccode\u003e(e\u003d\u003dnull ? 0 : e.hashCode()) ^ noOccurances)\u003c/code\u003e. This hash code\n     * is compatible with the Set interface.\n     *\n     * @return the hash code of the Bag\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 22)",
        "(line 569,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toString()",
      "begin_line": 582,
      "end_line": 602,
      "comment": "\n     * Implement a toString() method suitable for debugging.\n     *\n     * @return a debugging toString\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 54)",
        "(line 588,col 9)-(line 588,col 24)",
        "(line 589,col 9)-(line 589,col 54)",
        "(line 590,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 24)",
        "(line 601,col 9)-(line 601,col 30)"
      ]
    }
  ]
}