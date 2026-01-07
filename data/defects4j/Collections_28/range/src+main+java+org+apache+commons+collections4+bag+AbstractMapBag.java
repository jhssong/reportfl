{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bag/AbstractMapBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 44,
      "end_line": 624,
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
      "comment": " Unique view of the elements "
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
      "end_line": 92,
      "comment": "\n     * Returns the number of elements in this bag.\n     *\n     * @return current size of the bag\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.isEmpty()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Returns true if the underlying map is empty.\n     *\n     * @return true if bag is empty\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.getCount(java.lang.Object)",
      "begin_line": 111,
      "end_line": 118,
      "comment": "\n     * Returns the number of occurrence of the given element in this bag by\n     * looking up its count in the underlying map.\n     *\n     * @param object the object to search for\n     * @return the number of occurrences of the object, zero if not found\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 53)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.contains(java.lang.Object)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Determines if the bag contains the given element by checking if the\n     * underlying map contains the element as a key.\n     *\n     * @param object the object to search for\n     * @return true if the bag contains the given element\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n     * Determines if the bag contains the given elements.\n     *\n     * @param coll the collection to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains all the collection\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.containsAll(org.apache.commons.collections4.Bag\u003c?\u003e)",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the bag contains all elements in the given\n     * collection, respecting cardinality.\n     *\n     * @param other the bag to check against\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Bag contains all the collection\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 60)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.iterator()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Gets an iterator over the bag elements. Elements present in the Bag more\n     * than once will be returned repeatedly.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BagIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 180,
      "end_line": 240,
      "comment": "\n     * Inner class iterator for the Bag.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryIterator"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mods"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.BagIterator(org.apache.commons.collections4.bag.AbstractMapBag\u003cE\u003e)",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n         * Constructor.\n         *\n         * @param parent the parent bag\n         ",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 33)",
        "(line 195,col 13)-(line 195,col 66)",
        "(line 196,col 13)-(line 196,col 32)",
        "(line 197,col 13)-(line 197,col 40)",
        "(line 198,col 13)-(line 198,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.hasNext()",
      "begin_line": 202,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.next()",
      "begin_line": 208,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 13)-(line 212,col 13)",
        "(line 213,col 13)-(line 216,col 13)",
        "(line 217,col 13)-(line 217,col 29)",
        "(line 218,col 13)-(line 218,col 24)",
        "(line 219,col 13)-(line 219,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.BagIterator.remove()",
      "begin_line": 223,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 13)-(line 227,col 13)",
        "(line 228,col 13)-(line 230,col 13)",
        "(line 231,col 13)-(line 231,col 58)",
        "(line 232,col 13)-(line 236,col 13)",
        "(line 237,col 13)-(line 237,col 26)",
        "(line 238,col 13)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.add(E)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * Adds a new element to the bag, incrementing its count in the underlying map.\n     *\n     * @param object the object to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.add(E, int)",
      "begin_line": 261,
      "end_line": 275,
      "comment": "\n     * Adds a new element to the bag, incrementing its count in the map.\n     *\n     * @param object the object to search for\n     * @param nCopies the number of copies to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the object was not already in the \u003ccode\u003euniqueSet\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)",
        "(line 264,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n     * Invokes {@link #add(Object)} for each element in the given collection.\n     *\n     * @param coll the collection to add\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the bag\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 32)",
        "(line 286,col 9)-(line 286,col 56)",
        "(line 287,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.clear()",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * Clears the bag by clearing the underlying map.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 19)",
        "(line 301,col 9)-(line 301,col 20)",
        "(line 302,col 9)-(line 302,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.remove(java.lang.Object)",
      "begin_line": 311,
      "end_line": 321,
      "comment": "\n     * Removes all copies of the specified object from the bag.\n     *\n     * @param object the object to remove\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 19)",
        "(line 318,col 9)-(line 318,col 27)",
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.remove(java.lang.Object, int)",
      "begin_line": 330,
      "end_line": 348,
      "comment": "\n     * Removes a specified number of copies of an object from the bag.\n     *\n     * @param object the object to remove\n     * @param nCopies the number of copies to remove\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 51)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 19)",
        "(line 340,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 357,
      "end_line": 368,
      "comment": "\n     * Removes objects from the bag according to their count in the specified\n     * collection.\n     *\n     * @param coll the collection to use\n     * @return true if the bag changed\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 31)",
        "(line 360,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\n     * Remove any members of the bag that are not in the given bag, respecting\n     * cardinality.\n     *\n     * @param coll the collection to retain\n     * @return true if this call changed the collection\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.retainAll(org.apache.commons.collections4.Bag\u003c?\u003e)",
      "begin_line": 393,
      "end_line": 411,
      "comment": "\n     * Remove any members of the bag that are not in the given bag, respecting\n     * cardinality.\n     * @see #retainAll(Collection)\n     *\n     * @param other the bag to retain\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this call changed the collection\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 31)",
        "(line 395,col 9)-(line 395,col 47)",
        "(line 396,col 9)-(line 396,col 53)",
        "(line 397,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MutableInteger",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 417,
      "end_line": 441,
      "comment": "\n     * Mutable integer class for storing the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": " The value of this mutable. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.MutableInteger(int)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n         * Constructor.\n         * @param value the initial value\n         ",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.equals(java.lang.Object)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 431,col 13)-(line 433,col 13)",
        "(line 434,col 13)-(line 434,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger.hashCode()",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toArray()",
      "begin_line": 449,
      "end_line": 461,
      "comment": "\n     * Returns an array of all of this bag\u0027s elements.\n     *\n     * @return an array of all of this bag\u0027s elements\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 51)",
        "(line 452,col 9)-(line 452,col 18)",
        "(line 453,col 9)-(line 453,col 55)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toArray(T[])",
      "begin_line": 475,
      "end_line": 499,
      "comment": "\n     * Returns an array of all of this bag\u0027s elements.\n     * If the input array has more elements than are in the bag,\n     * trailing elements will be set to null.\n     *\n     * @param \u003cT\u003e the type of the array elements\n     * @param array the array to populate\n     * @return an array of all of this bag\u0027s elements\n     * @throws ArrayStoreException if the runtime type of the specified array is not\n     *   a supertype of the runtime type of the elements in this list\n     * @throws NullPointerException if the specified array is null\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 32)",
        "(line 478,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 484,col 18)",
        "(line 485,col 9)-(line 485,col 55)",
        "(line 486,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.uniqueSet()",
      "begin_line": 506,
      "end_line": 512,
      "comment": "\n     * Returns an unmodifiable view of the underlying map\u0027s key set.\n     *\n     * @return the set of unique elements in this bag\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 520,
      "end_line": 526,
      "comment": "\n     * Write the map out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 33)",
        "(line 522,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.doReadObject(java.util.Map\u003cE, org.apache.commons.collections4.bag.AbstractMapBag.MutableInteger\u003e, java.io.ObjectInputStream)",
      "begin_line": 536,
      "end_line": 547,
      "comment": "\n     * Read the map in using a custom routine.\n     * @param map the map to use\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 23)",
        "(line 539,col 9)-(line 539,col 43)",
        "(line 540,col 9)-(line 546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.equals(java.lang.Object)",
      "begin_line": 557,
      "end_line": 575,
      "comment": "\n     * Compares this Bag to another. This Bag equals another Bag if it contains\n     * the same number of occurrences of the same elements.\n     *\n     * @param object the Bag to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 45)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.hashCode()",
      "begin_line": 586,
      "end_line": 595,
      "comment": "\n     * Gets a hash code for the Bag compatible with the definition of equals.\n     * The hash code is defined as the sum total of a hash code for each\n     * element. The per element hash code is defined as\n     * \u003ccode\u003e(e\u003d\u003dnull ? 0 : e.hashCode()) ^ noOccurances)\u003c/code\u003e. This hash code\n     * is compatible with the Set interface.\n     *\n     * @return the hash code of the Bag\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 22)",
        "(line 589,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractMapBag.toString()",
      "begin_line": 602,
      "end_line": 622,
      "comment": "\n     * Implement a toString() method suitable for debugging.\n     *\n     * @return a debugging toString\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 54)",
        "(line 608,col 9)-(line 608,col 24)",
        "(line 609,col 9)-(line 609,col 54)",
        "(line 610,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 24)",
        "(line 621,col 9)-(line 621,col 30)"
      ]
    }
  ]
}