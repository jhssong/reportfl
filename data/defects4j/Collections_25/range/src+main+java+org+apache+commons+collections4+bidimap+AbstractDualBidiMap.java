{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bidimap/AbstractDualBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDualBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.BidiMap\u003cK, V\u003e"
      ],
      "begin_line": 42,
      "end_line": 782,
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
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.size()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.isEmpty()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.containsKey(java.lang.Object)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.equals(java.lang.Object)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.hashCode()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.toString()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.put(K, V)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 48)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.remove(java.lang.Object)",
      "begin_line": 186,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 23)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.clear()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 26)",
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.containsValue(java.lang.Object)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.mapIterator()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Obtains a \u003ccode\u003eMapIterator\u003c/code\u003e over the map.\n     * The iterator implements \u003ccode\u003eResetableMapIterator\u003c/code\u003e.\n     * This implementation relies on the entrySet iterator.\n     * \u003cp\u003e\n     * The setValue() methods only allow a new value to be set.\n     * If the value being set is already in the map, an IllegalArgumentException\n     * is thrown (as setValue cannot change the size of the map).\n     *\n     * @return a map iterator\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.getKey(java.lang.Object)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.removeValue(java.lang.Object)",
      "begin_line": 225,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 21)",
        "(line 227,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.inverseBidiMap()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.keySet()",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\n     * Gets a keySet view of the map.\n     * Changes made on the view are reflected in the map.\n     * The set supports remove and clear but not add.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createKeySetIterator(java.util.Iterator\u003cK\u003e)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Creates a key set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the keySet iterator\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.values()",
      "begin_line": 275,
      "end_line": 280,
      "comment": "\n     * Gets a values view of the map.\n     * Changes made on the view are reflected in the map.\n     * The set supports remove and clear but not add.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createValuesIterator(java.util.Iterator\u003cV\u003e)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Creates a values iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the values iterator\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.entrySet()",
      "begin_line": 304,
      "end_line": 309,
      "comment": "\n     * Gets an entrySet view of the map.\n     * Changes made on the set are reflected in the map.\n     * The set supports remove and clear but not add.\n     * \u003cp\u003e\n     * The Map Entry setValue() method only allow a new value to be set.\n     * If the value being set is already in the map, an IllegalArgumentException\n     * is thrown (as setValue cannot change the size of the map).\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.createEntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Creates an entry set iterator.\n     * Subclasses can override this to return iterators with different properties.\n     *\n     * @param iterator  the iterator to decorate\n     * @return the entrySet iterator\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "View",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e"
      ],
      "begin_line": 326,
      "end_line": 401,
      "comment": "\n     * Inner class View.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Generated serial version ID. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.View(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param coll  the collection view being decorated\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 24)",
        "(line 342,col 13)-(line 342,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.equals(java.lang.Object)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.hashCode()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 355,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 357,col 13)-(line 359,col 13)",
        "(line 360,col 13)-(line 360,col 37)",
        "(line 361,col 13)-(line 361,col 51)",
        "(line 362,col 13)-(line 364,col 13)",
        "(line 365,col 13)-(line 365,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 377,
      "end_line": 395,
      "comment": "\n         * {@inheritDoc}\n         * \u003cp\u003e\n         * This implementation iterates over the elements of this bidi map, checking each element in\n         * turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e. If it\u0027s not contained, it\u0027s removed\n         * from this bidi map. As a consequence, it is advised to use a collection type for\n         * \u003ccode\u003ecoll\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n         * {@link Collection#contains(Object)}.\n         ",
      "child_ranges": [
        "(line 379,col 13)-(line 381,col 13)",
        "(line 382,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 37)",
        "(line 387,col 13)-(line 387,col 46)",
        "(line 388,col 13)-(line 393,col 13)",
        "(line 394,col 13)-(line 394,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.View.clear()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 27)"
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
      "begin_line": 407,
      "end_line": 441,
      "comment": "\n     * Inner class KeySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.KeySet(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, ?\u003e)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.iterator()",
      "begin_line": 422,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.contains(java.lang.Object)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySet.remove(java.lang.Object)",
      "begin_line": 432,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 434,col 13)-(line 438,col 13)",
        "(line 439,col 13)-(line 439,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cK\u003e"
      ],
      "begin_line": 446,
      "end_line": 485,
      "comment": "\n     * Inner class KeySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "lastKey"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": " The last returned key "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.KeySetIterator(java.util.Iterator\u003cK\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, ?\u003e)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 28)",
        "(line 464,col 13)-(line 464,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.next()",
      "begin_line": 467,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 469,col 13)-(line 469,col 35)",
        "(line 470,col 13)-(line 470,col 29)",
        "(line 471,col 13)-(line 471,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.KeySetIterator.remove()",
      "begin_line": 474,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 478,col 13)",
        "(line 479,col 13)-(line 479,col 63)",
        "(line 480,col 13)-(line 480,col 27)",
        "(line 481,col 13)-(line 481,col 44)",
        "(line 482,col 13)-(line 482,col 27)",
        "(line 483,col 13)-(line 483,col 30)"
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
      "begin_line": 491,
      "end_line": 525,
      "comment": "\n     * Inner class Values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.Values(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003c?, V\u003e)",
      "begin_line": 501,
      "end_line": 504,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.iterator()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.contains(java.lang.Object)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.Values.remove(java.lang.Object)",
      "begin_line": 516,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 518,col 13)-(line 522,col 13)",
        "(line 523,col 13)-(line 523,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cV\u003e"
      ],
      "begin_line": 530,
      "end_line": 569,
      "comment": "\n     * Inner class ValuesIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 533,
      "end_line": 533,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "lastValue"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": " The last returned value "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.ValuesIterator(java.util.Iterator\u003cV\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003c?, V\u003e)",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 548,col 13)-(line 548,col 28)",
        "(line 549,col 13)-(line 549,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.next()",
      "begin_line": 552,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 554,col 13)-(line 554,col 37)",
        "(line 555,col 13)-(line 555,col 29)",
        "(line 556,col 13)-(line 556,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.ValuesIterator.remove()",
      "begin_line": 559,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 563,col 13)",
        "(line 564,col 13)-(line 564,col 27)",
        "(line 565,col 13)-(line 565,col 48)",
        "(line 566,col 13)-(line 566,col 29)",
        "(line 567,col 13)-(line 567,col 30)"
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
      "begin_line": 575,
      "end_line": 611,
      "comment": "\n     * Inner class EntrySet.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 578,
      "end_line": 578,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.EntrySet(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n         * Constructs a new view of the BidiMap.\n         *\n         * @param parent  the parent BidiMap\n         ",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.iterator()",
      "begin_line": 589,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 594,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 596,col 13)-(line 598,col 13)",
        "(line 599,col 13)-(line 599,col 64)",
        "(line 600,col 13)-(line 600,col 46)",
        "(line 601,col 13)-(line 608,col 13)",
        "(line 609,col 13)-(line 609,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 616,
      "end_line": 656,
      "comment": "\n     * Inner class EntrySetIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 622,
      "end_line": 622,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.EntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 632,
      "end_line": 635,
      "comment": "\n         * Constructor.\n         * @param iterator  the iterator to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 28)",
        "(line 634,col 13)-(line 634,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.next()",
      "begin_line": 637,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 60)",
        "(line 640,col 13)-(line 640,col 29)",
        "(line 641,col 13)-(line 641,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.EntrySetIterator.remove()",
      "begin_line": 644,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 646,col 13)-(line 648,col 13)",
        "(line 650,col 13)-(line 650,col 49)",
        "(line 651,col 13)-(line 651,col 27)",
        "(line 652,col 13)-(line 652,col 44)",
        "(line 653,col 13)-(line 653,col 24)",
        "(line 654,col 13)-(line 654,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntryDecorator\u003cK, V\u003e"
      ],
      "begin_line": 661,
      "end_line": 687,
      "comment": "\n     * Inner class MapEntry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 664,
      "end_line": 664,
      "comment": " The parent map "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry.MapEntry(java.util.Map.Entry\u003cK, V\u003e, org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "\n         * Constructor.\n         * @param entry  the entry to decorate\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 672,col 13)-(line 672,col 25)",
        "(line 673,col 13)-(line 673,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.MapEntry.setValue(V)",
      "begin_line": 676,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 49)",
        "(line 679,col 13)-(line 683,col 13)",
        "(line 684,col 13)-(line 684,col 35)",
        "(line 685,col 13)-(line 685,col 41)"
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
      "begin_line": 692,
      "end_line": 780,
      "comment": "\n     * Inner class MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 695,
      "end_line": 695,
      "comment": " The parent map "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 698,
      "end_line": 698,
      "comment": " The iterator being wrapped "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 701,
      "end_line": 701,
      "comment": " The last returned entry "
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 704,
      "end_line": 704,
      "comment": " Whether remove is allowed at present "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.BidiMapIterator(org.apache.commons.collections4.bidimap.AbstractDualBidiMap\u003cK, V\u003e)",
      "begin_line": 710,
      "end_line": 714,
      "comment": "\n         * Constructor.\n         * @param parent  the parent map\n         ",
      "child_ranges": [
        "(line 711,col 13)-(line 711,col 20)",
        "(line 712,col 13)-(line 712,col 33)",
        "(line 713,col 13)-(line 713,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.hasNext()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 13)-(line 717,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.next()",
      "begin_line": 720,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 721,col 13)-(line 721,col 35)",
        "(line 722,col 13)-(line 722,col 29)",
        "(line 723,col 13)-(line 723,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.remove()",
      "begin_line": 726,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 727,col 13)-(line 729,col 13)",
        "(line 731,col 13)-(line 731,col 44)",
        "(line 732,col 13)-(line 732,col 30)",
        "(line 733,col 13)-(line 733,col 44)",
        "(line 734,col 13)-(line 734,col 24)",
        "(line 735,col 13)-(line 735,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.getKey()",
      "begin_line": 738,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 739,col 13)-(line 742,col 13)",
        "(line 743,col 13)-(line 743,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.getValue()",
      "begin_line": 746,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 747,col 13)-(line 750,col 13)",
        "(line 751,col 13)-(line 751,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.setValue(V)",
      "begin_line": 754,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 755,col 13)-(line 758,col 13)",
        "(line 759,col 13)-(line 763,col 13)",
        "(line 764,col 13)-(line 764,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.reset()",
      "begin_line": 767,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 768,col 13)-(line 768,col 62)",
        "(line 769,col 13)-(line 769,col 24)",
        "(line 770,col 13)-(line 770,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractDualBidiMap.BidiMapIterator.toString()",
      "begin_line": 773,
      "end_line": 779,
      "comment": "",
      "child_ranges": [
        "(line 775,col 13)-(line 777,col 13)",
        "(line 778,col 13)-(line 778,col 35)"
      ]
    }
  ]
}