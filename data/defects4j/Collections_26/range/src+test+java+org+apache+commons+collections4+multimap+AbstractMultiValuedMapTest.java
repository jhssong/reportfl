{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 52,
      "end_line": 1153,
      "comment": "\n * Abstract test class for {@link MultiValuedMap} contract and methods.\n * \u003cp\u003e\n * To use, extend this class and implement the {@link #makeObject} method and if\n * necessary override the {@link #makeFullMap()} method.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " MultiValuedHashMap created by reset(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.AbstractMultiValuedMapTest(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeObject()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getCompatibilityVersion()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAddSupported()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eput\u003c/code\u003e and\n     * \u003ccode\u003eputAll\u003c/code\u003e operations adding new mappings.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support put adding.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isRemoveSupported()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eremove\u003c/code\u003e and\n     * \u003ccode\u003eclear\u003c/code\u003e operations.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support removal operations.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAllowNullKey()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} supports null keys.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support null keys.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleKeys()",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * Returns the set of keys in the mappings used to test the map. This method\n     * must return an array with the same length as {@link #getSampleValues()}\n     * and all array elements must be different. The default implementation\n     * constructs a set of String keys, and includes a single null key if\n     * {@link #isAllowNullKey()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 119,col 10)",
        "(line 120,col 9)-(line 120,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleValues()",
      "begin_line": 129,
      "end_line": 136,
      "comment": "\n     * Returns the set of values in the mappings used to test the map. This\n     * method must return an array with the same length as\n     * {@link #getSampleKeys()}. The default implementation constructs a set of\n     * String values\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 134,col 10)",
        "(line 135,col 9)-(line 135,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeFullMap()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 54)",
        "(line 140,col 9)-(line 140,col 31)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.addSampleMappings(org.apache.commons.collections4.MultiValuedMap\u003c? super K, ? super V\u003e)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 146,col 45)",
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeConfirmedMap()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Override to return a MultiValuedMap other than MultiValuedHashMap as the\n     * confirmed map.\n     *\n     * @return a MultiValuedMap that is known to be valid\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getConfirmed()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.setConfirmed(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getMap()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetEmpty()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to empty.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)",
        "(line 179,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetFull()",
      "begin_line": 185,
      "end_line": 193,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to full.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 33)",
        "(line 187,col 9)-(line 187,col 44)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testNoMappingReturnsEmptyCol()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 55)",
        "(line 198,col 9)-(line 198,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMultipleValues()",
      "begin_line": 201,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 55)",
        "(line 203,col 9)-(line 204,col 47)",
        "(line 205,col 9)-(line 205,col 40)",
        "(line 206,col 9)-(line 206,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testGet()",
      "begin_line": 209,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 55)",
        "(line 212,col 9)-(line 212,col 55)",
        "(line 213,col 9)-(line 213,col 54)",
        "(line 214,col 9)-(line 214,col 55)",
        "(line 215,col 9)-(line 215,col 56)",
        "(line 216,col 9)-(line 216,col 58)",
        "(line 217,col 9)-(line 217,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAddMappingThroughGet()",
      "begin_line": 220,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 21)",
        "(line 226,col 9)-(line 226,col 51)",
        "(line 227,col 9)-(line 227,col 48)",
        "(line 228,col 9)-(line 228,col 48)",
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 36)",
        "(line 232,col 9)-(line 232,col 28)",
        "(line 233,col 9)-(line 233,col 27)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 235,col 54)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 44)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGet()",
      "begin_line": 243,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)",
        "(line 248,col 9)-(line 248,col 50)",
        "(line 249,col 9)-(line 250,col 47)",
        "(line 251,col 9)-(line 251,col 36)",
        "(line 252,col 9)-(line 252,col 36)",
        "(line 253,col 9)-(line 253,col 26)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 44)",
        "(line 256,col 9)-(line 256,col 55)",
        "(line 257,col 9)-(line 257,col 54)",
        "(line 258,col 9)-(line 258,col 46)",
        "(line 259,col 9)-(line 259,col 45)",
        "(line 260,col 9)-(line 260,col 36)",
        "(line 261,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 263,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGetIterator()",
      "begin_line": 266,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 20)",
        "(line 271,col 9)-(line 271,col 50)",
        "(line 272,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 44)",
        "(line 279,col 9)-(line 279,col 55)",
        "(line 280,col 9)-(line 280,col 54)",
        "(line 281,col 9)-(line 281,col 46)",
        "(line 282,col 9)-(line 282,col 45)",
        "(line 283,col 9)-(line 283,col 36)",
        "(line 284,col 9)-(line 284,col 47)",
        "(line 285,col 9)-(line 285,col 28)",
        "(line 286,col 9)-(line 286,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue()",
      "begin_line": 289,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 45)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 45)",
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 296,col 9)-(line 296,col 47)",
        "(line 297,col 9)-(line 297,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeyContainsValue()",
      "begin_line": 300,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 55)",
        "(line 302,col 9)-(line 302,col 54)",
        "(line 303,col 9)-(line 303,col 53)",
        "(line 304,col 9)-(line 304,col 54)",
        "(line 305,col 9)-(line 305,col 55)",
        "(line 306,col 9)-(line 306,col 57)",
        "(line 307,col 9)-(line 307,col 58)",
        "(line 308,col 9)-(line 308,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testValues()",
      "begin_line": 311,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 55)",
        "(line 314,col 9)-(line 314,col 53)",
        "(line 315,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 316,col 32)",
        "(line 317,col 9)-(line 317,col 33)",
        "(line 318,col 9)-(line 318,col 31)",
        "(line 319,col 9)-(line 319,col 33)",
        "(line 320,col 9)-(line 320,col 34)",
        "(line 321,col 9)-(line 321,col 45)",
        "(line 322,col 9)-(line 322,col 34)",
        "(line 323,col 9)-(line 323,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaValuesIterator()",
      "begin_line": 333,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 55)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 344,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveViaValuesRemove()",
      "begin_line": 347,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 352,col 44)",
        "(line 353,col 9)-(line 353,col 29)",
        "(line 354,col 9)-(line 354,col 28)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEntriesCollectionIterator()",
      "begin_line": 384,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 62)",
        "(line 387,col 9)-(line 387,col 70)",
        "(line 388,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaEntriesIterator()",
      "begin_line": 401,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 55)",
        "(line 407,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 49)",
        "(line 412,col 9)-(line 412,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapEquals()",
      "begin_line": 420,
      "end_line": 432,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 54)",
        "(line 426,col 9)-(line 426,col 49)",
        "(line 427,col 9)-(line 427,col 38)",
        "(line 428,col 9)-(line 428,col 40)",
        "(line 430,col 9)-(line 430,col 54)",
        "(line 431,col 9)-(line 431,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSizeWithPutRemove()",
      "begin_line": 434,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 54)",
        "(line 440,col 9)-(line 440,col 36)",
        "(line 441,col 9)-(line 441,col 35)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 35)",
        "(line 444,col 9)-(line 444,col 36)",
        "(line 445,col 9)-(line 445,col 35)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 35)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 24)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 37)",
        "(line 452,col 9)-(line 452,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeySetSize()",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 457,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize_Key()",
      "begin_line": 460,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 55)",
        "(line 463,col 9)-(line 463,col 51)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 53)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 35)",
        "(line 470,col 9)-(line 470,col 49)",
        "(line 472,col 9)-(line 472,col 35)",
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 49)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 476,col 49)",
        "(line 477,col 9)-(line 477,col 49)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 49)",
        "(line 480,col 9)-(line 480,col 49)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 24)",
        "(line 486,col 9)-(line 486,col 49)",
        "(line 487,col 9)-(line 487,col 37)",
        "(line 489,col 9)-(line 489,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue_Key()",
      "begin_line": 515,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 518,col 62)",
        "(line 519,col 9)-(line 519,col 61)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 35)",
        "(line 524,col 9)-(line 524,col 59)",
        "(line 525,col 9)-(line 525,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map1()",
      "begin_line": 528,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 59)",
        "(line 534,col 9)-(line 534,col 47)",
        "(line 535,col 9)-(line 535,col 47)",
        "(line 537,col 9)-(line 537,col 55)",
        "(line 538,col 9)-(line 538,col 44)",
        "(line 539,col 9)-(line 539,col 43)",
        "(line 540,col 9)-(line 540,col 30)",
        "(line 542,col 9)-(line 542,col 46)",
        "(line 543,col 9)-(line 543,col 37)",
        "(line 544,col 9)-(line 544,col 53)",
        "(line 545,col 9)-(line 545,col 52)",
        "(line 546,col 9)-(line 546,col 58)",
        "(line 547,col 9)-(line 547,col 58)",
        "(line 548,col 9)-(line 548,col 58)",
        "(line 549,col 9)-(line 549,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map2()",
      "begin_line": 552,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 55)",
        "(line 558,col 9)-(line 558,col 48)",
        "(line 559,col 9)-(line 559,col 48)",
        "(line 561,col 9)-(line 561,col 55)",
        "(line 562,col 9)-(line 562,col 44)",
        "(line 563,col 9)-(line 563,col 44)",
        "(line 564,col 9)-(line 564,col 30)",
        "(line 566,col 9)-(line 566,col 46)",
        "(line 567,col 9)-(line 567,col 37)",
        "(line 568,col 9)-(line 568,col 53)",
        "(line 569,col 9)-(line 569,col 53)",
        "(line 570,col 9)-(line 570,col 53)",
        "(line 571,col 9)-(line 571,col 58)",
        "(line 572,col 9)-(line 572,col 58)",
        "(line 573,col 9)-(line 573,col 58)",
        "(line 574,col 9)-(line 574,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_KeyIterable()",
      "begin_line": 577,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 54)",
        "(line 583,col 9)-(line 583,col 74)",
        "(line 585,col 9)-(line 585,col 54)",
        "(line 586,col 9)-(line 586,col 49)",
        "(line 587,col 9)-(line 587,col 58)",
        "(line 588,col 9)-(line 588,col 58)",
        "(line 589,col 9)-(line 589,col 58)",
        "(line 591,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 49)",
        "(line 599,col 9)-(line 599,col 58)",
        "(line 600,col 9)-(line 600,col 58)",
        "(line 601,col 9)-(line 601,col 58)",
        "(line 603,col 9)-(line 603,col 69)",
        "(line 604,col 9)-(line 604,col 49)",
        "(line 605,col 9)-(line 605,col 58)",
        "(line 606,col 9)-(line 606,col 58)",
        "(line 607,col 9)-(line 607,col 58)",
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 610,col 54)",
        "(line 611,col 9)-(line 611,col 49)",
        "(line 612,col 9)-(line 612,col 58)",
        "(line 613,col 9)-(line 613,col 58)",
        "(line 614,col 9)-(line 614,col 58)",
        "(line 615,col 9)-(line 615,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemove_KeyItem()",
      "begin_line": 618,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 54)",
        "(line 624,col 9)-(line 624,col 35)",
        "(line 625,col 9)-(line 625,col 35)",
        "(line 626,col 9)-(line 626,col 35)",
        "(line 627,col 9)-(line 627,col 58)",
        "(line 628,col 9)-(line 628,col 58)",
        "(line 629,col 9)-(line 629,col 57)",
        "(line 630,col 9)-(line 630,col 57)",
        "(line 631,col 9)-(line 631,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysMultiSet()",
      "begin_line": 635,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 49)",
        "(line 637,col 9)-(line 637,col 45)",
        "(line 638,col 9)-(line 638,col 53)",
        "(line 639,col 9)-(line 639,col 53)",
        "(line 640,col 9)-(line 640,col 55)",
        "(line 641,col 9)-(line 641,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagIterator()",
      "begin_line": 644,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 49)",
        "(line 646,col 9)-(line 646,col 47)",
        "(line 647,col 9)-(line 647,col 47)",
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 41)",
        "(line 652,col 9)-(line 652,col 45)",
        "(line 653,col 9)-(line 653,col 45)",
        "(line 654,col 9)-(line 654,col 47)",
        "(line 655,col 9)-(line 655,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagContainsAll()",
      "begin_line": 658,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 49)",
        "(line 661,col 9)-(line 661,col 45)",
        "(line 662,col 9)-(line 662,col 104)",
        "(line 663,col 9)-(line 663,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapGet()",
      "begin_line": 666,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 21)",
        "(line 668,col 9)-(line 668,col 56)",
        "(line 669,col 9)-(line 669,col 38)",
        "(line 670,col 9)-(line 670,col 39)",
        "(line 672,col 9)-(line 672,col 20)",
        "(line 673,col 9)-(line 673,col 34)",
        "(line 674,col 9)-(line 674,col 46)",
        "(line 675,col 9)-(line 675,col 27)",
        "(line 676,col 9)-(line 676,col 39)",
        "(line 677,col 9)-(line 677,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapPut()",
      "begin_line": 680,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 21)",
        "(line 686,col 9)-(line 686,col 56)",
        "(line 687,col 9)-(line 687,col 71)",
        "(line 688,col 9)-(line 688,col 35)",
        "(line 689,col 9)-(line 689,col 41)",
        "(line 690,col 9)-(line 690,col 48)",
        "(line 691,col 9)-(line 691,col 49)",
        "(line 692,col 9)-(line 692,col 50)",
        "(line 694,col 9)-(line 694,col 20)",
        "(line 695,col 9)-(line 695,col 34)",
        "(line 696,col 9)-(line 696,col 32)",
        "(line 697,col 9)-(line 697,col 27)",
        "(line 698,col 9)-(line 698,col 41)",
        "(line 699,col 9)-(line 699,col 50)",
        "(line 700,col 9)-(line 700,col 49)",
        "(line 701,col 9)-(line 701,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapRemove()",
      "begin_line": 704,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 20)",
        "(line 709,col 9)-(line 709,col 56)",
        "(line 710,col 9)-(line 710,col 29)",
        "(line 711,col 9)-(line 711,col 49)",
        "(line 712,col 9)-(line 712,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIterator()",
      "begin_line": 715,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 21)",
        "(line 717,col 9)-(line 717,col 58)",
        "(line 718,col 9)-(line 718,col 37)",
        "(line 720,col 9)-(line 720,col 20)",
        "(line 721,col 9)-(line 721,col 39)",
        "(line 722,col 9)-(line 726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorRemove()",
      "begin_line": 729,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 20)",
        "(line 734,col 9)-(line 734,col 57)",
        "(line 735,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorUnsupportedSet()",
      "begin_line": 742,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 20)",
        "(line 745,col 9)-(line 745,col 57)",
        "(line 746,col 9)-(line 746,col 21)",
        "(line 747,col 9)-(line 751,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEmptyMapCompatibility()",
      "begin_line": 759,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 54)",
        "(line 761,col 9)-(line 762,col 102)",
        "(line 763,col 9)-(line 763,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testFullMapCompatibility()",
      "begin_line": 766,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 49)",
        "(line 769,col 9)-(line 770,col 95)",
        "(line 771,col 9)-(line 771,col 71)",
        "(line 772,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapEntries()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n     * Bulk test {@link MultiValuedMap#entries()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapEntries",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cEntry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 798,
      "end_line": 866,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.TestMultiValuedMapEntries()",
      "begin_line": 799,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 800,col 13)-(line 800,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.getFullElements()",
      "begin_line": 803,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 806,col 13)-(line 806,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeObject()",
      "begin_line": 809,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeFullCollection()",
      "begin_line": 814,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 816,col 13)-(line 816,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isNullSupported()",
      "begin_line": 819,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 821,col 13)-(line 821,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isAddSupported()",
      "begin_line": 824,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 827,col 13)-(line 827,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isRemoveSupported()",
      "begin_line": 830,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 832,col 13)-(line 832,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isTestSerialization()",
      "begin_line": 835,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetFull()",
      "begin_line": 840,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 842,col 13)-(line 842,col 56)",
        "(line 843,col 13)-(line 843,col 78)",
        "(line 844,col 13)-(line 844,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetEmpty()",
      "begin_line": 847,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 57)",
        "(line 850,col 13)-(line 850,col 78)",
        "(line 851,col 13)-(line 851,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedCollection()",
      "begin_line": 854,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 857,col 13)-(line 857,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedFullCollection()",
      "begin_line": 860,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 863,col 13)-(line 863,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeySet()",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keySet()}. This method runs through all\n     * of the tests in {@link AbstractSetTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 880,
      "end_line": 921,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.TestMultiValuedMapKeySet()",
      "begin_line": 881,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 882,col 13)-(line 882,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.getFullElements()",
      "begin_line": 885,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 888,col 13)-(line 888,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeObject()",
      "begin_line": 891,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 893,col 13)-(line 893,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeFullCollection()",
      "begin_line": 896,
      "end_line": 899,
      "comment": "",
      "child_ranges": [
        "(line 898,col 13)-(line 898,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isNullSupported()",
      "begin_line": 901,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 903,col 13)-(line 903,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isAddSupported()",
      "begin_line": 906,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 908,col 13)-(line 908,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isRemoveSupported()",
      "begin_line": 911,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 913,col 13)-(line 913,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isTestSerialization()",
      "begin_line": 916,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 918,col 13)-(line 918,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapValues()",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * Bulk test {@link MultiValuedMap#values()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 936,
      "end_line": 1002,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.TestMultiValuedMapValues()",
      "begin_line": 937,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 13)-(line 938,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.getFullElements()",
      "begin_line": 941,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 13)-(line 943,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeObject()",
      "begin_line": 946,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 948,col 13)-(line 948,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeFullCollection()",
      "begin_line": 951,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 953,col 13)-(line 953,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isNullSupported()",
      "begin_line": 956,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 958,col 13)-(line 958,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isAddSupported()",
      "begin_line": 961,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 963,col 13)-(line 963,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isRemoveSupported()",
      "begin_line": 966,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 968,col 13)-(line 968,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isTestSerialization()",
      "begin_line": 971,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 973,col 13)-(line 973,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetFull()",
      "begin_line": 976,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 978,col 13)-(line 978,col 56)",
        "(line 979,col 13)-(line 979,col 77)",
        "(line 980,col 13)-(line 980,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetEmpty()",
      "begin_line": 983,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 985,col 13)-(line 985,col 57)",
        "(line 986,col 13)-(line 986,col 77)",
        "(line 987,col 13)-(line 987,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedCollection()",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 993,col 13)-(line 993,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedFullCollection()",
      "begin_line": 996,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 999,col 13)-(line 999,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeys()",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keys()}. This method runs through all of\n     * the tests in {@link AbstractBagTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractBagTest} instance for testing the map\u0027s values\n     *         collection\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeys",
      "is_interface": false,
      "parent_types": [
        "AbstractMultiSetTest\u003cK\u003e"
      ],
      "begin_line": 1017,
      "end_line": 1072,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.TestMultiValuedMapKeys()",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 13)-(line 1020,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.getFullElements()",
      "begin_line": 1023,
      "end_line": 1026,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 13)-(line 1025,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeObject()",
      "begin_line": 1028,
      "end_line": 1031,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 13)-(line 1030,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeFullCollection()",
      "begin_line": 1033,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 13)-(line 1035,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isNullSupported()",
      "begin_line": 1038,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 13)-(line 1040,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isAddSupported()",
      "begin_line": 1043,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 13)-(line 1045,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isRemoveSupported()",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 13)-(line 1050,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isTestSerialization()",
      "begin_line": 1053,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1055,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetFull()",
      "begin_line": 1058,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 13)-(line 1060,col 56)",
        "(line 1061,col 13)-(line 1061,col 75)",
        "(line 1062,col 13)-(line 1062,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetEmpty()",
      "begin_line": 1065,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1067,col 57)",
        "(line 1068,col 13)-(line 1068,col 75)",
        "(line 1069,col 13)-(line 1069,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestAsMap()",
      "begin_line": 1074,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapAsMap",
      "is_interface": false,
      "parent_types": [
        "AbstractMapTest\u003cK,Collection\u003cV\u003e\u003e"
      ],
      "begin_line": 1078,
      "end_line": 1152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.TestMultiValuedMapAsMap()",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 13)-(line 1081,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeObject()",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1086,col 13)-(line 1086,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeFullMap()",
      "begin_line": 1089,
      "end_line": 1092,
      "comment": "",
      "child_ranges": [
        "(line 1091,col 13)-(line 1091,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleKeys()",
      "begin_line": 1094,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 13)-(line 1097,col 77)",
        "(line 1098,col 13)-(line 1098,col 47)",
        "(line 1099,col 13)-(line 1101,col 13)",
        "(line 1102,col 13)-(line 1102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleValues()",
      "begin_line": 1105,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1108,col 13)-(line 1108,col 81)",
        "(line 1109,col 13)-(line 1109,col 55)",
        "(line 1110,col 13)-(line 1112,col 13)",
        "(line 1113,col 13)-(line 1113,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getNewSampleValues()",
      "begin_line": 1116,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 13)-(line 1119,col 84)",
        "(line 1120,col 13)-(line 1120,col 55)",
        "(line 1121,col 13)-(line 1123,col 13)",
        "(line 1124,col 13)-(line 1124,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isAllowNullKey()",
      "begin_line": 1127,
      "end_line": 1130,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 13)-(line 1129,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutAddSupported()",
      "begin_line": 1132,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 13)-(line 1134,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutChangeSupported()",
      "begin_line": 1137,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 13)-(line 1139,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isRemoveSupported()",
      "begin_line": 1142,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 13)-(line 1144,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isTestSerialization()",
      "begin_line": 1147,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 13)-(line 1149,col 25)"
      ]
    }
  ]
}