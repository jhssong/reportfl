{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/collection/CompositeCollectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeCollectionTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 384,
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
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 20)",
        "(line 128,col 9)-(line 152,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-c8358126-d93b-4697-960d-9d6a844891fe.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 131,col 17)-(line 133,col 17)",
        "(line 134,col 17)-(line 134,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-7e062aed-08cf-4a60-b3ef-ba21f476d5c9.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 17)-(line 141,col 17)",
        "(line 142,col 17)-(line 142,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-3b467b3d-b0ff-4b1b-a98a-e24465de4ec6.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 147,col 17)-(line 149,col 17)",
        "(line 150,col 17)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testSize()",
      "begin_line": 155,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)",
        "(line 158,col 9)-(line 158,col 48)",
        "(line 159,col 9)-(line 159,col 25)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 162,col 9)-(line 162,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testMultipleCollectionsSize()",
      "begin_line": 165,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 20)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 169,col 25)",
        "(line 170,col 9)-(line 170,col 25)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 172,col 9)-(line 172,col 50)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 31)",
        "(line 175,col 9)-(line 175,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testIsEmpty()",
      "begin_line": 178,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 20)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testIterator()",
      "begin_line": 190,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 20)",
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 194,col 25)",
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 29)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 26)",
        "(line 199,col 9)-(line 199,col 37)",
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 201,col 24)",
        "(line 202,col 9)-(line 202,col 19)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 204,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testClear()",
      "begin_line": 207,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 20)",
        "(line 210,col 9)-(line 210,col 25)",
        "(line 211,col 9)-(line 211,col 25)",
        "(line 212,col 9)-(line 212,col 34)",
        "(line 213,col 9)-(line 213,col 18)",
        "(line 214,col 9)-(line 214,col 34)",
        "(line 215,col 9)-(line 215,col 34)",
        "(line 216,col 9)-(line 216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testContainsAll()",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 223,col 25)",
        "(line 224,col 9)-(line 224,col 29)",
        "(line 225,col 9)-(line 225,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRetainAll()",
      "begin_line": 228,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 20)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 233,col 25)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 235,col 9)-(line 235,col 25)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddAllMutator()",
      "begin_line": 242,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 20)",
        "(line 245,col 9)-(line 266,col 11)",
        "(line 268,col 9)-(line 268,col 29)",
        "(line 269,col 9)-(line 269,col 27)",
        "(line 270,col 9)-(line 270,col 22)",
        "(line 271,col 9)-(line 271,col 38)",
        "(line 272,col 9)-(line 272,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-07c97008-e1bc-4842-9428-c7b373b3501f.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 248,col 17)-(line 250,col 17)",
        "(line 251,col 17)-(line 251,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-04cd019b-b7e3-4f9a-9dd0-8980c42bec78.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 254,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 256,col 17)-(line 258,col 17)",
        "(line 259,col 17)-(line 259,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-8c1ec45d-d322-4bad-b625-7da7711eac78.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 17)-(line 264,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddMutator()",
      "begin_line": 275,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 20)",
        "(line 278,col 9)-(line 299,col 11)",
        "(line 301,col 9)-(line 301,col 29)",
        "(line 302,col 9)-(line 302,col 25)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-a7b025b7-c604-4dbb-9b12-1fc4978c0f63.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 279,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 281,col 17)-(line 283,col 17)",
        "(line 284,col 17)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-3d10d87b-356a-473f-bf96-8bac7433d96f.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 289,col 17)-(line 291,col 17)",
        "(line 292,col 17)-(line 292,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.Anonymous-75478585-1f43-4344-b327-075229fed117.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testToCollection()",
      "begin_line": 307,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 20)",
        "(line 310,col 9)-(line 310,col 25)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 34)",
        "(line 313,col 9)-(line 313,col 51)",
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 316,col 25)",
        "(line 317,col 9)-(line 317,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testAddAllToCollection()",
      "begin_line": 320,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 20)",
        "(line 323,col 9)-(line 323,col 25)",
        "(line 324,col 9)-(line 324,col 25)",
        "(line 325,col 9)-(line 325,col 34)",
        "(line 326,col 9)-(line 326,col 60)",
        "(line 327,col 9)-(line 327,col 31)",
        "(line 328,col 9)-(line 328,col 48)",
        "(line 329,col 9)-(line 329,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemove()",
      "begin_line": 332,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 27)",
        "(line 335,col 9)-(line 335,col 25)",
        "(line 336,col 9)-(line 336,col 25)",
        "(line 337,col 9)-(line 337,col 25)",
        "(line 338,col 9)-(line 338,col 34)",
        "(line 339,col 9)-(line 339,col 22)",
        "(line 340,col 9)-(line 340,col 37)",
        "(line 341,col 9)-(line 341,col 39)",
        "(line 342,col 9)-(line 342,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemoveAll()",
      "begin_line": 345,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 27)",
        "(line 348,col 9)-(line 348,col 25)",
        "(line 349,col 9)-(line 349,col 25)",
        "(line 350,col 9)-(line 350,col 25)",
        "(line 352,col 9)-(line 352,col 61)",
        "(line 353,col 9)-(line 353,col 34)",
        "(line 354,col 9)-(line 354,col 30)",
        "(line 355,col 9)-(line 355,col 37)",
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 357,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.testRemoveComposited()",
      "begin_line": 360,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 27)",
        "(line 363,col 9)-(line 363,col 25)",
        "(line 364,col 9)-(line 364,col 25)",
        "(line 365,col 9)-(line 365,col 25)",
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 367,col 32)",
        "(line 368,col 9)-(line 368,col 36)",
        "(line 369,col 9)-(line 369,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollectionTest.getCompatibilityVersion()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 19)"
      ]
    }
  ]
}