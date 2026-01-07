{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 544,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.\n * \n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 39,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleA.hashCode()",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 51,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleB.hashCode()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 13)-(line 49,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.HashCodeBuilderTest(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx1()",
      "begin_line": 59,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx2()",
      "begin_line": 69,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.TestObject(int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 86,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 90,col 13)",
        "(line 91,col 13)-(line 93,col 13)",
        "(line 94,col 13)-(line 94,col 44)",
        "(line 95,col 13)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.getA()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 107,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 110,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 21)",
        "(line 119,col 13)-(line 119,col 23)",
        "(line 120,col 13)-(line 120,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 123,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 130,col 13)",
        "(line 131,col 13)-(line 131,col 50)",
        "(line 132,col 13)-(line 132,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 85)",
        "(line 138,col 9)-(line 138,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 99)",
        "(line 143,col 9)-(line 143,col 110)",
        "(line 144,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1()",
      "begin_line": 150,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 159,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 168,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 177,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 186,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 34)",
        "(line 197,col 9)-(line 198,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 84)",
        "(line 204,col 9)-(line 204,col 27)",
        "(line 205,col 9)-(line 205,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild()",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 26)",
        "(line 210,col 9)-(line 210,col 90)",
        "(line 211,col 9)-(line 211,col 27)",
        "(line 212,col 9)-(line 212,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 215,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 90)",
        "(line 218,col 9)-(line 219,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 222,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 88)",
        "(line 225,col 9)-(line 225,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 90)",
        "(line 230,col 9)-(line 230,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 89)",
        "(line 235,col 9)-(line 235,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 89)",
        "(line 240,col 9)-(line 240,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 92)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 247,col 44)",
        "(line 248,col 9)-(line 248,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 251,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 91)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 89)",
        "(line 261,col 9)-(line 261,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 264,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 96)",
        "(line 266,col 9)-(line 266,col 37)",
        "(line 267,col 9)-(line 267,col 91)",
        "(line 268,col 9)-(line 268,col 30)",
        "(line 269,col 9)-(line 269,col 111)",
        "(line 270,col 9)-(line 270,col 30)",
        "(line 271,col 9)-(line 272,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 275,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 37)",
        "(line 277,col 9)-(line 277,col 100)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 120)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 282,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 285,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 94)",
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 91)",
        "(line 289,col 9)-(line 289,col 20)",
        "(line 290,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 291,col 96)",
        "(line 292,col 9)-(line 292,col 20)",
        "(line 293,col 9)-(line 293,col 41)",
        "(line 294,col 9)-(line 294,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 297,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 33)",
        "(line 299,col 9)-(line 299,col 100)",
        "(line 300,col 9)-(line 300,col 20)",
        "(line 301,col 9)-(line 301,col 41)",
        "(line 302,col 9)-(line 302,col 105)",
        "(line 303,col 9)-(line 303,col 20)",
        "(line 304,col 9)-(line 304,col 41)",
        "(line 305,col 9)-(line 305,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 308,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 93)",
        "(line 310,col 9)-(line 310,col 31)",
        "(line 311,col 9)-(line 311,col 91)",
        "(line 312,col 9)-(line 312,col 19)",
        "(line 313,col 9)-(line 313,col 95)",
        "(line 314,col 9)-(line 314,col 19)",
        "(line 315,col 9)-(line 315,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 318,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 31)",
        "(line 320,col 9)-(line 320,col 100)",
        "(line 321,col 9)-(line 321,col 19)",
        "(line 322,col 9)-(line 322,col 104)",
        "(line 323,col 9)-(line 323,col 19)",
        "(line 324,col 9)-(line 324,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 327,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 95)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 91)",
        "(line 331,col 9)-(line 331,col 27)",
        "(line 332,col 9)-(line 332,col 95)",
        "(line 333,col 9)-(line 333,col 27)",
        "(line 334,col 9)-(line 334,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 337,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 35)",
        "(line 339,col 9)-(line 339,col 100)",
        "(line 340,col 9)-(line 340,col 27)",
        "(line 341,col 9)-(line 341,col 104)",
        "(line 342,col 9)-(line 342,col 27)",
        "(line 343,col 9)-(line 343,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 346,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 94)",
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 91)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 95)",
        "(line 352,col 9)-(line 352,col 26)",
        "(line 353,col 9)-(line 353,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 356,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 33)",
        "(line 358,col 9)-(line 358,col 100)",
        "(line 359,col 9)-(line 359,col 26)",
        "(line 360,col 9)-(line 360,col 104)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 365,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 94)",
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 368,col 91)",
        "(line 369,col 9)-(line 369,col 26)",
        "(line 370,col 9)-(line 370,col 95)",
        "(line 371,col 9)-(line 371,col 26)",
        "(line 372,col 9)-(line 372,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 375,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 33)",
        "(line 377,col 9)-(line 377,col 100)",
        "(line 378,col 9)-(line 378,col 26)",
        "(line 379,col 9)-(line 379,col 104)",
        "(line 380,col 9)-(line 380,col 26)",
        "(line 381,col 9)-(line 381,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 384,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 96)",
        "(line 386,col 9)-(line 386,col 37)",
        "(line 387,col 9)-(line 387,col 91)",
        "(line 388,col 9)-(line 388,col 22)",
        "(line 389,col 9)-(line 389,col 48)",
        "(line 390,col 9)-(line 390,col 41)",
        "(line 391,col 9)-(line 391,col 96)",
        "(line 392,col 9)-(line 392,col 22)",
        "(line 393,col 9)-(line 393,col 48)",
        "(line 394,col 9)-(line 394,col 41)",
        "(line 395,col 9)-(line 395,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 398,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 37)",
        "(line 400,col 9)-(line 400,col 100)",
        "(line 401,col 9)-(line 401,col 22)",
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 41)",
        "(line 404,col 9)-(line 404,col 105)",
        "(line 405,col 9)-(line 405,col 22)",
        "(line 406,col 9)-(line 406,col 48)",
        "(line 407,col 9)-(line 407,col 41)",
        "(line 408,col 9)-(line 408,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 411,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 95)",
        "(line 413,col 9)-(line 413,col 35)",
        "(line 414,col 9)-(line 414,col 91)",
        "(line 415,col 9)-(line 415,col 22)",
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 417,col 96)",
        "(line 418,col 9)-(line 418,col 22)",
        "(line 419,col 9)-(line 419,col 44)",
        "(line 420,col 9)-(line 420,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 423,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 35)",
        "(line 425,col 9)-(line 425,col 100)",
        "(line 426,col 9)-(line 426,col 22)",
        "(line 427,col 9)-(line 427,col 44)",
        "(line 428,col 9)-(line 428,col 105)",
        "(line 429,col 9)-(line 429,col 22)",
        "(line 430,col 9)-(line 430,col 44)",
        "(line 431,col 9)-(line 431,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 434,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 97)",
        "(line 436,col 9)-(line 436,col 39)",
        "(line 437,col 9)-(line 437,col 99)",
        "(line 438,col 9)-(line 438,col 22)",
        "(line 439,col 9)-(line 439,col 99)",
        "(line 440,col 9)-(line 440,col 23)",
        "(line 441,col 9)-(line 441,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 444,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 39)",
        "(line 446,col 9)-(line 446,col 108)",
        "(line 447,col 9)-(line 447,col 22)",
        "(line 448,col 9)-(line 448,col 108)",
        "(line 449,col 9)-(line 449,col 23)",
        "(line 450,col 9)-(line 450,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 453,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 43)",
        "(line 455,col 9)-(line 455,col 91)",
        "(line 456,col 9)-(line 456,col 32)",
        "(line 457,col 9)-(line 457,col 84)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 95)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 106)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 463,col 9)-(line 463,col 106)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 468,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 83)",
        "(line 471,col 9)-(line 471,col 97)",
        "(line 473,col 9)-(line 473,col 114)",
        "(line 474,col 9)-(line 474,col 113)",
        "(line 475,col 9)-(line 475,col 118)",
        "(line 477,col 9)-(line 477,col 107)",
        "(line 478,col 9)-(line 478,col 109)",
        "(line 480,col 9)-(line 480,col 105)",
        "(line 482,col 9)-(line 482,col 101)",
        "(line 483,col 9)-(line 483,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 486,
      "end_line": 501,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 487,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 490,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 493,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 496,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 27)",
        "(line 498,col 13)-(line 498,col 27)",
        "(line 499,col 13)-(line 499,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle()",
      "begin_line": 506,
      "end_line": 533,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 60)",
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 16)",
        "(line 510,col 9)-(line 510,col 16)",
        "(line 529,col 9)-(line 529,col 21)",
        "(line 530,col 9)-(line 530,col 50)",
        "(line 531,col 9)-(line 531,col 21)",
        "(line 532,col 9)-(line 532,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 91)",
        "(line 540,col 9)-(line 541,col 55)"
      ]
    }
  ]
}