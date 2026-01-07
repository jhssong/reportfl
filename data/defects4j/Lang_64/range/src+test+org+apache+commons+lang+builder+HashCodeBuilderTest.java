{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/builder/HashCodeBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 469,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.HashCodeBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.HashCodeBuilderTest(java.lang.String)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.main(java.lang.String[])",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.suite()",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 67)",
        "(line 41,col 9)-(line 41,col 47)",
        "(line 42,col 9)-(line 42,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.setUp()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.tearDown()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testConstructorEx1()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testConstructorEx2()",
      "begin_line": 65,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObject.TestObject(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 80,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 83,col 13)",
        "(line 84,col 13)-(line 86,col 13)",
        "(line 87,col 13)-(line 87,col 44)",
        "(line 88,col 13)-(line 88,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObject.setA(int)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObject.getA()",
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
        "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObject"
      ],
      "begin_line": 100,
      "end_line": 121,
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
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestSubObject.TestSubObject(int, int, int)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 21)",
        "(line 108,col 13)-(line 108,col 23)",
        "(line 109,col 13)-(line 109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 111,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 114,col 13)",
        "(line 115,col 13)-(line 117,col 13)",
        "(line 118,col 13)-(line 118,col 50)",
        "(line 119,col 13)-(line 119,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHashCode()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 85)",
        "(line 125,col 9)-(line 125,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode()",
      "begin_line": 128,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 99)",
        "(line 130,col 9)-(line 130,col 110)",
        "(line 131,col 9)-(line 131,col 125)",
        "(line 132,col 9)-(line 132,col 142)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1()",
      "begin_line": 135,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2()",
      "begin_line": 144,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHashCodeEx1()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHashCodeEx2()",
      "begin_line": 162,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHashCodeEx3()",
      "begin_line": 171,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testSuper()",
      "begin_line": 180,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 34)",
        "(line 182,col 9)-(line 184,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testObject()",
      "begin_line": 187,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 26)",
        "(line 189,col 9)-(line 189,col 84)",
        "(line 190,col 9)-(line 190,col 27)",
        "(line 191,col 9)-(line 191,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testLong()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 90)",
        "(line 196,col 9)-(line 196,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testInt()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 88)",
        "(line 201,col 9)-(line 201,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testShort()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 90)",
        "(line 206,col 9)-(line 206,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testChar()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 89)",
        "(line 211,col 9)-(line 211,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testByte()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 89)",
        "(line 216,col 9)-(line 216,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testDouble()",
      "begin_line": 219,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 92)",
        "(line 221,col 9)-(line 221,col 30)",
        "(line 222,col 9)-(line 222,col 44)",
        "(line 223,col 9)-(line 223,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testFloat()",
      "begin_line": 226,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 91)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 40)",
        "(line 230,col 9)-(line 230,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testBoolean()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 89)",
        "(line 235,col 9)-(line 235,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testObjectArray()",
      "begin_line": 238,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 96)",
        "(line 240,col 9)-(line 240,col 37)",
        "(line 241,col 9)-(line 241,col 92)",
        "(line 242,col 9)-(line 242,col 30)",
        "(line 243,col 9)-(line 243,col 111)",
        "(line 244,col 9)-(line 244,col 30)",
        "(line 245,col 9)-(line 245,col 132)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testObjectArrayAsObject()",
      "begin_line": 248,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 101)",
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 120)",
        "(line 253,col 9)-(line 253,col 30)",
        "(line 254,col 9)-(line 254,col 141)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testLongArray()",
      "begin_line": 257,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 94)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 260,col 92)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 263,col 96)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 41)",
        "(line 266,col 9)-(line 266,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testLongArrayAsObject()",
      "begin_line": 269,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 33)",
        "(line 271,col 9)-(line 271,col 101)",
        "(line 272,col 9)-(line 272,col 20)",
        "(line 273,col 9)-(line 273,col 41)",
        "(line 274,col 9)-(line 274,col 105)",
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 276,col 41)",
        "(line 277,col 9)-(line 277,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testIntArray()",
      "begin_line": 280,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 93)",
        "(line 282,col 9)-(line 282,col 31)",
        "(line 283,col 9)-(line 283,col 92)",
        "(line 284,col 9)-(line 284,col 19)",
        "(line 285,col 9)-(line 285,col 95)",
        "(line 286,col 9)-(line 286,col 19)",
        "(line 287,col 9)-(line 287,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testIntArrayAsObject()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 31)",
        "(line 292,col 9)-(line 292,col 101)",
        "(line 293,col 9)-(line 293,col 19)",
        "(line 294,col 9)-(line 294,col 104)",
        "(line 295,col 9)-(line 295,col 19)",
        "(line 296,col 9)-(line 296,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testShortArray()",
      "begin_line": 299,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 95)",
        "(line 301,col 9)-(line 301,col 35)",
        "(line 302,col 9)-(line 302,col 92)",
        "(line 303,col 9)-(line 303,col 27)",
        "(line 304,col 9)-(line 304,col 95)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testShortArrayAsObject()",
      "begin_line": 309,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 35)",
        "(line 311,col 9)-(line 311,col 101)",
        "(line 312,col 9)-(line 312,col 27)",
        "(line 313,col 9)-(line 313,col 104)",
        "(line 314,col 9)-(line 314,col 27)",
        "(line 315,col 9)-(line 315,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testCharArray()",
      "begin_line": 318,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 94)",
        "(line 320,col 9)-(line 320,col 33)",
        "(line 321,col 9)-(line 321,col 92)",
        "(line 322,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 95)",
        "(line 324,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 325,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testCharArrayAsObject()",
      "begin_line": 328,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 33)",
        "(line 330,col 9)-(line 330,col 101)",
        "(line 331,col 9)-(line 331,col 26)",
        "(line 332,col 9)-(line 332,col 104)",
        "(line 333,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 334,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testByteArray()",
      "begin_line": 337,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 94)",
        "(line 339,col 9)-(line 339,col 33)",
        "(line 340,col 9)-(line 340,col 92)",
        "(line 341,col 9)-(line 341,col 26)",
        "(line 342,col 9)-(line 342,col 95)",
        "(line 343,col 9)-(line 343,col 26)",
        "(line 344,col 9)-(line 344,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testByteArrayAsObject()",
      "begin_line": 347,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 101)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 104)",
        "(line 352,col 9)-(line 352,col 26)",
        "(line 353,col 9)-(line 353,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testDoubleArray()",
      "begin_line": 356,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 96)",
        "(line 358,col 9)-(line 358,col 37)",
        "(line 359,col 9)-(line 359,col 92)",
        "(line 360,col 9)-(line 360,col 22)",
        "(line 361,col 9)-(line 361,col 48)",
        "(line 362,col 9)-(line 362,col 41)",
        "(line 363,col 9)-(line 363,col 96)",
        "(line 364,col 9)-(line 364,col 22)",
        "(line 365,col 9)-(line 365,col 48)",
        "(line 366,col 9)-(line 366,col 41)",
        "(line 367,col 9)-(line 367,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testDoubleArrayAsObject()",
      "begin_line": 370,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 37)",
        "(line 372,col 9)-(line 372,col 101)",
        "(line 373,col 9)-(line 373,col 22)",
        "(line 374,col 9)-(line 374,col 48)",
        "(line 375,col 9)-(line 375,col 41)",
        "(line 376,col 9)-(line 376,col 105)",
        "(line 377,col 9)-(line 377,col 22)",
        "(line 378,col 9)-(line 378,col 48)",
        "(line 379,col 9)-(line 379,col 41)",
        "(line 380,col 9)-(line 380,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testFloatArray()",
      "begin_line": 383,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 95)",
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 92)",
        "(line 387,col 9)-(line 387,col 22)",
        "(line 388,col 9)-(line 388,col 44)",
        "(line 389,col 9)-(line 389,col 96)",
        "(line 390,col 9)-(line 390,col 22)",
        "(line 391,col 9)-(line 391,col 44)",
        "(line 392,col 9)-(line 392,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testFloatArrayAsObject()",
      "begin_line": 395,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 35)",
        "(line 397,col 9)-(line 397,col 101)",
        "(line 398,col 9)-(line 398,col 22)",
        "(line 399,col 9)-(line 399,col 44)",
        "(line 400,col 9)-(line 400,col 105)",
        "(line 401,col 9)-(line 401,col 22)",
        "(line 402,col 9)-(line 402,col 44)",
        "(line 403,col 9)-(line 403,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testBooleanArray()",
      "begin_line": 406,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 97)",
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 100)",
        "(line 410,col 9)-(line 410,col 22)",
        "(line 411,col 9)-(line 411,col 99)",
        "(line 412,col 9)-(line 412,col 23)",
        "(line 413,col 9)-(line 413,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testBooleanArrayAsObject()",
      "begin_line": 416,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 39)",
        "(line 418,col 9)-(line 418,col 109)",
        "(line 419,col 9)-(line 419,col 22)",
        "(line 420,col 9)-(line 420,col 108)",
        "(line 421,col 9)-(line 421,col 23)",
        "(line 422,col 9)-(line 422,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testBooleanMultiArray()",
      "begin_line": 425,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 43)",
        "(line 427,col 9)-(line 427,col 91)",
        "(line 428,col 9)-(line 428,col 32)",
        "(line 429,col 9)-(line 429,col 84)",
        "(line 430,col 9)-(line 430,col 32)",
        "(line 431,col 9)-(line 431,col 95)",
        "(line 432,col 9)-(line 432,col 32)",
        "(line 433,col 9)-(line 433,col 106)",
        "(line 434,col 9)-(line 434,col 25)",
        "(line 435,col 9)-(line 435,col 106)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 437,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields()",
      "begin_line": 440,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 83)",
        "(line 443,col 9)-(line 443,col 97)",
        "(line 445,col 9)-(line 445,col 114)",
        "(line 446,col 9)-(line 446,col 114)",
        "(line 447,col 9)-(line 447,col 119)",
        "(line 449,col 9)-(line 449,col 108)",
        "(line 450,col 9)-(line 450,col 110)",
        "(line 452,col 9)-(line 452,col 106)",
        "(line 454,col 9)-(line 454,col 102)",
        "(line 455,col 9)-(line 455,col 109)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 458,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 463,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 464,col 13)-(line 464,col 27)",
        "(line 465,col 13)-(line 465,col 27)",
        "(line 466,col 13)-(line 466,col 31)"
      ]
    }
  ]
}