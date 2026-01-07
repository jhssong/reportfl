{
  "filepath": "/tmp/Lang-25b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 545,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 40,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleA.hashCode()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 52,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleB.hashCode()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.HashCodeBuilderTest(java.lang.String)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx1()",
      "begin_line": 60,
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
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.TestObject(int)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 91,col 13)",
        "(line 92,col 13)-(line 94,col 13)",
        "(line 95,col 13)-(line 95,col 44)",
        "(line 96,col 13)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.getA()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 108,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 21)",
        "(line 120,col 13)-(line 120,col 23)",
        "(line 121,col 13)-(line 121,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 128,col 13)",
        "(line 129,col 13)-(line 131,col 13)",
        "(line 132,col 13)-(line 132,col 50)",
        "(line 133,col 13)-(line 133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 85)",
        "(line 139,col 9)-(line 139,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 99)",
        "(line 144,col 9)-(line 144,col 110)",
        "(line 145,col 9)-(line 146,col 21)",
        "(line 147,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1()",
      "begin_line": 151,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 169,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 178,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 187,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 34)",
        "(line 198,col 9)-(line 199,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 26)",
        "(line 204,col 9)-(line 204,col 84)",
        "(line 205,col 9)-(line 205,col 27)",
        "(line 206,col 9)-(line 206,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild()",
      "begin_line": 209,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 26)",
        "(line 211,col 9)-(line 211,col 90)",
        "(line 212,col 9)-(line 212,col 27)",
        "(line 213,col 9)-(line 213,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 216,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 90)",
        "(line 219,col 9)-(line 220,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 88)",
        "(line 226,col 9)-(line 226,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 90)",
        "(line 231,col 9)-(line 231,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 89)",
        "(line 236,col 9)-(line 236,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 89)",
        "(line 241,col 9)-(line 241,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 244,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 92)",
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 252,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 91)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 257,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 89)",
        "(line 262,col 9)-(line 262,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 265,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 96)",
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 91)",
        "(line 269,col 9)-(line 269,col 30)",
        "(line 270,col 9)-(line 270,col 111)",
        "(line 271,col 9)-(line 271,col 30)",
        "(line 272,col 9)-(line 273,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 276,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 37)",
        "(line 278,col 9)-(line 278,col 100)",
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 280,col 120)",
        "(line 281,col 9)-(line 281,col 30)",
        "(line 282,col 9)-(line 283,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 286,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 94)",
        "(line 288,col 9)-(line 288,col 33)",
        "(line 289,col 9)-(line 289,col 91)",
        "(line 290,col 9)-(line 290,col 20)",
        "(line 291,col 9)-(line 291,col 41)",
        "(line 292,col 9)-(line 292,col 96)",
        "(line 293,col 9)-(line 293,col 20)",
        "(line 294,col 9)-(line 294,col 41)",
        "(line 295,col 9)-(line 295,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 298,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 33)",
        "(line 300,col 9)-(line 300,col 100)",
        "(line 301,col 9)-(line 301,col 20)",
        "(line 302,col 9)-(line 302,col 41)",
        "(line 303,col 9)-(line 303,col 105)",
        "(line 304,col 9)-(line 304,col 20)",
        "(line 305,col 9)-(line 305,col 41)",
        "(line 306,col 9)-(line 306,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 309,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 93)",
        "(line 311,col 9)-(line 311,col 31)",
        "(line 312,col 9)-(line 312,col 91)",
        "(line 313,col 9)-(line 313,col 19)",
        "(line 314,col 9)-(line 314,col 95)",
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 319,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 321,col 100)",
        "(line 322,col 9)-(line 322,col 19)",
        "(line 323,col 9)-(line 323,col 104)",
        "(line 324,col 9)-(line 324,col 19)",
        "(line 325,col 9)-(line 325,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 328,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 95)",
        "(line 330,col 9)-(line 330,col 35)",
        "(line 331,col 9)-(line 331,col 91)",
        "(line 332,col 9)-(line 332,col 27)",
        "(line 333,col 9)-(line 333,col 95)",
        "(line 334,col 9)-(line 334,col 27)",
        "(line 335,col 9)-(line 335,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 338,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 35)",
        "(line 340,col 9)-(line 340,col 100)",
        "(line 341,col 9)-(line 341,col 27)",
        "(line 342,col 9)-(line 342,col 104)",
        "(line 343,col 9)-(line 343,col 27)",
        "(line 344,col 9)-(line 344,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 347,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 94)",
        "(line 349,col 9)-(line 349,col 33)",
        "(line 350,col 9)-(line 350,col 91)",
        "(line 351,col 9)-(line 351,col 26)",
        "(line 352,col 9)-(line 352,col 95)",
        "(line 353,col 9)-(line 353,col 26)",
        "(line 354,col 9)-(line 354,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 357,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 359,col 100)",
        "(line 360,col 9)-(line 360,col 26)",
        "(line 361,col 9)-(line 361,col 104)",
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 363,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 366,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 94)",
        "(line 368,col 9)-(line 368,col 33)",
        "(line 369,col 9)-(line 369,col 91)",
        "(line 370,col 9)-(line 370,col 26)",
        "(line 371,col 9)-(line 371,col 95)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 373,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 376,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 33)",
        "(line 378,col 9)-(line 378,col 100)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 380,col 104)",
        "(line 381,col 9)-(line 381,col 26)",
        "(line 382,col 9)-(line 382,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 385,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 96)",
        "(line 387,col 9)-(line 387,col 37)",
        "(line 388,col 9)-(line 388,col 91)",
        "(line 389,col 9)-(line 389,col 22)",
        "(line 390,col 9)-(line 390,col 48)",
        "(line 391,col 9)-(line 391,col 41)",
        "(line 392,col 9)-(line 392,col 96)",
        "(line 393,col 9)-(line 393,col 22)",
        "(line 394,col 9)-(line 394,col 48)",
        "(line 395,col 9)-(line 395,col 41)",
        "(line 396,col 9)-(line 396,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 399,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 37)",
        "(line 401,col 9)-(line 401,col 100)",
        "(line 402,col 9)-(line 402,col 22)",
        "(line 403,col 9)-(line 403,col 48)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 105)",
        "(line 406,col 9)-(line 406,col 22)",
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 408,col 41)",
        "(line 409,col 9)-(line 409,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 412,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 95)",
        "(line 414,col 9)-(line 414,col 35)",
        "(line 415,col 9)-(line 415,col 91)",
        "(line 416,col 9)-(line 416,col 22)",
        "(line 417,col 9)-(line 417,col 44)",
        "(line 418,col 9)-(line 418,col 96)",
        "(line 419,col 9)-(line 419,col 22)",
        "(line 420,col 9)-(line 420,col 44)",
        "(line 421,col 9)-(line 421,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 424,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 35)",
        "(line 426,col 9)-(line 426,col 100)",
        "(line 427,col 9)-(line 427,col 22)",
        "(line 428,col 9)-(line 428,col 44)",
        "(line 429,col 9)-(line 429,col 105)",
        "(line 430,col 9)-(line 430,col 22)",
        "(line 431,col 9)-(line 431,col 44)",
        "(line 432,col 9)-(line 432,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 435,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 97)",
        "(line 437,col 9)-(line 437,col 39)",
        "(line 438,col 9)-(line 438,col 99)",
        "(line 439,col 9)-(line 439,col 22)",
        "(line 440,col 9)-(line 440,col 99)",
        "(line 441,col 9)-(line 441,col 23)",
        "(line 442,col 9)-(line 442,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 445,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 39)",
        "(line 447,col 9)-(line 447,col 108)",
        "(line 448,col 9)-(line 448,col 22)",
        "(line 449,col 9)-(line 449,col 108)",
        "(line 450,col 9)-(line 450,col 23)",
        "(line 451,col 9)-(line 451,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 454,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 456,col 91)",
        "(line 457,col 9)-(line 457,col 32)",
        "(line 458,col 9)-(line 458,col 84)",
        "(line 459,col 9)-(line 459,col 32)",
        "(line 460,col 9)-(line 460,col 95)",
        "(line 461,col 9)-(line 461,col 32)",
        "(line 462,col 9)-(line 462,col 106)",
        "(line 463,col 9)-(line 463,col 25)",
        "(line 464,col 9)-(line 464,col 106)",
        "(line 465,col 9)-(line 465,col 32)",
        "(line 466,col 9)-(line 466,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 469,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 83)",
        "(line 472,col 9)-(line 472,col 97)",
        "(line 474,col 9)-(line 474,col 114)",
        "(line 475,col 9)-(line 475,col 113)",
        "(line 476,col 9)-(line 476,col 118)",
        "(line 478,col 9)-(line 478,col 107)",
        "(line 479,col 9)-(line 479,col 109)",
        "(line 481,col 9)-(line 481,col 105)",
        "(line 483,col 9)-(line 483,col 101)",
        "(line 484,col 9)-(line 484,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 487,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 488,
      "end_line": 489,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 491,
      "end_line": 492,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 494,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 497,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 27)",
        "(line 499,col 13)-(line 499,col 27)",
        "(line 500,col 13)-(line 500,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle()",
      "begin_line": 507,
      "end_line": 534,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 60)",
        "(line 510,col 9)-(line 510,col 16)",
        "(line 511,col 9)-(line 511,col 16)",
        "(line 530,col 9)-(line 530,col 21)",
        "(line 531,col 9)-(line 531,col 50)",
        "(line 532,col 9)-(line 532,col 21)",
        "(line 533,col 9)-(line 533,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 539,
      "end_line": 543,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 91)",
        "(line 541,col 9)-(line 542,col 55)"
      ]
    }
  ]
}