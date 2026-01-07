{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bidimap/AbstractDualBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDualBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.BidiMap\u003cK, V\u003e"
      ],
      "begin_line": 42,
      "end_line": 805,
      "comment": "\n * Abstract {@link BidiMap} implemented using two maps.\n * \u003cp\u003e\n * An implementation can be written simply by implementing the\n * {@link #createBidiMap(Map, Map, BidiMap)} method.\n *\n * @see DualHashBidiMap\n * @see DualTreeBidiMap\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "normalMap"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Normal delegate map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMap"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Reverse delegate map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inverseBidiMap"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Inverse view of this map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * View of the keys.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * View of the values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * View of the entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.AbstractDualBidiMap()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Creates an empty map, initialised by \u003ccode\u003ecreateMap\u003c/code\u003e.\n     * \u003cp\u003e\n     * This constructor remains in place for deserialization.\n     * All other usage is deprecated in favour of\n     * {@link #AbstractDualBidiMap(Map, Map)}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.AbstractDualBidiMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cV, K\u003e)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Creates an empty map using the two maps specified as storage.\n     * \u003cp\u003e\n     * The two maps must be a matching pair, normal and reverse.\n     * They will typically both be empty.\n     * \u003cp\u003e\n     * Neither map is validated, so nulls may be passed in.\n     * If you choose to do this then the subclass constructor must populate\n     * the \u003ccode\u003emaps[]\u003c/code\u003e instance variable itself.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.AbstractDualBidiMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cV, K\u003e, org.apache.commons.collections4.BidiMap\u003cV, K\u003e)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * Constructs a map that decorates the specified maps,\n     * used by the subclass \u003ccode\u003ecreateBidiMap\u003c/code\u003e implementation.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseBidiMap  the inverse BidiMap\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createBidiMap(java.util.Map\u003cV, K\u003e, java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.BidiMap\u003cK, V\u003e)",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Creates a new instance of the subclass.\n     *\n     * @param normalMap  the normal direction map\n     * @param reverseMap  the reverse direction map\n     * @param inverseMap  this map, which is the inverse in the new map\n     * @return the inverse map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.get(java.lang.Object)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.size()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.isEmpty()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.containsKey(java.lang.Object)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.equals(java.lang.Object)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.hashCode()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.toString()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.put(K, V)",
      "begin_line": 172,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.remove(java.lang.Object)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 23)",
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.clear()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 26)",
        "(line 205,col 9)-(line 205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.containsValue(java.lang.Object)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.mapIterator()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Obtains a \u003ccode\u003eMapIterator\u003c/code\u003e over the map.\n     * The iterator implements \u003ccode\u003eResetableMapIterator\u003c/code\u003e.\n     * This implementation relies on the entrySet iterator.\n     * \u003cp\u003e\n     * The setValue() methods only allow a new value to be set.\n     * If the value being set is already in the map, an IllegalArgumentException\n     * is thrown (as setValue cannot change the size of the map).\n     *\n     * @return a map iterator\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.getKey(java.lang.Object)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.removeValue(java.lang.Object)",
      "begin_line": 236,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 21)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.inverseBidiMap()",
      "begin_line": 246,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.keySet()",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Gets a keySet view of the map.\n     * Changes made on the view are reflected in the map.\n     * The set supports remove and clear but not add.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createKeySetIterator(java.util.Iterator\u003cK\u003e)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Creates a key set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the keySet iterator\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.values()",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\n     * Gets a values view of the map.\n     * Changes made on the view are reflected in the map.\n     * The set supports remove and clear but not add.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createValuesIterator(java.util.Iterator\u003cV\u003e)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Creates a values iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the values iterator\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.entrySet()",
      "begin_line": 319,
      "end_line": 325,
      "comment": "\n     * Gets an entrySet view of the map.\n     * Changes made on the set are reflected in the map.\n     * The set supports remove and clear but not add.\n     * \u003cp\u003e\n     * The Map Entry setValue() method only allow a new value to be set.\n     * If the value being set is already in the map, an IllegalArgumentException\n     * is thrown (as setValue cannot change the size of the map).\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createEntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "View",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e"
      ],
      "begin_line": 342,
      "end_line": 417,
      "comment": "\n     * Inner class View.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " Generated serial version ID. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.View(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param coll  the collection view being decorated\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 357,col 13)-(line 357,col 24)",
        "(line 358,col 13)-(line 358,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.equals(java.lang.Object)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.hashCode()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 371,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 373,col 13)-(line 375,col 13)",
        "(line 376,col 13)-(line 376,col 37)",
        "(line 377,col 13)-(line 377,col 51)",
        "(line 378,col 13)-(line 380,col 13)",
        "(line 381,col 13)-(line 381,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 393,
      "end_line": 411,
      "comment": "\n         * {@inheritDoc}\n         * \u003cp\u003e\n         * This implementation iterates over the elements of this bidi map, checking each element in\n         * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s not contained, it\u0027s removed\n         * from this bidi map. As a consequence, it is advised to use a collection type for\n         * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n         * {@link Collection#contains(Object)}.\n         ",
      "child_ranges": [
        "(line 395,col 13)-(line 397,col 13)",
        "(line 398,col 13)-(line 401,col 13)",
        "(line 402,col 13)-(line 402,col 37)",
        "(line 403,col 13)-(line 403,col 46)",
        "(line 404,col 13)-(line 409,col 13)",
        "(line 410,col 13)-(line 410,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.clear()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View\u003cK, java.lang.Object, K\u003e",
        "java.util.Set\u003cK\u003e"
      ],
      "begin_line": 423,
      "end_line": 457,
      "comment": "\n     * Inner class KeySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.KeySet(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, ?\u003e)",
      "begin_line": 433,
      "end_line": 436,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 435,col 13)-(line 435,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.iterator()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.contains(java.lang.Object)",
      "begin_line": 443,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.remove(java.lang.Object)",
      "begin_line": 448,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 450,col 13)-(line 454,col 13)",
        "(line 455,col 13)-(line 455,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cK\u003e"
      ],
      "begin_line": 462,
      "end_line": 501,
      "comment": "\n     * Inner class KeySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "lastKey"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " The last returned key "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.KeySetIterator(java.util.Iterator\u003cK\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, ?\u003e)",
      "begin_line": 478,
      "end_line": 481,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 28)",
        "(line 480,col 13)-(line 480,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.next()",
      "begin_line": 483,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 485,col 13)-(line 485,col 35)",
        "(line 486,col 13)-(line 486,col 29)",
        "(line 487,col 13)-(line 487,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.remove()",
      "begin_line": 490,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 494,col 13)",
        "(line 495,col 13)-(line 495,col 63)",
        "(line 496,col 13)-(line 496,col 27)",
        "(line 497,col 13)-(line 497,col 44)",
        "(line 498,col 13)-(line 498,col 27)",
        "(line 499,col 13)-(line 499,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View\u003cjava.lang.Object, V, V\u003e",
        "java.util.Set\u003cV\u003e"
      ],
      "begin_line": 507,
      "end_line": 541,
      "comment": "\n     * Inner class Values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.Values(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003c?, V\u003e)",
      "begin_line": 517,
      "end_line": 520,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.iterator()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.contains(java.lang.Object)",
      "begin_line": 527,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.remove(java.lang.Object)",
      "begin_line": 532,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 538,col 13)",
        "(line 539,col 13)-(line 539,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cV\u003e"
      ],
      "begin_line": 546,
      "end_line": 585,
      "comment": "\n     * Inner class ValuesIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "lastValue"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": " The last returned value "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.ValuesIterator(java.util.Iterator\u003cV\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003c?, V\u003e)",
      "begin_line": 562,
      "end_line": 566,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 28)",
        "(line 565,col 13)-(line 565,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.next()",
      "begin_line": 568,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 37)",
        "(line 571,col 13)-(line 571,col 29)",
        "(line 572,col 13)-(line 572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.remove()",
      "begin_line": 575,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 579,col 13)",
        "(line 580,col 13)-(line 580,col 27)",
        "(line 581,col 13)-(line 581,col 48)",
        "(line 582,col 13)-(line 582,col 29)",
        "(line 583,col 13)-(line 583,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View\u003cK, V, java.util.Map.Entry\u003cK, V\u003e\u003e",
        "java.util.Set\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 591,
      "end_line": 627,
      "comment": "\n     * Inner class EntrySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.EntrySet(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.iterator()",
      "begin_line": 605,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 610,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 612,col 13)-(line 614,col 13)",
        "(line 615,col 13)-(line 615,col 64)",
        "(line 616,col 13)-(line 616,col 46)",
        "(line 617,col 13)-(line 624,col 13)",
        "(line 625,col 13)-(line 625,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 632,
      "end_line": 672,
      "comment": "\n     * Inner class EntrySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 635,
      "end_line": 635,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.EntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 648,
      "end_line": 651,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 28)",
        "(line 650,col 13)-(line 650,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.next()",
      "begin_line": 653,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 655,col 13)-(line 655,col 60)",
        "(line 656,col 13)-(line 656,col 29)",
        "(line 657,col 13)-(line 657,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.remove()",
      "begin_line": 660,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 664,col 13)",
        "(line 666,col 13)-(line 666,col 49)",
        "(line 667,col 13)-(line 667,col 27)",
        "(line 668,col 13)-(line 668,col 44)",
        "(line 669,col 13)-(line 669,col 24)",
        "(line 670,col 13)-(line 670,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator\u003cK, V\u003e"
      ],
      "begin_line": 677,
      "end_line": 703,
      "comment": "\n     * Inner class MapEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry.MapEntry(java.util.Map.Entry\u003cK, V\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 687,
      "end_line": 690,
      "comment": "\n         * Constructor.\n         * @param entry  the entry to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 688,col 13)-(line 688,col 25)",
        "(line 689,col 13)-(line 689,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry.setValue(V)",
      "begin_line": 692,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 694,col 13)-(line 694,col 49)",
        "(line 695,col 13)-(line 699,col 13)",
        "(line 700,col 13)-(line 700,col 35)",
        "(line 701,col 13)-(line 701,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BidiMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 708,
      "end_line": 803,
      "comment": "\n     * Inner class MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": " The iterator being wrapped "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.BidiMapIterator(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 726,
      "end_line": 730,
      "comment": "\n         * Constructor.\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 727,col 13)-(line 727,col 20)",
        "(line 728,col 13)-(line 728,col 33)",
        "(line 729,col 13)-(line 729,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.hasNext()",
      "begin_line": 732,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 734,col 13)-(line 734,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.next()",
      "begin_line": 737,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 739,col 13)-(line 739,col 35)",
        "(line 740,col 13)-(line 740,col 29)",
        "(line 741,col 13)-(line 741,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.remove()",
      "begin_line": 744,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 746,col 13)-(line 748,col 13)",
        "(line 750,col 13)-(line 750,col 44)",
        "(line 751,col 13)-(line 751,col 30)",
        "(line 752,col 13)-(line 752,col 44)",
        "(line 753,col 13)-(line 753,col 24)",
        "(line 754,col 13)-(line 754,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.getKey()",
      "begin_line": 757,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 759,col 13)-(line 762,col 13)",
        "(line 763,col 13)-(line 763,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.getValue()",
      "begin_line": 766,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 768,col 13)-(line 771,col 13)",
        "(line 772,col 13)-(line 772,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.setValue(V)",
      "begin_line": 775,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 777,col 13)-(line 780,col 13)",
        "(line 781,col 13)-(line 785,col 13)",
        "(line 786,col 13)-(line 786,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.reset()",
      "begin_line": 789,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 791,col 13)-(line 791,col 62)",
        "(line 792,col 13)-(line 792,col 24)",
        "(line 793,col 13)-(line 793,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.toString()",
      "begin_line": 796,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 798,col 13)-(line 800,col 13)",
        "(line 801,col 13)-(line 801,col 35)"
      ]
    }
  ]
}