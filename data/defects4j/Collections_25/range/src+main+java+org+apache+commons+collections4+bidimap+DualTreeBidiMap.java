{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bidimap/DualTreeBidiMap.java",
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
      "end_line": 398,
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
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.valueComparator()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.firstKey()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.lastKey()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.nextKey(K)",
      "begin_line": 147,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 155,col 67)",
        "(line 156,col 9)-(line 156,col 18)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.previousKey(K)",
      "begin_line": 163,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 63)",
        "(line 171,col 9)-(line 171,col 51)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.mapIterator()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Obtains an ordered map iterator.\n     * \u003cp\u003e\n     * This implementation copies the elements to an ArrayList in order to\n     * provide the forward/backward behaviour.\n     *\n     * @return a new ordered map iterator\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseSortedBidiMap()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseOrderedBidiMap()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.headMap(K)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 81)",
        "(line 204,col 9)-(line 204,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.tailMap(K)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 83)",
        "(line 209,col 9)-(line 209,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.subMap(K, K)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 89)",
        "(line 214,col 9)-(line 214,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.inverseBidiMap()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapDecorator\u003cK, V\u003e"
      ],
      "begin_line": 226,
      "end_line": 283,
      "comment": "\n     * Internal sorted map view.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.ViewMap(org.apache.commons.collections4.bidimap.DualTreeBidiMap\u003cK, V\u003e, java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n         * Constructor.\n         * @param bidi  the parent bidi map\n         * @param sm  the subMap sorted map\n         ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.containsValue(java.lang.Object)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.clear()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 251,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.headMap(K)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.tailMap(K)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.subMap(K, K)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.decorated()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.previousKey(K)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.ViewMap.nextKey(K)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 44)"
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
      "begin_line": 289,
      "end_line": 380,
      "comment": "\n     * Inner class MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " The iterator being decorated "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " The last returned entry "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.BidiOrderedMapIterator(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n         * Constructor.\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 20)",
        "(line 306,col 13)-(line 306,col 33)",
        "(line 307,col 13)-(line 307,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.hasNext()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.next()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 35)",
        "(line 316,col 13)-(line 316,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.hasPrevious()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 13)-(line 320,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.previous()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 39)",
        "(line 325,col 13)-(line 325,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.remove()",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 30)",
        "(line 330,col 13)-(line 330,col 41)",
        "(line 331,col 13)-(line 331,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.getKey()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 338,col 13)",
        "(line 339,col 13)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.getValue()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 346,col 13)",
        "(line 347,col 13)-(line 347,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.setValue(V)",
      "begin_line": 350,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 354,col 13)",
        "(line 355,col 13)-(line 359,col 13)",
        "(line 360,col 13)-(line 360,col 64)",
        "(line 364,col 13)-(line 364,col 33)",
        "(line 365,col 13)-(line 365,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.reset()",
      "begin_line": 368,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 369,col 13)-(line 369,col 88)",
        "(line 370,col 13)-(line 370,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.BidiOrderedMapIterator.toString()",
      "begin_line": 373,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 375,col 13)-(line 377,col 13)",
        "(line 378,col 13)-(line 378,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 33)",
        "(line 386,col 9)-(line 386,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.DualTreeBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 389,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 31)",
        "(line 391,col 9)-(line 391,col 50)",
        "(line 392,col 9)-(line 392,col 56)",
        "(line 393,col 9)-(line 394,col 58)",
        "(line 395,col 9)-(line 395,col 20)"
      ]
    }
  ]
}