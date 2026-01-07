{
  "filepath": "/tmp/Lang-13b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 586,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.\n * \n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 43,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleA.hashCode()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleB.hashCode()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx1()",
      "begin_line": 59,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx2()",
      "begin_line": 70,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 81,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.TestObject(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 88,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 92,col 13)",
        "(line 93,col 13)-(line 95,col 13)",
        "(line 96,col 13)-(line 96,col 44)",
        "(line 97,col 13)-(line 97,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.getA()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 109,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 112,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 21)",
        "(line 121,col 13)-(line 121,col 23)",
        "(line 122,col 13)-(line 122,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 129,col 13)",
        "(line 130,col 13)-(line 132,col 13)",
        "(line 133,col 13)-(line 133,col 50)",
        "(line 134,col 13)-(line 134,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 85)",
        "(line 141,col 9)-(line 141,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 99)",
        "(line 147,col 9)-(line 147,col 110)",
        "(line 148,col 9)-(line 149,col 21)",
        "(line 150,col 9)-(line 151,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1()",
      "begin_line": 154,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 164,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 174,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 184,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 194,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 34)",
        "(line 207,col 9)-(line 208,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 26)",
        "(line 214,col 9)-(line 214,col 84)",
        "(line 215,col 9)-(line 215,col 27)",
        "(line 216,col 9)-(line 216,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild()",
      "begin_line": 219,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 26)",
        "(line 222,col 9)-(line 222,col 90)",
        "(line 223,col 9)-(line 223,col 27)",
        "(line 224,col 9)-(line 224,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 227,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 90)",
        "(line 231,col 9)-(line 232,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 235,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 88)",
        "(line 239,col 9)-(line 239,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 242,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 90)",
        "(line 245,col 9)-(line 245,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 248,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 89)",
        "(line 251,col 9)-(line 251,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 254,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 89)",
        "(line 257,col 9)-(line 257,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 260,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 92)",
        "(line 264,col 9)-(line 264,col 30)",
        "(line 265,col 9)-(line 265,col 44)",
        "(line 266,col 9)-(line 266,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 269,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 91)",
        "(line 273,col 9)-(line 273,col 27)",
        "(line 274,col 9)-(line 274,col 40)",
        "(line 275,col 9)-(line 275,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 89)",
        "(line 281,col 9)-(line 281,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 284,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 96)",
        "(line 287,col 9)-(line 287,col 37)",
        "(line 288,col 9)-(line 288,col 89)",
        "(line 289,col 9)-(line 289,col 30)",
        "(line 290,col 9)-(line 290,col 111)",
        "(line 291,col 9)-(line 291,col 30)",
        "(line 292,col 9)-(line 293,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 296,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 37)",
        "(line 299,col 9)-(line 299,col 98)",
        "(line 300,col 9)-(line 300,col 30)",
        "(line 301,col 9)-(line 301,col 120)",
        "(line 302,col 9)-(line 302,col 30)",
        "(line 303,col 9)-(line 304,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 307,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 94)",
        "(line 310,col 9)-(line 310,col 33)",
        "(line 311,col 9)-(line 311,col 89)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 313,col 9)-(line 313,col 39)",
        "(line 314,col 9)-(line 314,col 96)",
        "(line 315,col 9)-(line 315,col 20)",
        "(line 316,col 9)-(line 316,col 39)",
        "(line 317,col 9)-(line 317,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 320,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 33)",
        "(line 323,col 9)-(line 323,col 98)",
        "(line 324,col 9)-(line 324,col 20)",
        "(line 325,col 9)-(line 325,col 39)",
        "(line 326,col 9)-(line 326,col 105)",
        "(line 327,col 9)-(line 327,col 20)",
        "(line 328,col 9)-(line 328,col 39)",
        "(line 329,col 9)-(line 329,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 332,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 93)",
        "(line 335,col 9)-(line 335,col 31)",
        "(line 336,col 9)-(line 336,col 89)",
        "(line 337,col 9)-(line 337,col 19)",
        "(line 338,col 9)-(line 338,col 95)",
        "(line 339,col 9)-(line 339,col 19)",
        "(line 340,col 9)-(line 340,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 343,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 31)",
        "(line 346,col 9)-(line 346,col 98)",
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 348,col 104)",
        "(line 349,col 9)-(line 349,col 19)",
        "(line 350,col 9)-(line 350,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 353,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 95)",
        "(line 356,col 9)-(line 356,col 35)",
        "(line 357,col 9)-(line 357,col 89)",
        "(line 358,col 9)-(line 358,col 27)",
        "(line 359,col 9)-(line 359,col 95)",
        "(line 360,col 9)-(line 360,col 27)",
        "(line 361,col 9)-(line 361,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 364,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 35)",
        "(line 367,col 9)-(line 367,col 98)",
        "(line 368,col 9)-(line 368,col 27)",
        "(line 369,col 9)-(line 369,col 104)",
        "(line 370,col 9)-(line 370,col 27)",
        "(line 371,col 9)-(line 371,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 374,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 94)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 378,col 9)-(line 378,col 89)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 380,col 95)",
        "(line 381,col 9)-(line 381,col 26)",
        "(line 382,col 9)-(line 382,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 385,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 33)",
        "(line 388,col 9)-(line 388,col 98)",
        "(line 389,col 9)-(line 389,col 26)",
        "(line 390,col 9)-(line 390,col 104)",
        "(line 391,col 9)-(line 391,col 26)",
        "(line 392,col 9)-(line 392,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 395,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 94)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 399,col 89)",
        "(line 400,col 9)-(line 400,col 26)",
        "(line 401,col 9)-(line 401,col 95)",
        "(line 402,col 9)-(line 402,col 26)",
        "(line 403,col 9)-(line 403,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 406,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 409,col 98)",
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 411,col 104)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 416,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 96)",
        "(line 419,col 9)-(line 419,col 37)",
        "(line 420,col 9)-(line 420,col 89)",
        "(line 421,col 9)-(line 421,col 22)",
        "(line 422,col 9)-(line 422,col 48)",
        "(line 423,col 9)-(line 423,col 39)",
        "(line 424,col 9)-(line 424,col 96)",
        "(line 425,col 9)-(line 425,col 22)",
        "(line 426,col 9)-(line 426,col 48)",
        "(line 427,col 9)-(line 427,col 39)",
        "(line 428,col 9)-(line 428,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 431,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 37)",
        "(line 434,col 9)-(line 434,col 98)",
        "(line 435,col 9)-(line 435,col 22)",
        "(line 436,col 9)-(line 436,col 48)",
        "(line 437,col 9)-(line 437,col 39)",
        "(line 438,col 9)-(line 438,col 105)",
        "(line 439,col 9)-(line 439,col 22)",
        "(line 440,col 9)-(line 440,col 48)",
        "(line 441,col 9)-(line 441,col 39)",
        "(line 442,col 9)-(line 442,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 445,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 95)",
        "(line 448,col 9)-(line 448,col 35)",
        "(line 449,col 9)-(line 449,col 89)",
        "(line 450,col 9)-(line 450,col 22)",
        "(line 451,col 9)-(line 451,col 44)",
        "(line 452,col 9)-(line 452,col 96)",
        "(line 453,col 9)-(line 453,col 22)",
        "(line 454,col 9)-(line 454,col 44)",
        "(line 455,col 9)-(line 455,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 458,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 35)",
        "(line 461,col 9)-(line 461,col 98)",
        "(line 462,col 9)-(line 462,col 22)",
        "(line 463,col 9)-(line 463,col 44)",
        "(line 464,col 9)-(line 464,col 105)",
        "(line 465,col 9)-(line 465,col 22)",
        "(line 466,col 9)-(line 466,col 44)",
        "(line 467,col 9)-(line 467,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 470,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 97)",
        "(line 473,col 9)-(line 473,col 39)",
        "(line 474,col 9)-(line 474,col 99)",
        "(line 475,col 9)-(line 475,col 22)",
        "(line 476,col 9)-(line 476,col 99)",
        "(line 477,col 9)-(line 477,col 23)",
        "(line 478,col 9)-(line 478,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 481,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)",
        "(line 484,col 9)-(line 484,col 108)",
        "(line 485,col 9)-(line 485,col 22)",
        "(line 486,col 9)-(line 486,col 108)",
        "(line 487,col 9)-(line 487,col 23)",
        "(line 488,col 9)-(line 488,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 491,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 43)",
        "(line 494,col 9)-(line 494,col 89)",
        "(line 495,col 9)-(line 495,col 32)",
        "(line 496,col 9)-(line 496,col 84)",
        "(line 497,col 9)-(line 497,col 32)",
        "(line 498,col 9)-(line 498,col 95)",
        "(line 499,col 9)-(line 499,col 32)",
        "(line 500,col 9)-(line 500,col 106)",
        "(line 501,col 9)-(line 501,col 25)",
        "(line 502,col 9)-(line 502,col 106)",
        "(line 503,col 9)-(line 503,col 32)",
        "(line 504,col 9)-(line 504,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 507,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 83)",
        "(line 511,col 9)-(line 511,col 95)",
        "(line 513,col 9)-(line 513,col 112)",
        "(line 514,col 9)-(line 514,col 111)",
        "(line 515,col 9)-(line 515,col 116)",
        "(line 517,col 9)-(line 517,col 105)",
        "(line 518,col 9)-(line 518,col 107)",
        "(line 520,col 9)-(line 520,col 103)",
        "(line 522,col 9)-(line 522,col 101)",
        "(line 523,col 9)-(line 523,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 526,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 527,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 530,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 533,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 536,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 27)",
        "(line 538,col 13)-(line 538,col 27)",
        "(line 539,col 13)-(line 539,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle()",
      "begin_line": 546,
      "end_line": 574,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 60)",
        "(line 549,col 9)-(line 549,col 60)",
        "(line 550,col 9)-(line 550,col 16)",
        "(line 551,col 9)-(line 551,col 16)",
        "(line 570,col 9)-(line 570,col 21)",
        "(line 571,col 9)-(line 571,col 50)",
        "(line 572,col 9)-(line 572,col 21)",
        "(line 573,col 9)-(line 573,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 579,
      "end_line": 584,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 91)",
        "(line 582,col 9)-(line 583,col 55)"
      ]
    }
  ]
}