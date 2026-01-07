{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 1130,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.CompareToBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.CompareToBuilderTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.main(java.lang.String[])",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.suite()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 68)",
        "(line 43,col 9)-(line 43,col 48)",
        "(line 44,col 9)-(line 44,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.setUp()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.tearDown()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 57,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 65,col 13)",
        "(line 66,col 13)-(line 68,col 13)",
        "(line 69,col 13)-(line 69,col 44)",
        "(line 70,col 13)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.compareTo(java.lang.Object)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 44)",
        "(line 82,col 13)-(line 82,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 86,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 21)",
        "(line 93,col 13)-(line 93,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 98,col 13)",
        "(line 99,col 13)-(line 101,col 13)",
        "(line 102,col 13)-(line 102,col 50)",
        "(line 103,col 13)-(line 103,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 107,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 21)",
        "(line 111,col 13)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 42)",
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 19)",
        "(line 121,col 9)-(line 121,col 67)",
        "(line 122,col 9)-(line 122,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 135,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 148,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 54)",
        "(line 150,col 9)-(line 150,col 60)",
        "(line 152,col 9)-(line 152,col 24)",
        "(line 153,col 9)-(line 153,col 24)",
        "(line 154,col 9)-(line 154,col 24)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 157,col 36)",
        "(line 158,col 9)-(line 158,col 36)",
        "(line 159,col 9)-(line 159,col 60)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 167,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 51)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 33)",
        "(line 172,col 9)-(line 172,col 33)",
        "(line 174,col 9)-(line 174,col 45)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 177,col 9)-(line 177,col 51)",
        "(line 179,col 9)-(line 179,col 45)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 182,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 185,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 103)",
        "(line 187,col 9)-(line 187,col 103)",
        "(line 188,col 9)-(line 188,col 103)",
        "(line 190,col 9)-(line 190,col 102)",
        "(line 191,col 9)-(line 191,col 102)",
        "(line 192,col 9)-(line 192,col 102)",
        "(line 194,col 9)-(line 194,col 102)",
        "(line 195,col 9)-(line 195,col 102)",
        "(line 196,col 9)-(line 196,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 199,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 43)",
        "(line 201,col 9)-(line 201,col 43)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 205,col 53)",
        "(line 207,col 9)-(line 207,col 77)",
        "(line 208,col 9)-(line 208,col 77)",
        "(line 209,col 9)-(line 209,col 80)",
        "(line 210,col 9)-(line 210,col 80)",
        "(line 211,col 9)-(line 211,col 77)",
        "(line 213,col 9)-(line 213,col 107)",
        "(line 214,col 9)-(line 214,col 107)",
        "(line 217,col 9)-(line 217,col 57)",
        "(line 219,col 9)-(line 219,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 146)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 248,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 265,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 268,col 93)",
        "(line 269,col 9)-(line 269,col 92)",
        "(line 270,col 9)-(line 270,col 92)",
        "(line 272,col 9)-(line 272,col 93)",
        "(line 273,col 9)-(line 273,col 93)",
        "(line 275,col 9)-(line 275,col 92)",
        "(line 276,col 9)-(line 276,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObject()",
      "begin_line": 279,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 78)",
        "(line 283,col 9)-(line 283,col 78)",
        "(line 284,col 9)-(line 284,col 19)",
        "(line 285,col 9)-(line 285,col 77)",
        "(line 286,col 9)-(line 286,col 77)",
        "(line 288,col 9)-(line 288,col 79)",
        "(line 289,col 9)-(line 289,col 100)",
        "(line 290,col 9)-(line 290,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 293,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 42)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 299,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 302,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 27)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 109)",
        "(line 306,col 9)-(line 306,col 109)",
        "(line 307,col 9)-(line 307,col 20)",
        "(line 308,col 9)-(line 308,col 109)",
        "(line 309,col 9)-(line 309,col 109)",
        "(line 310,col 9)-(line 310,col 21)",
        "(line 311,col 9)-(line 311,col 108)",
        "(line 312,col 9)-(line 312,col 108)",
        "(line 314,col 9)-(line 314,col 110)",
        "(line 315,col 9)-(line 315,col 131)",
        "(line 316,col 9)-(line 316,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 319,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 27)",
        "(line 321,col 9)-(line 321,col 27)",
        "(line 322,col 9)-(line 322,col 84)",
        "(line 323,col 9)-(line 323,col 84)",
        "(line 324,col 9)-(line 324,col 21)",
        "(line 325,col 9)-(line 325,col 83)",
        "(line 326,col 9)-(line 326,col 83)",
        "(line 328,col 9)-(line 328,col 85)",
        "(line 329,col 9)-(line 329,col 106)",
        "(line 330,col 9)-(line 330,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLong()",
      "begin_line": 333,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 21)",
        "(line 335,col 9)-(line 335,col 21)",
        "(line 336,col 9)-(line 336,col 78)",
        "(line 337,col 9)-(line 337,col 77)",
        "(line 338,col 9)-(line 338,col 77)",
        "(line 339,col 9)-(line 339,col 89)",
        "(line 340,col 9)-(line 340,col 89)",
        "(line 341,col 9)-(line 341,col 89)",
        "(line 342,col 9)-(line 342,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testInt()",
      "begin_line": 345,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 19)",
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 348,col 78)",
        "(line 349,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 350,col 77)",
        "(line 351,col 9)-(line 351,col 92)",
        "(line 352,col 9)-(line 352,col 92)",
        "(line 353,col 9)-(line 353,col 92)",
        "(line 354,col 9)-(line 354,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShort()",
      "begin_line": 357,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 21)",
        "(line 359,col 9)-(line 359,col 21)",
        "(line 360,col 9)-(line 360,col 78)",
        "(line 361,col 9)-(line 361,col 77)",
        "(line 362,col 9)-(line 362,col 77)",
        "(line 363,col 9)-(line 363,col 90)",
        "(line 364,col 9)-(line 364,col 90)",
        "(line 365,col 9)-(line 365,col 90)",
        "(line 366,col 9)-(line 366,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testChar()",
      "begin_line": 369,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 20)",
        "(line 371,col 9)-(line 371,col 20)",
        "(line 372,col 9)-(line 372,col 78)",
        "(line 373,col 9)-(line 373,col 77)",
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 375,col 94)",
        "(line 376,col 9)-(line 376,col 94)",
        "(line 377,col 9)-(line 377,col 94)",
        "(line 378,col 9)-(line 378,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByte()",
      "begin_line": 381,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 20)",
        "(line 383,col 9)-(line 383,col 20)",
        "(line 384,col 9)-(line 384,col 78)",
        "(line 385,col 9)-(line 385,col 77)",
        "(line 386,col 9)-(line 386,col 77)",
        "(line 387,col 9)-(line 387,col 89)",
        "(line 388,col 9)-(line 388,col 89)",
        "(line 389,col 9)-(line 389,col 89)",
        "(line 390,col 9)-(line 390,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 393,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 22)",
        "(line 395,col 9)-(line 395,col 22)",
        "(line 396,col 9)-(line 396,col 78)",
        "(line 397,col 9)-(line 397,col 77)",
        "(line 398,col 9)-(line 398,col 77)",
        "(line 399,col 9)-(line 399,col 91)",
        "(line 400,col 9)-(line 400,col 91)",
        "(line 401,col 9)-(line 401,col 91)",
        "(line 402,col 9)-(line 402,col 91)",
        "(line 403,col 9)-(line 403,col 94)",
        "(line 404,col 9)-(line 404,col 99)",
        "(line 405,col 9)-(line 405,col 113)",
        "(line 406,col 9)-(line 406,col 113)",
        "(line 407,col 9)-(line 407,col 85)",
        "(line 408,col 9)-(line 408,col 85)",
        "(line 409,col 9)-(line 409,col 80)",
        "(line 410,col 9)-(line 410,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 413,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 21)",
        "(line 415,col 9)-(line 415,col 21)",
        "(line 416,col 9)-(line 416,col 78)",
        "(line 417,col 9)-(line 417,col 77)",
        "(line 418,col 9)-(line 418,col 77)",
        "(line 419,col 9)-(line 419,col 90)",
        "(line 420,col 9)-(line 420,col 90)",
        "(line 421,col 9)-(line 421,col 90)",
        "(line 422,col 9)-(line 422,col 90)",
        "(line 423,col 9)-(line 423,col 92)",
        "(line 424,col 9)-(line 424,col 97)",
        "(line 425,col 9)-(line 425,col 111)",
        "(line 426,col 9)-(line 426,col 111)",
        "(line 427,col 9)-(line 427,col 84)",
        "(line 428,col 9)-(line 428,col 84)",
        "(line 429,col 9)-(line 429,col 80)",
        "(line 430,col 9)-(line 430,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 433,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 26)",
        "(line 435,col 9)-(line 435,col 27)",
        "(line 436,col 9)-(line 436,col 78)",
        "(line 437,col 9)-(line 437,col 78)",
        "(line 438,col 9)-(line 438,col 77)",
        "(line 439,col 9)-(line 439,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 442,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 46)",
        "(line 444,col 9)-(line 444,col 36)",
        "(line 445,col 9)-(line 445,col 36)",
        "(line 446,col 9)-(line 446,col 46)",
        "(line 447,col 9)-(line 447,col 36)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 36)",
        "(line 454,col 9)-(line 454,col 82)",
        "(line 455,col 9)-(line 455,col 82)",
        "(line 456,col 9)-(line 456,col 81)",
        "(line 457,col 9)-(line 457,col 81)",
        "(line 459,col 9)-(line 459,col 36)",
        "(line 460,col 9)-(line 460,col 81)",
        "(line 461,col 9)-(line 461,col 81)",
        "(line 463,col 9)-(line 463,col 81)",
        "(line 464,col 9)-(line 464,col 104)",
        "(line 465,col 9)-(line 465,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 468,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 34)",
        "(line 470,col 9)-(line 470,col 21)",
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 34)",
        "(line 473,col 9)-(line 473,col 21)",
        "(line 474,col 9)-(line 474,col 21)",
        "(line 475,col 9)-(line 475,col 34)",
        "(line 476,col 9)-(line 476,col 21)",
        "(line 477,col 9)-(line 477,col 21)",
        "(line 478,col 9)-(line 478,col 21)",
        "(line 480,col 9)-(line 480,col 82)",
        "(line 481,col 9)-(line 481,col 82)",
        "(line 482,col 9)-(line 482,col 81)",
        "(line 483,col 9)-(line 483,col 81)",
        "(line 485,col 9)-(line 485,col 20)",
        "(line 486,col 9)-(line 486,col 81)",
        "(line 487,col 9)-(line 487,col 81)",
        "(line 489,col 9)-(line 489,col 81)",
        "(line 490,col 9)-(line 490,col 100)",
        "(line 491,col 9)-(line 491,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 494,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 32)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 32)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 32)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 20)",
        "(line 506,col 9)-(line 506,col 82)",
        "(line 507,col 9)-(line 507,col 82)",
        "(line 508,col 9)-(line 508,col 81)",
        "(line 509,col 9)-(line 509,col 81)",
        "(line 511,col 9)-(line 511,col 20)",
        "(line 512,col 9)-(line 512,col 81)",
        "(line 513,col 9)-(line 513,col 81)",
        "(line 515,col 9)-(line 515,col 81)",
        "(line 516,col 9)-(line 516,col 98)",
        "(line 517,col 9)-(line 517,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 520,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 36)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 20)",
        "(line 527,col 9)-(line 527,col 36)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 532,col 9)-(line 532,col 82)",
        "(line 533,col 9)-(line 533,col 82)",
        "(line 534,col 9)-(line 534,col 81)",
        "(line 535,col 9)-(line 535,col 81)",
        "(line 537,col 9)-(line 537,col 20)",
        "(line 538,col 9)-(line 538,col 81)",
        "(line 539,col 9)-(line 539,col 81)",
        "(line 541,col 9)-(line 541,col 81)",
        "(line 542,col 9)-(line 542,col 102)",
        "(line 543,col 9)-(line 543,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 546,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 34)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 34)",
        "(line 551,col 9)-(line 551,col 20)",
        "(line 552,col 9)-(line 552,col 20)",
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 20)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 558,col 9)-(line 558,col 82)",
        "(line 559,col 9)-(line 559,col 82)",
        "(line 560,col 9)-(line 560,col 81)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 81)",
        "(line 565,col 9)-(line 565,col 81)",
        "(line 567,col 9)-(line 567,col 81)",
        "(line 568,col 9)-(line 568,col 100)",
        "(line 569,col 9)-(line 569,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 572,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 34)",
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 20)",
        "(line 579,col 9)-(line 579,col 34)",
        "(line 580,col 9)-(line 580,col 20)",
        "(line 581,col 9)-(line 581,col 20)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 584,col 9)-(line 584,col 82)",
        "(line 585,col 9)-(line 585,col 82)",
        "(line 586,col 9)-(line 586,col 81)",
        "(line 587,col 9)-(line 587,col 81)",
        "(line 589,col 9)-(line 589,col 20)",
        "(line 590,col 9)-(line 590,col 81)",
        "(line 591,col 9)-(line 591,col 81)",
        "(line 593,col 9)-(line 593,col 81)",
        "(line 594,col 9)-(line 594,col 100)",
        "(line 595,col 9)-(line 595,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 598,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 38)",
        "(line 600,col 9)-(line 600,col 20)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 38)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 604,col 9)-(line 604,col 20)",
        "(line 605,col 9)-(line 605,col 38)",
        "(line 606,col 9)-(line 606,col 20)",
        "(line 607,col 9)-(line 607,col 20)",
        "(line 608,col 9)-(line 608,col 20)",
        "(line 610,col 9)-(line 610,col 82)",
        "(line 611,col 9)-(line 611,col 82)",
        "(line 612,col 9)-(line 612,col 81)",
        "(line 613,col 9)-(line 613,col 81)",
        "(line 615,col 9)-(line 615,col 20)",
        "(line 616,col 9)-(line 616,col 81)",
        "(line 617,col 9)-(line 617,col 81)",
        "(line 619,col 9)-(line 619,col 81)",
        "(line 620,col 9)-(line 620,col 104)",
        "(line 621,col 9)-(line 621,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 624,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 36)",
        "(line 626,col 9)-(line 626,col 20)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 36)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 631,col 9)-(line 631,col 36)",
        "(line 632,col 9)-(line 632,col 20)",
        "(line 633,col 9)-(line 633,col 20)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 636,col 9)-(line 636,col 82)",
        "(line 637,col 9)-(line 637,col 82)",
        "(line 638,col 9)-(line 638,col 81)",
        "(line 639,col 9)-(line 639,col 81)",
        "(line 641,col 9)-(line 641,col 20)",
        "(line 642,col 9)-(line 642,col 81)",
        "(line 643,col 9)-(line 643,col 81)",
        "(line 645,col 9)-(line 645,col 81)",
        "(line 646,col 9)-(line 646,col 102)",
        "(line 647,col 9)-(line 647,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 650,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 40)",
        "(line 652,col 9)-(line 652,col 23)",
        "(line 653,col 9)-(line 653,col 24)",
        "(line 654,col 9)-(line 654,col 40)",
        "(line 655,col 9)-(line 655,col 23)",
        "(line 656,col 9)-(line 656,col 24)",
        "(line 657,col 9)-(line 657,col 40)",
        "(line 658,col 9)-(line 658,col 23)",
        "(line 659,col 9)-(line 659,col 24)",
        "(line 660,col 9)-(line 660,col 23)",
        "(line 662,col 9)-(line 662,col 82)",
        "(line 663,col 9)-(line 663,col 82)",
        "(line 664,col 9)-(line 664,col 81)",
        "(line 665,col 9)-(line 665,col 81)",
        "(line 667,col 9)-(line 667,col 23)",
        "(line 668,col 9)-(line 668,col 81)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 671,col 9)-(line 671,col 81)",
        "(line 672,col 9)-(line 672,col 106)",
        "(line 673,col 9)-(line 673,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 676,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 41)",
        "(line 678,col 9)-(line 678,col 41)",
        "(line 679,col 9)-(line 679,col 41)",
        "(line 680,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 27)",
        "(line 688,col 9)-(line 688,col 27)",
        "(line 690,col 9)-(line 690,col 86)",
        "(line 691,col 9)-(line 691,col 86)",
        "(line 692,col 9)-(line 692,col 85)",
        "(line 693,col 9)-(line 693,col 85)",
        "(line 694,col 9)-(line 694,col 27)",
        "(line 695,col 9)-(line 695,col 85)",
        "(line 696,col 9)-(line 696,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 699,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 39)",
        "(line 701,col 9)-(line 701,col 39)",
        "(line 702,col 9)-(line 702,col 39)",
        "(line 703,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 27)",
        "(line 711,col 9)-(line 711,col 27)",
        "(line 713,col 9)-(line 713,col 86)",
        "(line 714,col 9)-(line 714,col 86)",
        "(line 715,col 9)-(line 715,col 85)",
        "(line 716,col 9)-(line 716,col 85)",
        "(line 717,col 9)-(line 717,col 27)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 722,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 43)",
        "(line 724,col 9)-(line 724,col 43)",
        "(line 725,col 9)-(line 725,col 43)",
        "(line 726,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 27)",
        "(line 734,col 9)-(line 734,col 27)",
        "(line 736,col 9)-(line 736,col 86)",
        "(line 737,col 9)-(line 737,col 86)",
        "(line 738,col 9)-(line 738,col 85)",
        "(line 739,col 9)-(line 739,col 85)",
        "(line 740,col 9)-(line 740,col 27)",
        "(line 741,col 9)-(line 741,col 85)",
        "(line 742,col 9)-(line 742,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 745,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 41)",
        "(line 747,col 9)-(line 747,col 41)",
        "(line 748,col 9)-(line 748,col 41)",
        "(line 749,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 27)",
        "(line 757,col 9)-(line 757,col 27)",
        "(line 759,col 9)-(line 759,col 86)",
        "(line 760,col 9)-(line 760,col 86)",
        "(line 761,col 9)-(line 761,col 85)",
        "(line 762,col 9)-(line 762,col 85)",
        "(line 763,col 9)-(line 763,col 27)",
        "(line 764,col 9)-(line 764,col 85)",
        "(line 765,col 9)-(line 765,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 768,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 41)",
        "(line 770,col 9)-(line 770,col 41)",
        "(line 771,col 9)-(line 771,col 41)",
        "(line 772,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 27)",
        "(line 780,col 9)-(line 780,col 27)",
        "(line 782,col 9)-(line 782,col 86)",
        "(line 783,col 9)-(line 783,col 86)",
        "(line 784,col 9)-(line 784,col 85)",
        "(line 785,col 9)-(line 785,col 85)",
        "(line 786,col 9)-(line 786,col 27)",
        "(line 787,col 9)-(line 787,col 85)",
        "(line 788,col 9)-(line 788,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 791,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 43)",
        "(line 793,col 9)-(line 793,col 43)",
        "(line 794,col 9)-(line 794,col 43)",
        "(line 795,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 27)",
        "(line 803,col 9)-(line 803,col 27)",
        "(line 805,col 9)-(line 805,col 86)",
        "(line 806,col 9)-(line 806,col 86)",
        "(line 807,col 9)-(line 807,col 85)",
        "(line 808,col 9)-(line 808,col 85)",
        "(line 809,col 9)-(line 809,col 27)",
        "(line 810,col 9)-(line 810,col 85)",
        "(line 811,col 9)-(line 811,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 814,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 45)",
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 27)",
        "(line 826,col 9)-(line 826,col 27)",
        "(line 828,col 9)-(line 828,col 86)",
        "(line 829,col 9)-(line 829,col 86)",
        "(line 830,col 9)-(line 830,col 85)",
        "(line 831,col 9)-(line 831,col 85)",
        "(line 832,col 9)-(line 832,col 27)",
        "(line 833,col 9)-(line 833,col 85)",
        "(line 834,col 9)-(line 834,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 837,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 47)",
        "(line 839,col 9)-(line 839,col 47)",
        "(line 840,col 9)-(line 840,col 47)",
        "(line 841,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 29)",
        "(line 849,col 9)-(line 849,col 29)",
        "(line 851,col 9)-(line 851,col 86)",
        "(line 852,col 9)-(line 852,col 86)",
        "(line 853,col 9)-(line 853,col 85)",
        "(line 854,col 9)-(line 854,col 85)",
        "(line 855,col 9)-(line 855,col 28)",
        "(line 856,col 9)-(line 856,col 85)",
        "(line 857,col 9)-(line 857,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 860,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 40)",
        "(line 862,col 9)-(line 862,col 40)",
        "(line 863,col 9)-(line 863,col 40)",
        "(line 864,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 27)",
        "(line 875,col 9)-(line 875,col 27)",
        "(line 878,col 9)-(line 878,col 86)",
        "(line 879,col 9)-(line 879,col 86)",
        "(line 880,col 9)-(line 880,col 85)",
        "(line 881,col 9)-(line 881,col 85)",
        "(line 882,col 9)-(line 882,col 27)",
        "(line 883,col 9)-(line 883,col 85)",
        "(line 884,col 9)-(line 884,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 887,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 40)",
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 890,col 40)",
        "(line 891,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 36)",
        "(line 902,col 9)-(line 902,col 36)",
        "(line 903,col 9)-(line 903,col 86)",
        "(line 904,col 9)-(line 904,col 86)",
        "(line 905,col 9)-(line 905,col 85)",
        "(line 906,col 9)-(line 906,col 85)",
        "(line 907,col 9)-(line 907,col 38)",
        "(line 908,col 9)-(line 908,col 85)",
        "(line 909,col 9)-(line 909,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 912,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 48)",
        "(line 914,col 9)-(line 914,col 38)",
        "(line 915,col 9)-(line 915,col 38)",
        "(line 916,col 9)-(line 916,col 48)",
        "(line 917,col 9)-(line 917,col 38)",
        "(line 918,col 9)-(line 918,col 38)",
        "(line 919,col 9)-(line 919,col 48)",
        "(line 920,col 9)-(line 920,col 38)",
        "(line 921,col 9)-(line 921,col 38)",
        "(line 922,col 9)-(line 922,col 38)",
        "(line 924,col 9)-(line 924,col 29)",
        "(line 925,col 9)-(line 925,col 29)",
        "(line 926,col 9)-(line 926,col 29)",
        "(line 928,col 9)-(line 928,col 82)",
        "(line 929,col 9)-(line 929,col 82)",
        "(line 930,col 9)-(line 930,col 81)",
        "(line 931,col 9)-(line 931,col 81)",
        "(line 933,col 9)-(line 933,col 38)",
        "(line 934,col 9)-(line 934,col 81)",
        "(line 935,col 9)-(line 935,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 938,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 36)",
        "(line 940,col 9)-(line 940,col 23)",
        "(line 941,col 9)-(line 941,col 23)",
        "(line 942,col 9)-(line 942,col 36)",
        "(line 943,col 9)-(line 943,col 23)",
        "(line 944,col 9)-(line 944,col 23)",
        "(line 945,col 9)-(line 945,col 36)",
        "(line 946,col 9)-(line 946,col 23)",
        "(line 947,col 9)-(line 947,col 23)",
        "(line 948,col 9)-(line 948,col 23)",
        "(line 949,col 9)-(line 949,col 29)",
        "(line 950,col 9)-(line 950,col 29)",
        "(line 951,col 9)-(line 951,col 29)",
        "(line 952,col 9)-(line 952,col 82)",
        "(line 953,col 9)-(line 953,col 82)",
        "(line 954,col 9)-(line 954,col 81)",
        "(line 955,col 9)-(line 955,col 81)",
        "(line 957,col 9)-(line 957,col 22)",
        "(line 958,col 9)-(line 958,col 81)",
        "(line 959,col 9)-(line 959,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 962,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 34)",
        "(line 964,col 9)-(line 964,col 22)",
        "(line 965,col 9)-(line 965,col 22)",
        "(line 966,col 9)-(line 966,col 34)",
        "(line 967,col 9)-(line 967,col 22)",
        "(line 968,col 9)-(line 968,col 22)",
        "(line 969,col 9)-(line 969,col 34)",
        "(line 970,col 9)-(line 970,col 22)",
        "(line 971,col 9)-(line 971,col 22)",
        "(line 972,col 9)-(line 972,col 22)",
        "(line 973,col 9)-(line 973,col 29)",
        "(line 974,col 9)-(line 974,col 29)",
        "(line 975,col 9)-(line 975,col 29)",
        "(line 976,col 9)-(line 976,col 82)",
        "(line 977,col 9)-(line 977,col 82)",
        "(line 978,col 9)-(line 978,col 81)",
        "(line 979,col 9)-(line 979,col 81)",
        "(line 981,col 9)-(line 981,col 22)",
        "(line 982,col 9)-(line 982,col 81)",
        "(line 983,col 9)-(line 983,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 986,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 38)",
        "(line 988,col 9)-(line 988,col 22)",
        "(line 989,col 9)-(line 989,col 22)",
        "(line 990,col 9)-(line 990,col 38)",
        "(line 991,col 9)-(line 991,col 22)",
        "(line 992,col 9)-(line 992,col 22)",
        "(line 993,col 9)-(line 993,col 38)",
        "(line 994,col 9)-(line 994,col 22)",
        "(line 995,col 9)-(line 995,col 22)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 29)",
        "(line 998,col 9)-(line 998,col 29)",
        "(line 999,col 9)-(line 999,col 29)",
        "(line 1000,col 9)-(line 1000,col 82)",
        "(line 1001,col 9)-(line 1001,col 82)",
        "(line 1002,col 9)-(line 1002,col 81)",
        "(line 1003,col 9)-(line 1003,col 81)",
        "(line 1005,col 9)-(line 1005,col 22)",
        "(line 1006,col 9)-(line 1006,col 81)",
        "(line 1007,col 9)-(line 1007,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1010,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 36)",
        "(line 1012,col 9)-(line 1012,col 22)",
        "(line 1013,col 9)-(line 1013,col 22)",
        "(line 1014,col 9)-(line 1014,col 36)",
        "(line 1015,col 9)-(line 1015,col 22)",
        "(line 1016,col 9)-(line 1016,col 22)",
        "(line 1017,col 9)-(line 1017,col 36)",
        "(line 1018,col 9)-(line 1018,col 22)",
        "(line 1019,col 9)-(line 1019,col 22)",
        "(line 1020,col 9)-(line 1020,col 22)",
        "(line 1021,col 9)-(line 1021,col 29)",
        "(line 1022,col 9)-(line 1022,col 29)",
        "(line 1023,col 9)-(line 1023,col 29)",
        "(line 1024,col 9)-(line 1024,col 82)",
        "(line 1025,col 9)-(line 1025,col 82)",
        "(line 1026,col 9)-(line 1026,col 81)",
        "(line 1027,col 9)-(line 1027,col 81)",
        "(line 1029,col 9)-(line 1029,col 22)",
        "(line 1030,col 9)-(line 1030,col 81)",
        "(line 1031,col 9)-(line 1031,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1034,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 36)",
        "(line 1036,col 9)-(line 1036,col 22)",
        "(line 1037,col 9)-(line 1037,col 22)",
        "(line 1038,col 9)-(line 1038,col 36)",
        "(line 1039,col 9)-(line 1039,col 22)",
        "(line 1040,col 9)-(line 1040,col 22)",
        "(line 1041,col 9)-(line 1041,col 36)",
        "(line 1042,col 9)-(line 1042,col 22)",
        "(line 1043,col 9)-(line 1043,col 22)",
        "(line 1044,col 9)-(line 1044,col 22)",
        "(line 1045,col 9)-(line 1045,col 29)",
        "(line 1046,col 9)-(line 1046,col 29)",
        "(line 1047,col 9)-(line 1047,col 29)",
        "(line 1048,col 9)-(line 1048,col 82)",
        "(line 1049,col 9)-(line 1049,col 82)",
        "(line 1050,col 9)-(line 1050,col 81)",
        "(line 1051,col 9)-(line 1051,col 81)",
        "(line 1053,col 9)-(line 1053,col 22)",
        "(line 1054,col 9)-(line 1054,col 81)",
        "(line 1055,col 9)-(line 1055,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1058,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 40)",
        "(line 1060,col 9)-(line 1060,col 22)",
        "(line 1061,col 9)-(line 1061,col 22)",
        "(line 1062,col 9)-(line 1062,col 40)",
        "(line 1063,col 9)-(line 1063,col 22)",
        "(line 1064,col 9)-(line 1064,col 22)",
        "(line 1065,col 9)-(line 1065,col 40)",
        "(line 1066,col 9)-(line 1066,col 22)",
        "(line 1067,col 9)-(line 1067,col 22)",
        "(line 1068,col 9)-(line 1068,col 22)",
        "(line 1069,col 9)-(line 1069,col 29)",
        "(line 1070,col 9)-(line 1070,col 29)",
        "(line 1071,col 9)-(line 1071,col 29)",
        "(line 1072,col 9)-(line 1072,col 82)",
        "(line 1073,col 9)-(line 1073,col 82)",
        "(line 1074,col 9)-(line 1074,col 81)",
        "(line 1075,col 9)-(line 1075,col 81)",
        "(line 1077,col 9)-(line 1077,col 22)",
        "(line 1078,col 9)-(line 1078,col 81)",
        "(line 1079,col 9)-(line 1079,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1082,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 38)",
        "(line 1084,col 9)-(line 1084,col 22)",
        "(line 1085,col 9)-(line 1085,col 22)",
        "(line 1086,col 9)-(line 1086,col 38)",
        "(line 1087,col 9)-(line 1087,col 22)",
        "(line 1088,col 9)-(line 1088,col 22)",
        "(line 1089,col 9)-(line 1089,col 38)",
        "(line 1090,col 9)-(line 1090,col 22)",
        "(line 1091,col 9)-(line 1091,col 22)",
        "(line 1092,col 9)-(line 1092,col 22)",
        "(line 1093,col 9)-(line 1093,col 29)",
        "(line 1094,col 9)-(line 1094,col 29)",
        "(line 1095,col 9)-(line 1095,col 29)",
        "(line 1096,col 9)-(line 1096,col 82)",
        "(line 1097,col 9)-(line 1097,col 82)",
        "(line 1098,col 9)-(line 1098,col 81)",
        "(line 1099,col 9)-(line 1099,col 81)",
        "(line 1101,col 9)-(line 1101,col 22)",
        "(line 1102,col 9)-(line 1102,col 81)",
        "(line 1103,col 9)-(line 1103,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1106,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 42)",
        "(line 1108,col 9)-(line 1108,col 25)",
        "(line 1109,col 9)-(line 1109,col 26)",
        "(line 1110,col 9)-(line 1110,col 42)",
        "(line 1111,col 9)-(line 1111,col 25)",
        "(line 1112,col 9)-(line 1112,col 26)",
        "(line 1113,col 9)-(line 1113,col 42)",
        "(line 1114,col 9)-(line 1114,col 25)",
        "(line 1115,col 9)-(line 1115,col 26)",
        "(line 1116,col 9)-(line 1116,col 25)",
        "(line 1117,col 9)-(line 1117,col 29)",
        "(line 1118,col 9)-(line 1118,col 29)",
        "(line 1119,col 9)-(line 1119,col 29)",
        "(line 1120,col 9)-(line 1120,col 82)",
        "(line 1121,col 9)-(line 1121,col 82)",
        "(line 1122,col 9)-(line 1122,col 81)",
        "(line 1123,col 9)-(line 1123,col 81)",
        "(line 1125,col 9)-(line 1125,col 25)",
        "(line 1126,col 9)-(line 1126,col 81)",
        "(line 1127,col 9)-(line 1127,col 81)"
      ]
    }
  ]
}