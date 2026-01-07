{
  "filepath": "/tmp/Lang-10b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 558,
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
      "end_line": 98,
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
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.hashCode()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject.getA()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 100,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 21)",
        "(line 112,col 13)-(line 112,col 23)",
        "(line 113,col 13)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 116,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 120,col 13)",
        "(line 121,col 13)-(line 123,col 13)",
        "(line 124,col 13)-(line 124,col 50)",
        "(line 125,col 13)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestSubObject.hashCode()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 135,
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
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 176,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 34)",
        "(line 179,col 9)-(line 180,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 183,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 26)",
        "(line 186,col 9)-(line 186,col 84)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 188,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild()",
      "begin_line": 191,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 26)",
        "(line 194,col 9)-(line 194,col 90)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 196,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 199,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 90)",
        "(line 203,col 9)-(line 204,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 207,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 88)",
        "(line 211,col 9)-(line 211,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 90)",
        "(line 217,col 9)-(line 217,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 89)",
        "(line 223,col 9)-(line 223,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 226,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 89)",
        "(line 229,col 9)-(line 229,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 92)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 237,col 9)-(line 237,col 44)",
        "(line 238,col 9)-(line 238,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 241,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 91)",
        "(line 245,col 9)-(line 245,col 27)",
        "(line 246,col 9)-(line 246,col 40)",
        "(line 247,col 9)-(line 247,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 89)",
        "(line 253,col 9)-(line 253,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 256,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 96)",
        "(line 259,col 9)-(line 259,col 37)",
        "(line 260,col 9)-(line 260,col 89)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 111)",
        "(line 263,col 9)-(line 263,col 30)",
        "(line 264,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 268,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 98)",
        "(line 272,col 9)-(line 272,col 30)",
        "(line 273,col 9)-(line 273,col 120)",
        "(line 274,col 9)-(line 274,col 30)",
        "(line 275,col 9)-(line 276,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 279,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 94)",
        "(line 282,col 9)-(line 282,col 33)",
        "(line 283,col 9)-(line 283,col 89)",
        "(line 284,col 9)-(line 284,col 20)",
        "(line 285,col 9)-(line 285,col 39)",
        "(line 286,col 9)-(line 286,col 96)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 288,col 39)",
        "(line 289,col 9)-(line 289,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 292,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 33)",
        "(line 295,col 9)-(line 295,col 98)",
        "(line 296,col 9)-(line 296,col 20)",
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 298,col 105)",
        "(line 299,col 9)-(line 299,col 20)",
        "(line 300,col 9)-(line 300,col 39)",
        "(line 301,col 9)-(line 301,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 304,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 93)",
        "(line 307,col 9)-(line 307,col 31)",
        "(line 308,col 9)-(line 308,col 89)",
        "(line 309,col 9)-(line 309,col 19)",
        "(line 310,col 9)-(line 310,col 95)",
        "(line 311,col 9)-(line 311,col 19)",
        "(line 312,col 9)-(line 312,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 315,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 31)",
        "(line 318,col 9)-(line 318,col 98)",
        "(line 319,col 9)-(line 319,col 19)",
        "(line 320,col 9)-(line 320,col 104)",
        "(line 321,col 9)-(line 321,col 19)",
        "(line 322,col 9)-(line 322,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 325,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 95)",
        "(line 328,col 9)-(line 328,col 35)",
        "(line 329,col 9)-(line 329,col 89)",
        "(line 330,col 9)-(line 330,col 27)",
        "(line 331,col 9)-(line 331,col 95)",
        "(line 332,col 9)-(line 332,col 27)",
        "(line 333,col 9)-(line 333,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 336,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 35)",
        "(line 339,col 9)-(line 339,col 98)",
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
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 94)",
        "(line 349,col 9)-(line 349,col 33)",
        "(line 350,col 9)-(line 350,col 89)",
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
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 98)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 104)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 367,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 94)",
        "(line 370,col 9)-(line 370,col 33)",
        "(line 371,col 9)-(line 371,col 89)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 373,col 95)",
        "(line 374,col 9)-(line 374,col 26)",
        "(line 375,col 9)-(line 375,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 378,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 33)",
        "(line 381,col 9)-(line 381,col 98)",
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 383,col 104)",
        "(line 384,col 9)-(line 384,col 26)",
        "(line 385,col 9)-(line 385,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 388,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 96)",
        "(line 391,col 9)-(line 391,col 37)",
        "(line 392,col 9)-(line 392,col 89)",
        "(line 393,col 9)-(line 393,col 22)",
        "(line 394,col 9)-(line 394,col 48)",
        "(line 395,col 9)-(line 395,col 39)",
        "(line 396,col 9)-(line 396,col 96)",
        "(line 397,col 9)-(line 397,col 22)",
        "(line 398,col 9)-(line 398,col 48)",
        "(line 399,col 9)-(line 399,col 39)",
        "(line 400,col 9)-(line 400,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 403,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 406,col 98)",
        "(line 407,col 9)-(line 407,col 22)",
        "(line 408,col 9)-(line 408,col 48)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 105)",
        "(line 411,col 9)-(line 411,col 22)",
        "(line 412,col 9)-(line 412,col 48)",
        "(line 413,col 9)-(line 413,col 39)",
        "(line 414,col 9)-(line 414,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 417,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 95)",
        "(line 420,col 9)-(line 420,col 35)",
        "(line 421,col 9)-(line 421,col 89)",
        "(line 422,col 9)-(line 422,col 22)",
        "(line 423,col 9)-(line 423,col 44)",
        "(line 424,col 9)-(line 424,col 96)",
        "(line 425,col 9)-(line 425,col 22)",
        "(line 426,col 9)-(line 426,col 44)",
        "(line 427,col 9)-(line 427,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 430,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 35)",
        "(line 433,col 9)-(line 433,col 98)",
        "(line 434,col 9)-(line 434,col 22)",
        "(line 435,col 9)-(line 435,col 44)",
        "(line 436,col 9)-(line 436,col 105)",
        "(line 437,col 9)-(line 437,col 22)",
        "(line 438,col 9)-(line 438,col 44)",
        "(line 439,col 9)-(line 439,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 442,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 97)",
        "(line 445,col 9)-(line 445,col 39)",
        "(line 446,col 9)-(line 446,col 99)",
        "(line 447,col 9)-(line 447,col 22)",
        "(line 448,col 9)-(line 448,col 99)",
        "(line 449,col 9)-(line 449,col 23)",
        "(line 450,col 9)-(line 450,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 453,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 39)",
        "(line 456,col 9)-(line 456,col 108)",
        "(line 457,col 9)-(line 457,col 22)",
        "(line 458,col 9)-(line 458,col 108)",
        "(line 459,col 9)-(line 459,col 23)",
        "(line 460,col 9)-(line 460,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 463,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 43)",
        "(line 466,col 9)-(line 466,col 89)",
        "(line 467,col 9)-(line 467,col 32)",
        "(line 468,col 9)-(line 468,col 84)",
        "(line 469,col 9)-(line 469,col 32)",
        "(line 470,col 9)-(line 470,col 95)",
        "(line 471,col 9)-(line 471,col 32)",
        "(line 472,col 9)-(line 472,col 106)",
        "(line 473,col 9)-(line 473,col 25)",
        "(line 474,col 9)-(line 474,col 106)",
        "(line 475,col 9)-(line 475,col 32)",
        "(line 476,col 9)-(line 476,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 479,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 83)",
        "(line 483,col 9)-(line 483,col 95)",
        "(line 485,col 9)-(line 485,col 112)",
        "(line 486,col 9)-(line 486,col 111)",
        "(line 487,col 9)-(line 487,col 116)",
        "(line 489,col 9)-(line 489,col 105)",
        "(line 490,col 9)-(line 490,col 107)",
        "(line 492,col 9)-(line 492,col 103)",
        "(line 494,col 9)-(line 494,col 101)",
        "(line 495,col 9)-(line 495,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 498,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 499,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 502,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 505,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 509,col 13)-(line 509,col 27)",
        "(line 510,col 13)-(line 510,col 27)",
        "(line 511,col 13)-(line 511,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle()",
      "begin_line": 518,
      "end_line": 546,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 60)",
        "(line 521,col 9)-(line 521,col 60)",
        "(line 522,col 9)-(line 522,col 16)",
        "(line 523,col 9)-(line 523,col 16)",
        "(line 542,col 9)-(line 542,col 21)",
        "(line 543,col 9)-(line 543,col 50)",
        "(line 544,col 9)-(line 544,col 21)",
        "(line 545,col 9)-(line 545,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 551,
      "end_line": 556,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 91)",
        "(line 554,col 9)-(line 555,col 55)"
      ]
    }
  ]
}