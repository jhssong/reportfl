{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/collection/CompositeCollectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeCollectionTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 393,
      "comment": "\n * Extension of {@link AbstractCollectionTest} for exercising the\n * {@link CompositeCollection} implementation.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.CompositeCollectionTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.isAddSupported()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Run stock collection tests without Mutator, so turn off add, remove\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.isRemoveSupported()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.makeObject()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Empty collection is empty composite\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.makeConfirmedCollection()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.getFullElements()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.makeFullCollection()",
      "begin_line": 75,
      "end_line": 85,
      "comment": "\n     * Full collection consists of 4 collections, each with one element\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 88)",
        "(line 78,col 9)-(line 78,col 47)",
        "(line 79,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.makeConfirmedFullCollection()",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * Full collection should look like a collection with 4 elements\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 58)",
        "(line 93,col 9)-(line 93,col 60)",
        "(line 94,col 9)-(line 94,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testUnsupportedRemove()",
      "begin_line": 101,
      "end_line": 111,
      "comment": "\n     * Override testUnsupportedRemove, since the default impl expects removeAll,\n     * retainAll and iterator().remove to throw\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)",
        "(line 104,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.setUpTest()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 31)",
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.setUpMutatorTest()",
      "begin_line": 125,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 20)",
        "(line 128,col 9)-(line 155,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-36a49d43-edac-46e9-abdc-5617f7b0f708.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 132,col 17)-(line 134,col 17)",
        "(line 135,col 17)-(line 135,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-9140b1c9-41ae-473c-97b0-460e90c52d50.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 17)-(line 143,col 17)",
        "(line 144,col 17)-(line 144,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-ead9cbed-efb4-47d8-a049-d0d3dbc5fe51.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 150,col 17)-(line 152,col 17)",
        "(line 153,col 17)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testSize()",
      "begin_line": 158,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 20)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 162,col 9)-(line 162,col 25)",
        "(line 163,col 9)-(line 163,col 25)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 165,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testMultipleCollectionsSize()",
      "begin_line": 168,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 20)",
        "(line 171,col 9)-(line 171,col 48)",
        "(line 172,col 9)-(line 172,col 25)",
        "(line 173,col 9)-(line 173,col 25)",
        "(line 174,col 9)-(line 174,col 29)",
        "(line 175,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 31)",
        "(line 178,col 9)-(line 178,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testIsEmpty()",
      "begin_line": 181,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 20)",
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 50)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 187,col 9)-(line 187,col 32)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testIterator()",
      "begin_line": 193,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 25)",
        "(line 197,col 9)-(line 197,col 25)",
        "(line 198,col 9)-(line 198,col 29)",
        "(line 199,col 9)-(line 199,col 29)",
        "(line 200,col 9)-(line 200,col 43)",
        "(line 201,col 9)-(line 201,col 26)",
        "(line 202,col 9)-(line 202,col 37)",
        "(line 203,col 9)-(line 203,col 39)",
        "(line 204,col 9)-(line 204,col 24)",
        "(line 205,col 9)-(line 205,col 19)",
        "(line 206,col 9)-(line 206,col 38)",
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testClear()",
      "begin_line": 210,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 20)",
        "(line 213,col 9)-(line 213,col 25)",
        "(line 214,col 9)-(line 214,col 25)",
        "(line 215,col 9)-(line 215,col 34)",
        "(line 216,col 9)-(line 216,col 18)",
        "(line 217,col 9)-(line 217,col 34)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testContainsAll()",
      "begin_line": 222,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 20)",
        "(line 225,col 9)-(line 225,col 25)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRetainAll()",
      "begin_line": 231,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 20)",
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 25)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 25)",
        "(line 239,col 9)-(line 239,col 37)",
        "(line 240,col 9)-(line 240,col 39)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 242,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddAllMutator()",
      "begin_line": 245,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 20)",
        "(line 248,col 9)-(line 272,col 11)",
        "(line 274,col 9)-(line 274,col 29)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 276,col 22)",
        "(line 277,col 9)-(line 277,col 38)",
        "(line 278,col 9)-(line 278,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-8f69e7bd-7fa7-4959-abc8-debee886775f.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 249,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 252,col 17)-(line 254,col 17)",
        "(line 255,col 17)-(line 255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-c372d775-a9b3-4a9a-8c45-d8d54d103765.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 258,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 261,col 17)-(line 263,col 17)",
        "(line 264,col 17)-(line 264,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-57b0de0b-e701-431b-b0c5-26cb049ac3a1.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 267,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 17)-(line 270,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddMutator()",
      "begin_line": 281,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 20)",
        "(line 284,col 9)-(line 308,col 11)",
        "(line 310,col 9)-(line 310,col 29)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-35cbd1ad-28e4-4b3a-aff5-7b6cc5571b55.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 285,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 288,col 17)-(line 290,col 17)",
        "(line 291,col 17)-(line 291,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-856c64c7-c364-4bc5-a1c0-3ea86e95b758.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 294,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 299,col 17)",
        "(line 300,col 17)-(line 300,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-e034bc32-e144-41fa-962b-cb0e244af04a.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 17)-(line 306,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testToCollection()",
      "begin_line": 316,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 20)",
        "(line 319,col 9)-(line 319,col 25)",
        "(line 320,col 9)-(line 320,col 25)",
        "(line 321,col 9)-(line 321,col 34)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 43)",
        "(line 325,col 9)-(line 325,col 25)",
        "(line 326,col 9)-(line 326,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddAllToCollection()",
      "begin_line": 329,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 20)",
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 25)",
        "(line 334,col 9)-(line 334,col 34)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 31)",
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemove()",
      "begin_line": 341,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 27)",
        "(line 344,col 9)-(line 344,col 25)",
        "(line 345,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 34)",
        "(line 348,col 9)-(line 348,col 22)",
        "(line 349,col 9)-(line 349,col 37)",
        "(line 350,col 9)-(line 350,col 39)",
        "(line 351,col 9)-(line 351,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemoveAll()",
      "begin_line": 354,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 27)",
        "(line 357,col 9)-(line 357,col 25)",
        "(line 358,col 9)-(line 358,col 25)",
        "(line 359,col 9)-(line 359,col 25)",
        "(line 361,col 9)-(line 361,col 61)",
        "(line 362,col 9)-(line 362,col 34)",
        "(line 363,col 9)-(line 363,col 30)",
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 365,col 39)",
        "(line 366,col 9)-(line 366,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemoveComposited()",
      "begin_line": 369,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 27)",
        "(line 372,col 9)-(line 372,col 25)",
        "(line 373,col 9)-(line 373,col 25)",
        "(line 374,col 9)-(line 374,col 25)",
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 376,col 32)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.getCompatibilityVersion()",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 19)"
      ]
    }
  ]
}