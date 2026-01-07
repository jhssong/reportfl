{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 536,
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
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 209,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 90)",
        "(line 212,col 9)-(line 213,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 88)",
        "(line 219,col 9)-(line 219,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 90)",
        "(line 224,col 9)-(line 224,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 89)",
        "(line 229,col 9)-(line 229,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 89)",
        "(line 234,col 9)-(line 234,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 237,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 92)",
        "(line 240,col 9)-(line 240,col 30)",
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 242,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 245,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 91)",
        "(line 248,col 9)-(line 248,col 27)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 89)",
        "(line 255,col 9)-(line 255,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 258,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 96)",
        "(line 260,col 9)-(line 260,col 37)",
        "(line 261,col 9)-(line 261,col 91)",
        "(line 262,col 9)-(line 262,col 30)",
        "(line 263,col 9)-(line 263,col 111)",
        "(line 264,col 9)-(line 264,col 30)",
        "(line 265,col 9)-(line 266,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 269,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 100)",
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
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 94)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 282,col 91)",
        "(line 283,col 9)-(line 283,col 20)",
        "(line 284,col 9)-(line 284,col 41)",
        "(line 285,col 9)-(line 285,col 96)",
        "(line 286,col 9)-(line 286,col 20)",
        "(line 287,col 9)-(line 287,col 41)",
        "(line 288,col 9)-(line 288,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 291,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 293,col 100)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 295,col 9)-(line 295,col 41)",
        "(line 296,col 9)-(line 296,col 105)",
        "(line 297,col 9)-(line 297,col 20)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 302,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 93)",
        "(line 304,col 9)-(line 304,col 31)",
        "(line 305,col 9)-(line 305,col 91)",
        "(line 306,col 9)-(line 306,col 19)",
        "(line 307,col 9)-(line 307,col 95)",
        "(line 308,col 9)-(line 308,col 19)",
        "(line 309,col 9)-(line 309,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 312,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 31)",
        "(line 314,col 9)-(line 314,col 100)",
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 104)",
        "(line 317,col 9)-(line 317,col 19)",
        "(line 318,col 9)-(line 318,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 321,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 95)",
        "(line 323,col 9)-(line 323,col 35)",
        "(line 324,col 9)-(line 324,col 91)",
        "(line 325,col 9)-(line 325,col 27)",
        "(line 326,col 9)-(line 326,col 95)",
        "(line 327,col 9)-(line 327,col 27)",
        "(line 328,col 9)-(line 328,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 331,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 35)",
        "(line 333,col 9)-(line 333,col 100)",
        "(line 334,col 9)-(line 334,col 27)",
        "(line 335,col 9)-(line 335,col 104)",
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 337,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 340,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 94)",
        "(line 342,col 9)-(line 342,col 33)",
        "(line 343,col 9)-(line 343,col 91)",
        "(line 344,col 9)-(line 344,col 26)",
        "(line 345,col 9)-(line 345,col 95)",
        "(line 346,col 9)-(line 346,col 26)",
        "(line 347,col 9)-(line 347,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 350,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 33)",
        "(line 352,col 9)-(line 352,col 100)",
        "(line 353,col 9)-(line 353,col 26)",
        "(line 354,col 9)-(line 354,col 104)",
        "(line 355,col 9)-(line 355,col 26)",
        "(line 356,col 9)-(line 356,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 359,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 94)",
        "(line 361,col 9)-(line 361,col 33)",
        "(line 362,col 9)-(line 362,col 91)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 95)",
        "(line 365,col 9)-(line 365,col 26)",
        "(line 366,col 9)-(line 366,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 369,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 33)",
        "(line 371,col 9)-(line 371,col 100)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 373,col 104)",
        "(line 374,col 9)-(line 374,col 26)",
        "(line 375,col 9)-(line 375,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 378,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 96)",
        "(line 380,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 381,col 91)",
        "(line 382,col 9)-(line 382,col 22)",
        "(line 383,col 9)-(line 383,col 48)",
        "(line 384,col 9)-(line 384,col 41)",
        "(line 385,col 9)-(line 385,col 96)",
        "(line 386,col 9)-(line 386,col 22)",
        "(line 387,col 9)-(line 387,col 48)",
        "(line 388,col 9)-(line 388,col 41)",
        "(line 389,col 9)-(line 389,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 392,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 37)",
        "(line 394,col 9)-(line 394,col 100)",
        "(line 395,col 9)-(line 395,col 22)",
        "(line 396,col 9)-(line 396,col 48)",
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 105)",
        "(line 399,col 9)-(line 399,col 22)",
        "(line 400,col 9)-(line 400,col 48)",
        "(line 401,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 402,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 405,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 95)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 91)",
        "(line 409,col 9)-(line 409,col 22)",
        "(line 410,col 9)-(line 410,col 44)",
        "(line 411,col 9)-(line 411,col 96)",
        "(line 412,col 9)-(line 412,col 22)",
        "(line 413,col 9)-(line 413,col 44)",
        "(line 414,col 9)-(line 414,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 417,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 419,col 100)",
        "(line 420,col 9)-(line 420,col 22)",
        "(line 421,col 9)-(line 421,col 44)",
        "(line 422,col 9)-(line 422,col 105)",
        "(line 423,col 9)-(line 423,col 22)",
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 425,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 428,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 97)",
        "(line 430,col 9)-(line 430,col 39)",
        "(line 431,col 9)-(line 431,col 99)",
        "(line 432,col 9)-(line 432,col 22)",
        "(line 433,col 9)-(line 433,col 99)",
        "(line 434,col 9)-(line 434,col 23)",
        "(line 435,col 9)-(line 435,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 39)",
        "(line 440,col 9)-(line 440,col 108)",
        "(line 441,col 9)-(line 441,col 22)",
        "(line 442,col 9)-(line 442,col 108)",
        "(line 443,col 9)-(line 443,col 23)",
        "(line 444,col 9)-(line 444,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 447,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 43)",
        "(line 449,col 9)-(line 449,col 91)",
        "(line 450,col 9)-(line 450,col 32)",
        "(line 451,col 9)-(line 451,col 84)",
        "(line 452,col 9)-(line 452,col 32)",
        "(line 453,col 9)-(line 453,col 95)",
        "(line 454,col 9)-(line 454,col 32)",
        "(line 455,col 9)-(line 455,col 106)",
        "(line 456,col 9)-(line 456,col 25)",
        "(line 457,col 9)-(line 457,col 106)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 462,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 83)",
        "(line 465,col 9)-(line 465,col 97)",
        "(line 467,col 9)-(line 467,col 114)",
        "(line 468,col 9)-(line 468,col 113)",
        "(line 469,col 9)-(line 469,col 118)",
        "(line 471,col 9)-(line 471,col 107)",
        "(line 472,col 9)-(line 472,col 109)",
        "(line 474,col 9)-(line 474,col 105)",
        "(line 476,col 9)-(line 476,col 101)",
        "(line 477,col 9)-(line 477,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 480,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 481,
      "end_line": 482,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 484,
      "end_line": 485,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 487,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 490,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 27)",
        "(line 492,col 13)-(line 492,col 27)",
        "(line 493,col 13)-(line 493,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle()",
      "begin_line": 500,
      "end_line": 525,
      "comment": "\n     * Test Objects pointing to each other.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 60)",
        "(line 502,col 9)-(line 502,col 60)",
        "(line 503,col 9)-(line 503,col 16)",
        "(line 504,col 9)-(line 504,col 16)",
        "(line 523,col 9)-(line 523,col 21)",
        "(line 524,col 9)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode()",
      "begin_line": 530,
      "end_line": 534,
      "comment": "\n     * Ensures LANG-520 remains true\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 91)",
        "(line 532,col 9)-(line 533,col 55)"
      ]
    }
  ]
}