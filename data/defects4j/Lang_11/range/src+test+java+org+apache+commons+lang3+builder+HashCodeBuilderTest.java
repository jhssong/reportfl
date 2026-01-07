{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 547,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.\n * \n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 41,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleA.hashCode()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.ReflectionTestCycleB.hashCode()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx1()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx2()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.TestObject(int)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 78,col 13)",
        "(line 79,col 13)-(line 81,col 13)",
        "(line 82,col 13)-(line 82,col 44)",
        "(line 83,col 13)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.getA()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 95,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 21)",
        "(line 107,col 13)-(line 107,col 23)",
        "(line 108,col 13)-(line 108,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 111,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 115,col 13)",
        "(line 116,col 13)-(line 118,col 13)",
        "(line 119,col 13)-(line 119,col 50)",
        "(line 120,col 13)-(line 120,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 85)",
        "(line 127,col 9)-(line 127,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode()",
      "begin_line": 130,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 99)",
        "(line 133,col 9)-(line 133,col 110)",
        "(line 134,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 137,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 165,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 34)",
        "(line 168,col 9)-(line 169,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 172,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 26)",
        "(line 175,col 9)-(line 175,col 84)",
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild()",
      "begin_line": 180,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 26)",
        "(line 183,col 9)-(line 183,col 90)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 185,col 9)-(line 185,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 188,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 90)",
        "(line 192,col 9)-(line 193,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 88)",
        "(line 200,col 9)-(line 200,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 90)",
        "(line 206,col 9)-(line 206,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 209,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 89)",
        "(line 212,col 9)-(line 212,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 89)",
        "(line 218,col 9)-(line 218,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 221,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 92)",
        "(line 225,col 9)-(line 225,col 30)",
        "(line 226,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 227,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 230,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 91)",
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 89)",
        "(line 242,col 9)-(line 242,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 245,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 96)",
        "(line 248,col 9)-(line 248,col 37)",
        "(line 249,col 9)-(line 249,col 89)",
        "(line 250,col 9)-(line 250,col 30)",
        "(line 251,col 9)-(line 251,col 111)",
        "(line 252,col 9)-(line 252,col 30)",
        "(line 253,col 9)-(line 254,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 257,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 37)",
        "(line 260,col 9)-(line 260,col 98)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 120)",
        "(line 263,col 9)-(line 263,col 30)",
        "(line 264,col 9)-(line 265,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 268,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 94)",
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 89)",
        "(line 273,col 9)-(line 273,col 20)",
        "(line 274,col 9)-(line 274,col 39)",
        "(line 275,col 9)-(line 275,col 96)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 39)",
        "(line 278,col 9)-(line 278,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 281,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 284,col 98)",
        "(line 285,col 9)-(line 285,col 20)",
        "(line 286,col 9)-(line 286,col 39)",
        "(line 287,col 9)-(line 287,col 105)",
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 289,col 39)",
        "(line 290,col 9)-(line 290,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 293,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 93)",
        "(line 296,col 9)-(line 296,col 31)",
        "(line 297,col 9)-(line 297,col 89)",
        "(line 298,col 9)-(line 298,col 19)",
        "(line 299,col 9)-(line 299,col 95)",
        "(line 300,col 9)-(line 300,col 19)",
        "(line 301,col 9)-(line 301,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 304,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 98)",
        "(line 308,col 9)-(line 308,col 19)",
        "(line 309,col 9)-(line 309,col 104)",
        "(line 310,col 9)-(line 310,col 19)",
        "(line 311,col 9)-(line 311,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 314,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 95)",
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 89)",
        "(line 319,col 9)-(line 319,col 27)",
        "(line 320,col 9)-(line 320,col 95)",
        "(line 321,col 9)-(line 321,col 27)",
        "(line 322,col 9)-(line 322,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 325,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 35)",
        "(line 328,col 9)-(line 328,col 98)",
        "(line 329,col 9)-(line 329,col 27)",
        "(line 330,col 9)-(line 330,col 104)",
        "(line 331,col 9)-(line 331,col 27)",
        "(line 332,col 9)-(line 332,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 335,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 94)",
        "(line 338,col 9)-(line 338,col 33)",
        "(line 339,col 9)-(line 339,col 89)",
        "(line 340,col 9)-(line 340,col 26)",
        "(line 341,col 9)-(line 341,col 95)",
        "(line 342,col 9)-(line 342,col 26)",
        "(line 343,col 9)-(line 343,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 346,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 98)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 104)",
        "(line 352,col 9)-(line 352,col 26)",
        "(line 353,col 9)-(line 353,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 356,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 94)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 89)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 95)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 367,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 33)",
        "(line 370,col 9)-(line 370,col 98)",
        "(line 371,col 9)-(line 371,col 26)",
        "(line 372,col 9)-(line 372,col 104)",
        "(line 373,col 9)-(line 373,col 26)",
        "(line 374,col 9)-(line 374,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 377,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 96)",
        "(line 380,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 381,col 89)",
        "(line 382,col 9)-(line 382,col 22)",
        "(line 383,col 9)-(line 383,col 48)",
        "(line 384,col 9)-(line 384,col 39)",
        "(line 385,col 9)-(line 385,col 96)",
        "(line 386,col 9)-(line 386,col 22)",
        "(line 387,col 9)-(line 387,col 48)",
        "(line 388,col 9)-(line 388,col 39)",
        "(line 389,col 9)-(line 389,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 392,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 395,col 98)",
        "(line 396,col 9)-(line 396,col 22)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 398,col 39)",
        "(line 399,col 9)-(line 399,col 105)",
        "(line 400,col 9)-(line 400,col 22)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 402,col 9)-(line 402,col 39)",
        "(line 403,col 9)-(line 403,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 406,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 95)",
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 410,col 89)",
        "(line 411,col 9)-(line 411,col 22)",
        "(line 412,col 9)-(line 412,col 44)",
        "(line 413,col 9)-(line 413,col 96)",
        "(line 414,col 9)-(line 414,col 22)",
        "(line 415,col 9)-(line 415,col 44)",
        "(line 416,col 9)-(line 416,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 419,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 35)",
        "(line 422,col 9)-(line 422,col 98)",
        "(line 423,col 9)-(line 423,col 22)",
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 425,col 105)",
        "(line 426,col 9)-(line 426,col 22)",
        "(line 427,col 9)-(line 427,col 44)",
        "(line 428,col 9)-(line 428,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 431,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 97)",
        "(line 434,col 9)-(line 434,col 39)",
        "(line 435,col 9)-(line 435,col 99)",
        "(line 436,col 9)-(line 436,col 22)",
        "(line 437,col 9)-(line 437,col 99)",
        "(line 438,col 9)-(line 438,col 23)",
        "(line 439,col 9)-(line 439,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 442,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 39)",
        "(line 445,col 9)-(line 445,col 108)",
        "(line 446,col 9)-(line 446,col 22)",
        "(line 447,col 9)-(line 447,col 108)",
        "(line 448,col 9)-(line 448,col 23)",
        "(line 449,col 9)-(line 449,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 452,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 43)",
        "(line 455,col 9)-(line 455,col 89)",
        "(line 456,col 9)-(line 456,col 32)",
        "(line 457,col 9)-(line 457,col 84)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 95)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 106)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 463,col 9)-(line 463,col 106)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 468,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 83)",
        "(line 472,col 9)-(line 472,col 95)",
        "(line 474,col 9)-(line 474,col 112)",
        "(line 475,col 9)-(line 475,col 111)",
        "(line 476,col 9)-(line 476,col 116)",
        "(line 478,col 9)-(line 478,col 105)",
        "(line 479,col 9)-(line 479,col 107)",
        "(line 481,col 9)-(line 481,col 103)",
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
      "end_line": 535,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 60)",
        "(line 510,col 9)-(line 510,col 60)",
        "(line 511,col 9)-(line 511,col 16)",
        "(line 512,col 9)-(line 512,col 16)",
        "(line 531,col 9)-(line 531,col 21)",
        "(line 532,col 9)-(line 532,col 50)",
        "(line 533,col 9)-(line 533,col 21)",
        "(line 534,col 9)-(line 534,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 540,
      "end_line": 545,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 91)",
        "(line 543,col 9)-(line 544,col 55)"
      ]
    }
  ]
}