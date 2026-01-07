{
  "filepath": "/tmp/Lang-40b/src/test/org/apache/commons/lang/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1136,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.CompareToBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.CompareToBuilderTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.main(java.lang.String[])",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.suite()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 68)",
        "(line 44,col 9)-(line 44,col 48)",
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.setUp()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.tearDown()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 60,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 65,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 69,col 13)",
        "(line 70,col 13)-(line 72,col 13)",
        "(line 73,col 13)-(line 73,col 44)",
        "(line 74,col 13)-(line 74,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.compareTo(java.lang.Object)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 44)",
        "(line 86,col 13)-(line 86,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 90,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 21)",
        "(line 97,col 13)-(line 97,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 99,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 103,col 13)",
        "(line 104,col 13)-(line 106,col 13)",
        "(line 107,col 13)-(line 107,col 50)",
        "(line 108,col 13)-(line 108,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 112,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 21)",
        "(line 117,col 13)-(line 117,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 121,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 123,col 42)",
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 125,col 68)",
        "(line 126,col 9)-(line 126,col 19)",
        "(line 127,col 9)-(line 127,col 67)",
        "(line 128,col 9)-(line 128,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 154,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 54)",
        "(line 156,col 9)-(line 156,col 60)",
        "(line 158,col 9)-(line 158,col 24)",
        "(line 159,col 9)-(line 159,col 24)",
        "(line 160,col 9)-(line 160,col 24)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 36)",
        "(line 165,col 9)-(line 165,col 60)",
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 173,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 51)",
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 33)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 182,col 45)",
        "(line 183,col 9)-(line 183,col 51)",
        "(line 185,col 9)-(line 185,col 45)",
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 191,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 103)",
        "(line 193,col 9)-(line 193,col 103)",
        "(line 194,col 9)-(line 194,col 103)",
        "(line 196,col 9)-(line 196,col 102)",
        "(line 197,col 9)-(line 197,col 102)",
        "(line 198,col 9)-(line 198,col 102)",
        "(line 200,col 9)-(line 200,col 102)",
        "(line 201,col 9)-(line 201,col 102)",
        "(line 202,col 9)-(line 202,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 205,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 43)",
        "(line 207,col 9)-(line 207,col 43)",
        "(line 208,col 9)-(line 208,col 43)",
        "(line 209,col 9)-(line 209,col 53)",
        "(line 210,col 9)-(line 210,col 53)",
        "(line 211,col 9)-(line 211,col 53)",
        "(line 213,col 9)-(line 213,col 77)",
        "(line 214,col 9)-(line 214,col 77)",
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 217,col 77)",
        "(line 219,col 9)-(line 219,col 107)",
        "(line 220,col 9)-(line 220,col 107)",
        "(line 223,col 9)-(line 223,col 57)",
        "(line 225,col 9)-(line 225,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 237,
      "end_line": 255,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 146)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 254,col 9)-(line 254,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 271,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 93)",
        "(line 275,col 9)-(line 275,col 92)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 278,col 9)-(line 278,col 93)",
        "(line 279,col 9)-(line 279,col 93)",
        "(line 281,col 9)-(line 281,col 92)",
        "(line 282,col 9)-(line 282,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObject()",
      "begin_line": 285,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 78)",
        "(line 289,col 9)-(line 289,col 78)",
        "(line 290,col 9)-(line 290,col 19)",
        "(line 291,col 9)-(line 291,col 77)",
        "(line 292,col 9)-(line 292,col 77)",
        "(line 294,col 9)-(line 294,col 79)",
        "(line 295,col 9)-(line 295,col 100)",
        "(line 296,col 9)-(line 296,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 299,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 33)",
        "(line 302,col 9)-(line 305,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 308,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 311,col 109)",
        "(line 312,col 9)-(line 312,col 109)",
        "(line 313,col 9)-(line 313,col 20)",
        "(line 314,col 9)-(line 314,col 109)",
        "(line 315,col 9)-(line 315,col 109)",
        "(line 316,col 9)-(line 316,col 21)",
        "(line 317,col 9)-(line 317,col 108)",
        "(line 318,col 9)-(line 318,col 108)",
        "(line 320,col 9)-(line 320,col 110)",
        "(line 321,col 9)-(line 321,col 131)",
        "(line 322,col 9)-(line 322,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 325,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 27)",
        "(line 328,col 9)-(line 328,col 84)",
        "(line 329,col 9)-(line 329,col 84)",
        "(line 330,col 9)-(line 330,col 21)",
        "(line 331,col 9)-(line 331,col 83)",
        "(line 332,col 9)-(line 332,col 83)",
        "(line 334,col 9)-(line 334,col 85)",
        "(line 335,col 9)-(line 335,col 106)",
        "(line 336,col 9)-(line 336,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLong()",
      "begin_line": 339,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 21)",
        "(line 341,col 9)-(line 341,col 21)",
        "(line 342,col 9)-(line 342,col 78)",
        "(line 343,col 9)-(line 343,col 77)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 89)",
        "(line 346,col 9)-(line 346,col 89)",
        "(line 347,col 9)-(line 347,col 89)",
        "(line 348,col 9)-(line 348,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testInt()",
      "begin_line": 351,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 19)",
        "(line 353,col 9)-(line 353,col 19)",
        "(line 354,col 9)-(line 354,col 78)",
        "(line 355,col 9)-(line 355,col 77)",
        "(line 356,col 9)-(line 356,col 77)",
        "(line 357,col 9)-(line 357,col 92)",
        "(line 358,col 9)-(line 358,col 92)",
        "(line 359,col 9)-(line 359,col 92)",
        "(line 360,col 9)-(line 360,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShort()",
      "begin_line": 363,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 21)",
        "(line 365,col 9)-(line 365,col 21)",
        "(line 366,col 9)-(line 366,col 78)",
        "(line 367,col 9)-(line 367,col 77)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 90)",
        "(line 370,col 9)-(line 370,col 90)",
        "(line 371,col 9)-(line 371,col 90)",
        "(line 372,col 9)-(line 372,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testChar()",
      "begin_line": 375,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 20)",
        "(line 377,col 9)-(line 377,col 20)",
        "(line 378,col 9)-(line 378,col 78)",
        "(line 379,col 9)-(line 379,col 77)",
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 94)",
        "(line 382,col 9)-(line 382,col 94)",
        "(line 383,col 9)-(line 383,col 94)",
        "(line 384,col 9)-(line 384,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByte()",
      "begin_line": 387,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 20)",
        "(line 390,col 9)-(line 390,col 78)",
        "(line 391,col 9)-(line 391,col 77)",
        "(line 392,col 9)-(line 392,col 77)",
        "(line 393,col 9)-(line 393,col 89)",
        "(line 394,col 9)-(line 394,col 89)",
        "(line 395,col 9)-(line 395,col 89)",
        "(line 396,col 9)-(line 396,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 399,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 22)",
        "(line 401,col 9)-(line 401,col 22)",
        "(line 402,col 9)-(line 402,col 78)",
        "(line 403,col 9)-(line 403,col 77)",
        "(line 404,col 9)-(line 404,col 77)",
        "(line 405,col 9)-(line 405,col 91)",
        "(line 406,col 9)-(line 406,col 91)",
        "(line 407,col 9)-(line 407,col 91)",
        "(line 408,col 9)-(line 408,col 91)",
        "(line 409,col 9)-(line 409,col 94)",
        "(line 410,col 9)-(line 410,col 99)",
        "(line 411,col 9)-(line 411,col 113)",
        "(line 412,col 9)-(line 412,col 113)",
        "(line 413,col 9)-(line 413,col 85)",
        "(line 414,col 9)-(line 414,col 85)",
        "(line 415,col 9)-(line 415,col 80)",
        "(line 416,col 9)-(line 416,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 419,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 21)",
        "(line 421,col 9)-(line 421,col 21)",
        "(line 422,col 9)-(line 422,col 78)",
        "(line 423,col 9)-(line 423,col 77)",
        "(line 424,col 9)-(line 424,col 77)",
        "(line 425,col 9)-(line 425,col 90)",
        "(line 426,col 9)-(line 426,col 90)",
        "(line 427,col 9)-(line 427,col 90)",
        "(line 428,col 9)-(line 428,col 90)",
        "(line 429,col 9)-(line 429,col 92)",
        "(line 430,col 9)-(line 430,col 97)",
        "(line 431,col 9)-(line 431,col 111)",
        "(line 432,col 9)-(line 432,col 111)",
        "(line 433,col 9)-(line 433,col 84)",
        "(line 434,col 9)-(line 434,col 84)",
        "(line 435,col 9)-(line 435,col 80)",
        "(line 436,col 9)-(line 436,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 439,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 26)",
        "(line 441,col 9)-(line 441,col 27)",
        "(line 442,col 9)-(line 442,col 78)",
        "(line 443,col 9)-(line 443,col 78)",
        "(line 444,col 9)-(line 444,col 77)",
        "(line 445,col 9)-(line 445,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 448,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 46)",
        "(line 453,col 9)-(line 453,col 36)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 458,col 9)-(line 458,col 36)",
        "(line 460,col 9)-(line 460,col 82)",
        "(line 461,col 9)-(line 461,col 82)",
        "(line 462,col 9)-(line 462,col 81)",
        "(line 463,col 9)-(line 463,col 81)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 467,col 9)-(line 467,col 81)",
        "(line 469,col 9)-(line 469,col 81)",
        "(line 470,col 9)-(line 470,col 104)",
        "(line 471,col 9)-(line 471,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 474,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 34)",
        "(line 476,col 9)-(line 476,col 21)",
        "(line 477,col 9)-(line 477,col 21)",
        "(line 478,col 9)-(line 478,col 34)",
        "(line 479,col 9)-(line 479,col 21)",
        "(line 480,col 9)-(line 480,col 21)",
        "(line 481,col 9)-(line 481,col 34)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 483,col 9)-(line 483,col 21)",
        "(line 484,col 9)-(line 484,col 21)",
        "(line 486,col 9)-(line 486,col 82)",
        "(line 487,col 9)-(line 487,col 82)",
        "(line 488,col 9)-(line 488,col 81)",
        "(line 489,col 9)-(line 489,col 81)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 81)",
        "(line 493,col 9)-(line 493,col 81)",
        "(line 495,col 9)-(line 495,col 81)",
        "(line 496,col 9)-(line 496,col 100)",
        "(line 497,col 9)-(line 497,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 500,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 32)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 32)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 32)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 20)",
        "(line 512,col 9)-(line 512,col 82)",
        "(line 513,col 9)-(line 513,col 82)",
        "(line 514,col 9)-(line 514,col 81)",
        "(line 515,col 9)-(line 515,col 81)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 81)",
        "(line 519,col 9)-(line 519,col 81)",
        "(line 521,col 9)-(line 521,col 81)",
        "(line 522,col 9)-(line 522,col 98)",
        "(line 523,col 9)-(line 523,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 526,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 36)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 36)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 36)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 538,col 9)-(line 538,col 82)",
        "(line 539,col 9)-(line 539,col 82)",
        "(line 540,col 9)-(line 540,col 81)",
        "(line 541,col 9)-(line 541,col 81)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 81)",
        "(line 545,col 9)-(line 545,col 81)",
        "(line 547,col 9)-(line 547,col 81)",
        "(line 548,col 9)-(line 548,col 102)",
        "(line 549,col 9)-(line 549,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 552,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 20)",
        "(line 556,col 9)-(line 556,col 34)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 558,col 9)-(line 558,col 20)",
        "(line 559,col 9)-(line 559,col 34)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 564,col 9)-(line 564,col 82)",
        "(line 565,col 9)-(line 565,col 82)",
        "(line 566,col 9)-(line 566,col 81)",
        "(line 567,col 9)-(line 567,col 81)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 81)",
        "(line 571,col 9)-(line 571,col 81)",
        "(line 573,col 9)-(line 573,col 81)",
        "(line 574,col 9)-(line 574,col 100)",
        "(line 575,col 9)-(line 575,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 578,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 34)",
        "(line 580,col 9)-(line 580,col 20)",
        "(line 581,col 9)-(line 581,col 20)",
        "(line 582,col 9)-(line 582,col 34)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 585,col 34)",
        "(line 586,col 9)-(line 586,col 20)",
        "(line 587,col 9)-(line 587,col 20)",
        "(line 588,col 9)-(line 588,col 20)",
        "(line 590,col 9)-(line 590,col 82)",
        "(line 591,col 9)-(line 591,col 82)",
        "(line 592,col 9)-(line 592,col 81)",
        "(line 593,col 9)-(line 593,col 81)",
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 596,col 81)",
        "(line 597,col 9)-(line 597,col 81)",
        "(line 599,col 9)-(line 599,col 81)",
        "(line 600,col 9)-(line 600,col 100)",
        "(line 601,col 9)-(line 601,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 604,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 38)",
        "(line 606,col 9)-(line 606,col 20)",
        "(line 607,col 9)-(line 607,col 20)",
        "(line 608,col 9)-(line 608,col 38)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 610,col 9)-(line 610,col 20)",
        "(line 611,col 9)-(line 611,col 38)",
        "(line 612,col 9)-(line 612,col 20)",
        "(line 613,col 9)-(line 613,col 20)",
        "(line 614,col 9)-(line 614,col 20)",
        "(line 616,col 9)-(line 616,col 82)",
        "(line 617,col 9)-(line 617,col 82)",
        "(line 618,col 9)-(line 618,col 81)",
        "(line 619,col 9)-(line 619,col 81)",
        "(line 621,col 9)-(line 621,col 20)",
        "(line 622,col 9)-(line 622,col 81)",
        "(line 623,col 9)-(line 623,col 81)",
        "(line 625,col 9)-(line 625,col 81)",
        "(line 626,col 9)-(line 626,col 104)",
        "(line 627,col 9)-(line 627,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 630,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 36)",
        "(line 632,col 9)-(line 632,col 20)",
        "(line 633,col 9)-(line 633,col 20)",
        "(line 634,col 9)-(line 634,col 36)",
        "(line 635,col 9)-(line 635,col 20)",
        "(line 636,col 9)-(line 636,col 20)",
        "(line 637,col 9)-(line 637,col 36)",
        "(line 638,col 9)-(line 638,col 20)",
        "(line 639,col 9)-(line 639,col 20)",
        "(line 640,col 9)-(line 640,col 20)",
        "(line 642,col 9)-(line 642,col 82)",
        "(line 643,col 9)-(line 643,col 82)",
        "(line 644,col 9)-(line 644,col 81)",
        "(line 645,col 9)-(line 645,col 81)",
        "(line 647,col 9)-(line 647,col 20)",
        "(line 648,col 9)-(line 648,col 81)",
        "(line 649,col 9)-(line 649,col 81)",
        "(line 651,col 9)-(line 651,col 81)",
        "(line 652,col 9)-(line 652,col 102)",
        "(line 653,col 9)-(line 653,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 656,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 40)",
        "(line 658,col 9)-(line 658,col 23)",
        "(line 659,col 9)-(line 659,col 24)",
        "(line 660,col 9)-(line 660,col 40)",
        "(line 661,col 9)-(line 661,col 23)",
        "(line 662,col 9)-(line 662,col 24)",
        "(line 663,col 9)-(line 663,col 40)",
        "(line 664,col 9)-(line 664,col 23)",
        "(line 665,col 9)-(line 665,col 24)",
        "(line 666,col 9)-(line 666,col 23)",
        "(line 668,col 9)-(line 668,col 82)",
        "(line 669,col 9)-(line 669,col 82)",
        "(line 670,col 9)-(line 670,col 81)",
        "(line 671,col 9)-(line 671,col 81)",
        "(line 673,col 9)-(line 673,col 23)",
        "(line 674,col 9)-(line 674,col 81)",
        "(line 675,col 9)-(line 675,col 81)",
        "(line 677,col 9)-(line 677,col 81)",
        "(line 678,col 9)-(line 678,col 106)",
        "(line 679,col 9)-(line 679,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 682,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 41)",
        "(line 684,col 9)-(line 684,col 41)",
        "(line 685,col 9)-(line 685,col 41)",
        "(line 686,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 27)",
        "(line 694,col 9)-(line 694,col 27)",
        "(line 696,col 9)-(line 696,col 86)",
        "(line 697,col 9)-(line 697,col 86)",
        "(line 698,col 9)-(line 698,col 85)",
        "(line 699,col 9)-(line 699,col 85)",
        "(line 700,col 9)-(line 700,col 27)",
        "(line 701,col 9)-(line 701,col 85)",
        "(line 702,col 9)-(line 702,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 705,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 39)",
        "(line 707,col 9)-(line 707,col 39)",
        "(line 708,col 9)-(line 708,col 39)",
        "(line 709,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 27)",
        "(line 717,col 9)-(line 717,col 27)",
        "(line 719,col 9)-(line 719,col 86)",
        "(line 720,col 9)-(line 720,col 86)",
        "(line 721,col 9)-(line 721,col 85)",
        "(line 722,col 9)-(line 722,col 85)",
        "(line 723,col 9)-(line 723,col 27)",
        "(line 724,col 9)-(line 724,col 85)",
        "(line 725,col 9)-(line 725,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 728,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 43)",
        "(line 731,col 9)-(line 731,col 43)",
        "(line 732,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 27)",
        "(line 740,col 9)-(line 740,col 27)",
        "(line 742,col 9)-(line 742,col 86)",
        "(line 743,col 9)-(line 743,col 86)",
        "(line 744,col 9)-(line 744,col 85)",
        "(line 745,col 9)-(line 745,col 85)",
        "(line 746,col 9)-(line 746,col 27)",
        "(line 747,col 9)-(line 747,col 85)",
        "(line 748,col 9)-(line 748,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 751,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 41)",
        "(line 753,col 9)-(line 753,col 41)",
        "(line 754,col 9)-(line 754,col 41)",
        "(line 755,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 27)",
        "(line 763,col 9)-(line 763,col 27)",
        "(line 765,col 9)-(line 765,col 86)",
        "(line 766,col 9)-(line 766,col 86)",
        "(line 767,col 9)-(line 767,col 85)",
        "(line 768,col 9)-(line 768,col 85)",
        "(line 769,col 9)-(line 769,col 27)",
        "(line 770,col 9)-(line 770,col 85)",
        "(line 771,col 9)-(line 771,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 774,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 41)",
        "(line 776,col 9)-(line 776,col 41)",
        "(line 777,col 9)-(line 777,col 41)",
        "(line 778,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 27)",
        "(line 786,col 9)-(line 786,col 27)",
        "(line 788,col 9)-(line 788,col 86)",
        "(line 789,col 9)-(line 789,col 86)",
        "(line 790,col 9)-(line 790,col 85)",
        "(line 791,col 9)-(line 791,col 85)",
        "(line 792,col 9)-(line 792,col 27)",
        "(line 793,col 9)-(line 793,col 85)",
        "(line 794,col 9)-(line 794,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 797,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 43)",
        "(line 799,col 9)-(line 799,col 43)",
        "(line 800,col 9)-(line 800,col 43)",
        "(line 801,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 27)",
        "(line 809,col 9)-(line 809,col 27)",
        "(line 811,col 9)-(line 811,col 86)",
        "(line 812,col 9)-(line 812,col 86)",
        "(line 813,col 9)-(line 813,col 85)",
        "(line 814,col 9)-(line 814,col 85)",
        "(line 815,col 9)-(line 815,col 27)",
        "(line 816,col 9)-(line 816,col 85)",
        "(line 817,col 9)-(line 817,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 820,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 45)",
        "(line 822,col 9)-(line 822,col 45)",
        "(line 823,col 9)-(line 823,col 45)",
        "(line 824,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 27)",
        "(line 832,col 9)-(line 832,col 27)",
        "(line 834,col 9)-(line 834,col 86)",
        "(line 835,col 9)-(line 835,col 86)",
        "(line 836,col 9)-(line 836,col 85)",
        "(line 837,col 9)-(line 837,col 85)",
        "(line 838,col 9)-(line 838,col 27)",
        "(line 839,col 9)-(line 839,col 85)",
        "(line 840,col 9)-(line 840,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 843,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 47)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 846,col 47)",
        "(line 847,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 29)",
        "(line 855,col 9)-(line 855,col 29)",
        "(line 857,col 9)-(line 857,col 86)",
        "(line 858,col 9)-(line 858,col 86)",
        "(line 859,col 9)-(line 859,col 85)",
        "(line 860,col 9)-(line 860,col 85)",
        "(line 861,col 9)-(line 861,col 28)",
        "(line 862,col 9)-(line 862,col 85)",
        "(line 863,col 9)-(line 863,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 866,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 40)",
        "(line 868,col 9)-(line 868,col 40)",
        "(line 869,col 9)-(line 869,col 40)",
        "(line 870,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 27)",
        "(line 881,col 9)-(line 881,col 27)",
        "(line 884,col 9)-(line 884,col 86)",
        "(line 885,col 9)-(line 885,col 86)",
        "(line 886,col 9)-(line 886,col 85)",
        "(line 887,col 9)-(line 887,col 85)",
        "(line 888,col 9)-(line 888,col 27)",
        "(line 889,col 9)-(line 889,col 85)",
        "(line 890,col 9)-(line 890,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 893,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 40)",
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 896,col 40)",
        "(line 897,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 36)",
        "(line 908,col 9)-(line 908,col 36)",
        "(line 909,col 9)-(line 909,col 86)",
        "(line 910,col 9)-(line 910,col 86)",
        "(line 911,col 9)-(line 911,col 85)",
        "(line 912,col 9)-(line 912,col 85)",
        "(line 913,col 9)-(line 913,col 38)",
        "(line 914,col 9)-(line 914,col 85)",
        "(line 915,col 9)-(line 915,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 918,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 48)",
        "(line 920,col 9)-(line 920,col 38)",
        "(line 921,col 9)-(line 921,col 38)",
        "(line 922,col 9)-(line 922,col 48)",
        "(line 923,col 9)-(line 923,col 38)",
        "(line 924,col 9)-(line 924,col 38)",
        "(line 925,col 9)-(line 925,col 48)",
        "(line 926,col 9)-(line 926,col 38)",
        "(line 927,col 9)-(line 927,col 38)",
        "(line 928,col 9)-(line 928,col 38)",
        "(line 930,col 9)-(line 930,col 29)",
        "(line 931,col 9)-(line 931,col 29)",
        "(line 932,col 9)-(line 932,col 29)",
        "(line 934,col 9)-(line 934,col 82)",
        "(line 935,col 9)-(line 935,col 82)",
        "(line 936,col 9)-(line 936,col 81)",
        "(line 937,col 9)-(line 937,col 81)",
        "(line 939,col 9)-(line 939,col 38)",
        "(line 940,col 9)-(line 940,col 81)",
        "(line 941,col 9)-(line 941,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 944,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 36)",
        "(line 946,col 9)-(line 946,col 23)",
        "(line 947,col 9)-(line 947,col 23)",
        "(line 948,col 9)-(line 948,col 36)",
        "(line 949,col 9)-(line 949,col 23)",
        "(line 950,col 9)-(line 950,col 23)",
        "(line 951,col 9)-(line 951,col 36)",
        "(line 952,col 9)-(line 952,col 23)",
        "(line 953,col 9)-(line 953,col 23)",
        "(line 954,col 9)-(line 954,col 23)",
        "(line 955,col 9)-(line 955,col 29)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 29)",
        "(line 958,col 9)-(line 958,col 82)",
        "(line 959,col 9)-(line 959,col 82)",
        "(line 960,col 9)-(line 960,col 81)",
        "(line 961,col 9)-(line 961,col 81)",
        "(line 963,col 9)-(line 963,col 22)",
        "(line 964,col 9)-(line 964,col 81)",
        "(line 965,col 9)-(line 965,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 968,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 34)",
        "(line 970,col 9)-(line 970,col 22)",
        "(line 971,col 9)-(line 971,col 22)",
        "(line 972,col 9)-(line 972,col 34)",
        "(line 973,col 9)-(line 973,col 22)",
        "(line 974,col 9)-(line 974,col 22)",
        "(line 975,col 9)-(line 975,col 34)",
        "(line 976,col 9)-(line 976,col 22)",
        "(line 977,col 9)-(line 977,col 22)",
        "(line 978,col 9)-(line 978,col 22)",
        "(line 979,col 9)-(line 979,col 29)",
        "(line 980,col 9)-(line 980,col 29)",
        "(line 981,col 9)-(line 981,col 29)",
        "(line 982,col 9)-(line 982,col 82)",
        "(line 983,col 9)-(line 983,col 82)",
        "(line 984,col 9)-(line 984,col 81)",
        "(line 985,col 9)-(line 985,col 81)",
        "(line 987,col 9)-(line 987,col 22)",
        "(line 988,col 9)-(line 988,col 81)",
        "(line 989,col 9)-(line 989,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 992,
      "end_line": 1014,
      "comment": "",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 38)",
        "(line 994,col 9)-(line 994,col 22)",
        "(line 995,col 9)-(line 995,col 22)",
        "(line 996,col 9)-(line 996,col 38)",
        "(line 997,col 9)-(line 997,col 22)",
        "(line 998,col 9)-(line 998,col 22)",
        "(line 999,col 9)-(line 999,col 38)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 29)",
        "(line 1004,col 9)-(line 1004,col 29)",
        "(line 1005,col 9)-(line 1005,col 29)",
        "(line 1006,col 9)-(line 1006,col 82)",
        "(line 1007,col 9)-(line 1007,col 82)",
        "(line 1008,col 9)-(line 1008,col 81)",
        "(line 1009,col 9)-(line 1009,col 81)",
        "(line 1011,col 9)-(line 1011,col 22)",
        "(line 1012,col 9)-(line 1012,col 81)",
        "(line 1013,col 9)-(line 1013,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1016,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 36)",
        "(line 1018,col 9)-(line 1018,col 22)",
        "(line 1019,col 9)-(line 1019,col 22)",
        "(line 1020,col 9)-(line 1020,col 36)",
        "(line 1021,col 9)-(line 1021,col 22)",
        "(line 1022,col 9)-(line 1022,col 22)",
        "(line 1023,col 9)-(line 1023,col 36)",
        "(line 1024,col 9)-(line 1024,col 22)",
        "(line 1025,col 9)-(line 1025,col 22)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 29)",
        "(line 1028,col 9)-(line 1028,col 29)",
        "(line 1029,col 9)-(line 1029,col 29)",
        "(line 1030,col 9)-(line 1030,col 82)",
        "(line 1031,col 9)-(line 1031,col 82)",
        "(line 1032,col 9)-(line 1032,col 81)",
        "(line 1033,col 9)-(line 1033,col 81)",
        "(line 1035,col 9)-(line 1035,col 22)",
        "(line 1036,col 9)-(line 1036,col 81)",
        "(line 1037,col 9)-(line 1037,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1040,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 36)",
        "(line 1042,col 9)-(line 1042,col 22)",
        "(line 1043,col 9)-(line 1043,col 22)",
        "(line 1044,col 9)-(line 1044,col 36)",
        "(line 1045,col 9)-(line 1045,col 22)",
        "(line 1046,col 9)-(line 1046,col 22)",
        "(line 1047,col 9)-(line 1047,col 36)",
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 22)",
        "(line 1050,col 9)-(line 1050,col 22)",
        "(line 1051,col 9)-(line 1051,col 29)",
        "(line 1052,col 9)-(line 1052,col 29)",
        "(line 1053,col 9)-(line 1053,col 29)",
        "(line 1054,col 9)-(line 1054,col 82)",
        "(line 1055,col 9)-(line 1055,col 82)",
        "(line 1056,col 9)-(line 1056,col 81)",
        "(line 1057,col 9)-(line 1057,col 81)",
        "(line 1059,col 9)-(line 1059,col 22)",
        "(line 1060,col 9)-(line 1060,col 81)",
        "(line 1061,col 9)-(line 1061,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1064,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 40)",
        "(line 1066,col 9)-(line 1066,col 22)",
        "(line 1067,col 9)-(line 1067,col 22)",
        "(line 1068,col 9)-(line 1068,col 40)",
        "(line 1069,col 9)-(line 1069,col 22)",
        "(line 1070,col 9)-(line 1070,col 22)",
        "(line 1071,col 9)-(line 1071,col 40)",
        "(line 1072,col 9)-(line 1072,col 22)",
        "(line 1073,col 9)-(line 1073,col 22)",
        "(line 1074,col 9)-(line 1074,col 22)",
        "(line 1075,col 9)-(line 1075,col 29)",
        "(line 1076,col 9)-(line 1076,col 29)",
        "(line 1077,col 9)-(line 1077,col 29)",
        "(line 1078,col 9)-(line 1078,col 82)",
        "(line 1079,col 9)-(line 1079,col 82)",
        "(line 1080,col 9)-(line 1080,col 81)",
        "(line 1081,col 9)-(line 1081,col 81)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 81)",
        "(line 1085,col 9)-(line 1085,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1088,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 38)",
        "(line 1090,col 9)-(line 1090,col 22)",
        "(line 1091,col 9)-(line 1091,col 22)",
        "(line 1092,col 9)-(line 1092,col 38)",
        "(line 1093,col 9)-(line 1093,col 22)",
        "(line 1094,col 9)-(line 1094,col 22)",
        "(line 1095,col 9)-(line 1095,col 38)",
        "(line 1096,col 9)-(line 1096,col 22)",
        "(line 1097,col 9)-(line 1097,col 22)",
        "(line 1098,col 9)-(line 1098,col 22)",
        "(line 1099,col 9)-(line 1099,col 29)",
        "(line 1100,col 9)-(line 1100,col 29)",
        "(line 1101,col 9)-(line 1101,col 29)",
        "(line 1102,col 9)-(line 1102,col 82)",
        "(line 1103,col 9)-(line 1103,col 82)",
        "(line 1104,col 9)-(line 1104,col 81)",
        "(line 1105,col 9)-(line 1105,col 81)",
        "(line 1107,col 9)-(line 1107,col 22)",
        "(line 1108,col 9)-(line 1108,col 81)",
        "(line 1109,col 9)-(line 1109,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1112,
      "end_line": 1134,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 42)",
        "(line 1114,col 9)-(line 1114,col 25)",
        "(line 1115,col 9)-(line 1115,col 26)",
        "(line 1116,col 9)-(line 1116,col 42)",
        "(line 1117,col 9)-(line 1117,col 25)",
        "(line 1118,col 9)-(line 1118,col 26)",
        "(line 1119,col 9)-(line 1119,col 42)",
        "(line 1120,col 9)-(line 1120,col 25)",
        "(line 1121,col 9)-(line 1121,col 26)",
        "(line 1122,col 9)-(line 1122,col 25)",
        "(line 1123,col 9)-(line 1123,col 29)",
        "(line 1124,col 9)-(line 1124,col 29)",
        "(line 1125,col 9)-(line 1125,col 29)",
        "(line 1126,col 9)-(line 1126,col 82)",
        "(line 1127,col 9)-(line 1127,col 82)",
        "(line 1128,col 9)-(line 1128,col 81)",
        "(line 1129,col 9)-(line 1129,col 81)",
        "(line 1131,col 9)-(line 1131,col 25)",
        "(line 1132,col 9)-(line 1132,col 81)",
        "(line 1133,col 9)-(line 1133,col 81)"
      ]
    }
  ]
}