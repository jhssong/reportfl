{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/DualTreeBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DualTreeBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e",
        "org.apache.commons.collections4.SortedBidiMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 416,
      "comment": "\n * Implementation of {@link BidiMap} that uses two {@link TreeMap} instances.\n * \u003cp\u003e\n * The setValue() method on iterators will succeed only if the new value being set is\n * not already in the bidimap.\n * \u003cp\u003e\n * When considering whether to use this class, the {@link TreeBidiMap} class should\n * also be considered. It implements the interface using a dedicated design, and does\n * not store each object twice, which can save on memory use.\n * \u003cp\u003e\n * NOTE: From Commons Collections 3.1, all subclasses will use {@link TreeMap}\n * and the flawed \u003ccode\u003ecreateMap\u003c/code\u003e method is ignored.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Ensure serialization compatibility "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The key comparator to use "
    },
    {
      "type": "field",
      "varNames": [
        "valueComparator"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The value comparator to use "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.DualTreeBidiMap()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * Creates an empty \u003ccode\u003eDualTreeBidiMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 56)",
        "(line 72,col 9)-(line 72,col 31)",
        "(line 73,col 9)-(line 73,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.DualTreeBidiMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Constructs a \u003ccode\u003eDualTreeBidiMap\u003c/code\u003e and copies the mappings from\n     * specified \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @param map  the map whose mappings are to be placed in this map\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 56)",
        "(line 84,col 9)-(line 84,col 20)",
        "(line 85,col 9)-(line 85,col 31)",
        "(line 86,col 9)-(line 86,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.DualTreeBidiMap(java.util.Comparator\u003c? super K\u003e, java.util.Comparator\u003c? super V\u003e)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Constructs a {@link DualTreeBidiMap} using the specified {@link Comparator}.\n     *\n     * @param keyComparator  the comparator\n     * @param valueComparator  the values comparator to use\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 84)",
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.DualTreeBidiMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cV, K\u003e, org.apache.commons.collections4.BidiMap\u003cV, K\u003e)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Constructs a {@link DualTreeBidiMap} that decorates the specified maps.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseBidiMap  the inverse BidiMap\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 111,col 69)",
        "(line 112,col 9)-(line 112,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.createBidiMap(java.util.Map\u003cV, K\u003e, java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.BidiMap\u003cK, V\u003e)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Creates a new instance of this object.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseMap  the inverse BidiMap\n     * @return new bidi map\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.comparator()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.valueComparator()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.firstKey()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.lastKey()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.nextKey(K)",
      "begin_line": 151,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 63)",
        "(line 160,col 9)-(line 160,col 67)",
        "(line 161,col 9)-(line 161,col 18)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.previousKey(K)",
      "begin_line": 168,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 177,col 9)-(line 177,col 51)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.mapIterator()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Obtains an ordered map iterator.\n     * \u003cp\u003e\n     * This implementation copies the elements to an ArrayList in order to\n     * provide the forward/backward behaviour.\n     *\n     * @return a new ordered map iterator\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseSortedBidiMap()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseOrderedBidiMap()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.headMap(K)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 81)",
        "(line 211,col 9)-(line 211,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.tailMap(K)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 83)",
        "(line 217,col 9)-(line 217,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.subMap(K, K)",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 89)",
        "(line 223,col 9)-(line 223,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseBidiMap()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapDecorator\u003cK, V\u003e"
      ],
      "begin_line": 235,
      "end_line": 292,
      "comment": "\n     * Internal sorted map view.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.ViewMap(org.apache.commons.collections4.bidimap.DualTreeBidiMap\u003cK, V\u003e, java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\n         * Constructor.\n         * @param bidi  the parent bidi map\n         * @param sm  the subMap sorted map\n         ",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.containsValue(java.lang.Object)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.clear()",
      "begin_line": 254,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 257,col 13)-(line 260,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.headMap(K)",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.tailMap(K)",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.subMap(K, K)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.decorated()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.previousKey(K)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.nextKey(K)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BidiOrderedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 298,
      "end_line": 398,
      "comment": "\n     * Inner class MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " The iterator being decorated "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The last returned entry "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.BidiOrderedMapIterator(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 313,
      "end_line": 317,
      "comment": "\n         * Constructor.\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 20)",
        "(line 315,col 13)-(line 315,col 33)",
        "(line 316,col 13)-(line 316,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.hasNext()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.next()",
      "begin_line": 324,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 35)",
        "(line 327,col 13)-(line 327,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.hasPrevious()",
      "begin_line": 330,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.previous()",
      "begin_line": 335,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 39)",
        "(line 338,col 13)-(line 338,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.remove()",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 30)",
        "(line 344,col 13)-(line 344,col 41)",
        "(line 345,col 13)-(line 345,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.getKey()",
      "begin_line": 348,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 350,col 13)-(line 353,col 13)",
        "(line 354,col 13)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.getValue()",
      "begin_line": 357,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 359,col 13)-(line 362,col 13)",
        "(line 363,col 13)-(line 363,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.setValue(V)",
      "begin_line": 366,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 371,col 13)",
        "(line 372,col 13)-(line 376,col 13)",
        "(line 377,col 13)-(line 377,col 64)",
        "(line 381,col 13)-(line 381,col 33)",
        "(line 382,col 13)-(line 382,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.reset()",
      "begin_line": 385,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 88)",
        "(line 388,col 13)-(line 388,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.toString()",
      "begin_line": 391,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 395,col 13)",
        "(line 396,col 13)-(line 396,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 33)",
        "(line 404,col 9)-(line 404,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 407,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 31)",
        "(line 409,col 9)-(line 409,col 50)",
        "(line 410,col 9)-(line 410,col 56)",
        "(line 411,col 9)-(line 412,col 58)",
        "(line 413,col 9)-(line 413,col 20)"
      ]
    }
  ]
}