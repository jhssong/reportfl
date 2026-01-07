{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1135,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.CompareToBuilderTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.main(java.lang.String[])",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.suite()",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.setUp()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.tearDown()",
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
        "java.lang.Comparable\u003corg.apache.commons.lang3.builder.CompareToBuilderTest.TestObject\u003e"
      ],
      "begin_line": 60,
      "end_line": 87,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 89,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 21)",
        "(line 96,col 13)-(line 96,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 102,col 13)",
        "(line 103,col 13)-(line 105,col 13)",
        "(line 106,col 13)-(line 106,col 50)",
        "(line 107,col 13)-(line 107,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 111,
      "end_line": 118,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 21)",
        "(line 116,col 13)-(line 116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 120,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)",
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 123,col 68)",
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 125,col 19)",
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 127,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 130,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 146,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 153,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 54)",
        "(line 155,col 9)-(line 155,col 60)",
        "(line 157,col 9)-(line 157,col 24)",
        "(line 158,col 9)-(line 158,col 24)",
        "(line 159,col 9)-(line 159,col 24)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 60)",
        "(line 166,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 172,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 51)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 179,col 9)-(line 179,col 45)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 184,col 9)-(line 184,col 45)",
        "(line 185,col 9)-(line 185,col 45)",
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 190,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 103)",
        "(line 192,col 9)-(line 192,col 103)",
        "(line 193,col 9)-(line 193,col 103)",
        "(line 195,col 9)-(line 195,col 102)",
        "(line 196,col 9)-(line 196,col 102)",
        "(line 197,col 9)-(line 197,col 102)",
        "(line 199,col 9)-(line 199,col 102)",
        "(line 200,col 9)-(line 200,col 102)",
        "(line 201,col 9)-(line 201,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 204,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 43)",
        "(line 206,col 9)-(line 206,col 43)",
        "(line 207,col 9)-(line 207,col 43)",
        "(line 208,col 9)-(line 208,col 53)",
        "(line 209,col 9)-(line 209,col 53)",
        "(line 210,col 9)-(line 210,col 53)",
        "(line 212,col 9)-(line 212,col 77)",
        "(line 213,col 9)-(line 213,col 77)",
        "(line 214,col 9)-(line 214,col 80)",
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 216,col 77)",
        "(line 218,col 9)-(line 218,col 107)",
        "(line 219,col 9)-(line 219,col 107)",
        "(line 222,col 9)-(line 222,col 57)",
        "(line 224,col 9)-(line 224,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 146)",
        "(line 242,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 253,col 9)-(line 253,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 270,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 93)",
        "(line 274,col 9)-(line 274,col 92)",
        "(line 275,col 9)-(line 275,col 92)",
        "(line 277,col 9)-(line 277,col 93)",
        "(line 278,col 9)-(line 278,col 93)",
        "(line 280,col 9)-(line 280,col 92)",
        "(line 281,col 9)-(line 281,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 284,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 78)",
        "(line 288,col 9)-(line 288,col 78)",
        "(line 289,col 9)-(line 289,col 19)",
        "(line 290,col 9)-(line 290,col 77)",
        "(line 291,col 9)-(line 291,col 77)",
        "(line 293,col 9)-(line 293,col 79)",
        "(line 294,col 9)-(line 294,col 100)",
        "(line 295,col 9)-(line 295,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 298,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 304,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 307,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 310,col 109)",
        "(line 311,col 9)-(line 311,col 109)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 313,col 9)-(line 313,col 109)",
        "(line 314,col 9)-(line 314,col 109)",
        "(line 315,col 9)-(line 315,col 21)",
        "(line 316,col 9)-(line 316,col 108)",
        "(line 317,col 9)-(line 317,col 108)",
        "(line 319,col 9)-(line 319,col 110)",
        "(line 320,col 9)-(line 320,col 131)",
        "(line 321,col 9)-(line 321,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 324,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 27)",
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 84)",
        "(line 328,col 9)-(line 328,col 84)",
        "(line 329,col 9)-(line 329,col 21)",
        "(line 330,col 9)-(line 330,col 83)",
        "(line 331,col 9)-(line 331,col 83)",
        "(line 333,col 9)-(line 333,col 85)",
        "(line 334,col 9)-(line 334,col 106)",
        "(line 335,col 9)-(line 335,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 338,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 21)",
        "(line 340,col 9)-(line 340,col 21)",
        "(line 341,col 9)-(line 341,col 78)",
        "(line 342,col 9)-(line 342,col 77)",
        "(line 343,col 9)-(line 343,col 77)",
        "(line 344,col 9)-(line 344,col 89)",
        "(line 345,col 9)-(line 345,col 89)",
        "(line 346,col 9)-(line 346,col 89)",
        "(line 347,col 9)-(line 347,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 350,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 19)",
        "(line 352,col 9)-(line 352,col 19)",
        "(line 353,col 9)-(line 353,col 78)",
        "(line 354,col 9)-(line 354,col 77)",
        "(line 355,col 9)-(line 355,col 77)",
        "(line 356,col 9)-(line 356,col 92)",
        "(line 357,col 9)-(line 357,col 92)",
        "(line 358,col 9)-(line 358,col 92)",
        "(line 359,col 9)-(line 359,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 362,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 21)",
        "(line 364,col 9)-(line 364,col 21)",
        "(line 365,col 9)-(line 365,col 78)",
        "(line 366,col 9)-(line 366,col 77)",
        "(line 367,col 9)-(line 367,col 77)",
        "(line 368,col 9)-(line 368,col 90)",
        "(line 369,col 9)-(line 369,col 90)",
        "(line 370,col 9)-(line 370,col 90)",
        "(line 371,col 9)-(line 371,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 374,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 20)",
        "(line 376,col 9)-(line 376,col 20)",
        "(line 377,col 9)-(line 377,col 78)",
        "(line 378,col 9)-(line 378,col 77)",
        "(line 379,col 9)-(line 379,col 77)",
        "(line 380,col 9)-(line 380,col 94)",
        "(line 381,col 9)-(line 381,col 94)",
        "(line 382,col 9)-(line 382,col 94)",
        "(line 383,col 9)-(line 383,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 386,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 20)",
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 78)",
        "(line 390,col 9)-(line 390,col 77)",
        "(line 391,col 9)-(line 391,col 77)",
        "(line 392,col 9)-(line 392,col 89)",
        "(line 393,col 9)-(line 393,col 89)",
        "(line 394,col 9)-(line 394,col 89)",
        "(line 395,col 9)-(line 395,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 398,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 22)",
        "(line 400,col 9)-(line 400,col 22)",
        "(line 401,col 9)-(line 401,col 78)",
        "(line 402,col 9)-(line 402,col 77)",
        "(line 403,col 9)-(line 403,col 77)",
        "(line 404,col 9)-(line 404,col 91)",
        "(line 405,col 9)-(line 405,col 91)",
        "(line 406,col 9)-(line 406,col 91)",
        "(line 407,col 9)-(line 407,col 91)",
        "(line 408,col 9)-(line 408,col 94)",
        "(line 409,col 9)-(line 409,col 99)",
        "(line 410,col 9)-(line 410,col 113)",
        "(line 411,col 9)-(line 411,col 113)",
        "(line 412,col 9)-(line 412,col 85)",
        "(line 413,col 9)-(line 413,col 85)",
        "(line 414,col 9)-(line 414,col 80)",
        "(line 415,col 9)-(line 415,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 418,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 420,col 21)",
        "(line 421,col 9)-(line 421,col 78)",
        "(line 422,col 9)-(line 422,col 77)",
        "(line 423,col 9)-(line 423,col 77)",
        "(line 424,col 9)-(line 424,col 90)",
        "(line 425,col 9)-(line 425,col 90)",
        "(line 426,col 9)-(line 426,col 90)",
        "(line 427,col 9)-(line 427,col 90)",
        "(line 428,col 9)-(line 428,col 92)",
        "(line 429,col 9)-(line 429,col 97)",
        "(line 430,col 9)-(line 430,col 111)",
        "(line 431,col 9)-(line 431,col 111)",
        "(line 432,col 9)-(line 432,col 84)",
        "(line 433,col 9)-(line 433,col 84)",
        "(line 434,col 9)-(line 434,col 80)",
        "(line 435,col 9)-(line 435,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 26)",
        "(line 440,col 9)-(line 440,col 27)",
        "(line 441,col 9)-(line 441,col 78)",
        "(line 442,col 9)-(line 442,col 78)",
        "(line 443,col 9)-(line 443,col 77)",
        "(line 444,col 9)-(line 444,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 447,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 46)",
        "(line 449,col 9)-(line 449,col 36)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 46)",
        "(line 452,col 9)-(line 452,col 36)",
        "(line 453,col 9)-(line 453,col 36)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 459,col 9)-(line 459,col 82)",
        "(line 460,col 9)-(line 460,col 82)",
        "(line 461,col 9)-(line 461,col 81)",
        "(line 462,col 9)-(line 462,col 81)",
        "(line 464,col 9)-(line 464,col 36)",
        "(line 465,col 9)-(line 465,col 81)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 468,col 9)-(line 468,col 81)",
        "(line 469,col 9)-(line 469,col 104)",
        "(line 470,col 9)-(line 470,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 473,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 34)",
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 21)",
        "(line 477,col 9)-(line 477,col 34)",
        "(line 478,col 9)-(line 478,col 21)",
        "(line 479,col 9)-(line 479,col 21)",
        "(line 480,col 9)-(line 480,col 34)",
        "(line 481,col 9)-(line 481,col 21)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 483,col 9)-(line 483,col 21)",
        "(line 485,col 9)-(line 485,col 82)",
        "(line 486,col 9)-(line 486,col 82)",
        "(line 487,col 9)-(line 487,col 81)",
        "(line 488,col 9)-(line 488,col 81)",
        "(line 490,col 9)-(line 490,col 20)",
        "(line 491,col 9)-(line 491,col 81)",
        "(line 492,col 9)-(line 492,col 81)",
        "(line 494,col 9)-(line 494,col 81)",
        "(line 495,col 9)-(line 495,col 100)",
        "(line 496,col 9)-(line 496,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 499,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 32)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 32)",
        "(line 504,col 9)-(line 504,col 20)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 32)",
        "(line 507,col 9)-(line 507,col 20)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 511,col 9)-(line 511,col 82)",
        "(line 512,col 9)-(line 512,col 82)",
        "(line 513,col 9)-(line 513,col 81)",
        "(line 514,col 9)-(line 514,col 81)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 81)",
        "(line 518,col 9)-(line 518,col 81)",
        "(line 520,col 9)-(line 520,col 81)",
        "(line 521,col 9)-(line 521,col 98)",
        "(line 522,col 9)-(line 522,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 525,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 36)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 36)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 532,col 9)-(line 532,col 36)",
        "(line 533,col 9)-(line 533,col 20)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 537,col 9)-(line 537,col 82)",
        "(line 538,col 9)-(line 538,col 82)",
        "(line 539,col 9)-(line 539,col 81)",
        "(line 540,col 9)-(line 540,col 81)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 81)",
        "(line 544,col 9)-(line 544,col 81)",
        "(line 546,col 9)-(line 546,col 81)",
        "(line 547,col 9)-(line 547,col 102)",
        "(line 548,col 9)-(line 548,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 551,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 34)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 34)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 558,col 9)-(line 558,col 34)",
        "(line 559,col 9)-(line 559,col 20)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 563,col 9)-(line 563,col 82)",
        "(line 564,col 9)-(line 564,col 82)",
        "(line 565,col 9)-(line 565,col 81)",
        "(line 566,col 9)-(line 566,col 81)",
        "(line 568,col 9)-(line 568,col 20)",
        "(line 569,col 9)-(line 569,col 81)",
        "(line 570,col 9)-(line 570,col 81)",
        "(line 572,col 9)-(line 572,col 81)",
        "(line 573,col 9)-(line 573,col 100)",
        "(line 574,col 9)-(line 574,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 577,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 34)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 580,col 9)-(line 580,col 20)",
        "(line 581,col 9)-(line 581,col 34)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 584,col 9)-(line 584,col 34)",
        "(line 585,col 9)-(line 585,col 20)",
        "(line 586,col 9)-(line 586,col 20)",
        "(line 587,col 9)-(line 587,col 20)",
        "(line 589,col 9)-(line 589,col 82)",
        "(line 590,col 9)-(line 590,col 82)",
        "(line 591,col 9)-(line 591,col 81)",
        "(line 592,col 9)-(line 592,col 81)",
        "(line 594,col 9)-(line 594,col 20)",
        "(line 595,col 9)-(line 595,col 81)",
        "(line 596,col 9)-(line 596,col 81)",
        "(line 598,col 9)-(line 598,col 81)",
        "(line 599,col 9)-(line 599,col 100)",
        "(line 600,col 9)-(line 600,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 603,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 38)",
        "(line 605,col 9)-(line 605,col 20)",
        "(line 606,col 9)-(line 606,col 20)",
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 20)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 610,col 9)-(line 610,col 38)",
        "(line 611,col 9)-(line 611,col 20)",
        "(line 612,col 9)-(line 612,col 20)",
        "(line 613,col 9)-(line 613,col 20)",
        "(line 615,col 9)-(line 615,col 82)",
        "(line 616,col 9)-(line 616,col 82)",
        "(line 617,col 9)-(line 617,col 81)",
        "(line 618,col 9)-(line 618,col 81)",
        "(line 620,col 9)-(line 620,col 20)",
        "(line 621,col 9)-(line 621,col 81)",
        "(line 622,col 9)-(line 622,col 81)",
        "(line 624,col 9)-(line 624,col 81)",
        "(line 625,col 9)-(line 625,col 104)",
        "(line 626,col 9)-(line 626,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 629,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 36)",
        "(line 631,col 9)-(line 631,col 20)",
        "(line 632,col 9)-(line 632,col 20)",
        "(line 633,col 9)-(line 633,col 36)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 635,col 9)-(line 635,col 20)",
        "(line 636,col 9)-(line 636,col 36)",
        "(line 637,col 9)-(line 637,col 20)",
        "(line 638,col 9)-(line 638,col 20)",
        "(line 639,col 9)-(line 639,col 20)",
        "(line 641,col 9)-(line 641,col 82)",
        "(line 642,col 9)-(line 642,col 82)",
        "(line 643,col 9)-(line 643,col 81)",
        "(line 644,col 9)-(line 644,col 81)",
        "(line 646,col 9)-(line 646,col 20)",
        "(line 647,col 9)-(line 647,col 81)",
        "(line 648,col 9)-(line 648,col 81)",
        "(line 650,col 9)-(line 650,col 81)",
        "(line 651,col 9)-(line 651,col 102)",
        "(line 652,col 9)-(line 652,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 655,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 40)",
        "(line 657,col 9)-(line 657,col 23)",
        "(line 658,col 9)-(line 658,col 24)",
        "(line 659,col 9)-(line 659,col 40)",
        "(line 660,col 9)-(line 660,col 23)",
        "(line 661,col 9)-(line 661,col 24)",
        "(line 662,col 9)-(line 662,col 40)",
        "(line 663,col 9)-(line 663,col 23)",
        "(line 664,col 9)-(line 664,col 24)",
        "(line 665,col 9)-(line 665,col 23)",
        "(line 667,col 9)-(line 667,col 82)",
        "(line 668,col 9)-(line 668,col 82)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 670,col 81)",
        "(line 672,col 9)-(line 672,col 23)",
        "(line 673,col 9)-(line 673,col 81)",
        "(line 674,col 9)-(line 674,col 81)",
        "(line 676,col 9)-(line 676,col 81)",
        "(line 677,col 9)-(line 677,col 106)",
        "(line 678,col 9)-(line 678,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 681,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 41)",
        "(line 683,col 9)-(line 683,col 41)",
        "(line 684,col 9)-(line 684,col 41)",
        "(line 685,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 27)",
        "(line 693,col 9)-(line 693,col 27)",
        "(line 695,col 9)-(line 695,col 86)",
        "(line 696,col 9)-(line 696,col 86)",
        "(line 697,col 9)-(line 697,col 85)",
        "(line 698,col 9)-(line 698,col 85)",
        "(line 699,col 9)-(line 699,col 27)",
        "(line 700,col 9)-(line 700,col 85)",
        "(line 701,col 9)-(line 701,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 704,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 39)",
        "(line 706,col 9)-(line 706,col 39)",
        "(line 707,col 9)-(line 707,col 39)",
        "(line 708,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 27)",
        "(line 716,col 9)-(line 716,col 27)",
        "(line 718,col 9)-(line 718,col 86)",
        "(line 719,col 9)-(line 719,col 86)",
        "(line 720,col 9)-(line 720,col 85)",
        "(line 721,col 9)-(line 721,col 85)",
        "(line 722,col 9)-(line 722,col 27)",
        "(line 723,col 9)-(line 723,col 85)",
        "(line 724,col 9)-(line 724,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 727,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 43)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 43)",
        "(line 731,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 27)",
        "(line 739,col 9)-(line 739,col 27)",
        "(line 741,col 9)-(line 741,col 86)",
        "(line 742,col 9)-(line 742,col 86)",
        "(line 743,col 9)-(line 743,col 85)",
        "(line 744,col 9)-(line 744,col 85)",
        "(line 745,col 9)-(line 745,col 27)",
        "(line 746,col 9)-(line 746,col 85)",
        "(line 747,col 9)-(line 747,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 750,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 41)",
        "(line 752,col 9)-(line 752,col 41)",
        "(line 753,col 9)-(line 753,col 41)",
        "(line 754,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 27)",
        "(line 762,col 9)-(line 762,col 27)",
        "(line 764,col 9)-(line 764,col 86)",
        "(line 765,col 9)-(line 765,col 86)",
        "(line 766,col 9)-(line 766,col 85)",
        "(line 767,col 9)-(line 767,col 85)",
        "(line 768,col 9)-(line 768,col 27)",
        "(line 769,col 9)-(line 769,col 85)",
        "(line 770,col 9)-(line 770,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 773,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 41)",
        "(line 775,col 9)-(line 775,col 41)",
        "(line 776,col 9)-(line 776,col 41)",
        "(line 777,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 27)",
        "(line 785,col 9)-(line 785,col 27)",
        "(line 787,col 9)-(line 787,col 86)",
        "(line 788,col 9)-(line 788,col 86)",
        "(line 789,col 9)-(line 789,col 85)",
        "(line 790,col 9)-(line 790,col 85)",
        "(line 791,col 9)-(line 791,col 27)",
        "(line 792,col 9)-(line 792,col 85)",
        "(line 793,col 9)-(line 793,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 796,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 43)",
        "(line 798,col 9)-(line 798,col 43)",
        "(line 799,col 9)-(line 799,col 43)",
        "(line 800,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 27)",
        "(line 808,col 9)-(line 808,col 27)",
        "(line 810,col 9)-(line 810,col 86)",
        "(line 811,col 9)-(line 811,col 86)",
        "(line 812,col 9)-(line 812,col 85)",
        "(line 813,col 9)-(line 813,col 85)",
        "(line 814,col 9)-(line 814,col 27)",
        "(line 815,col 9)-(line 815,col 85)",
        "(line 816,col 9)-(line 816,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 819,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 45)",
        "(line 821,col 9)-(line 821,col 45)",
        "(line 822,col 9)-(line 822,col 45)",
        "(line 823,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 27)",
        "(line 831,col 9)-(line 831,col 27)",
        "(line 833,col 9)-(line 833,col 86)",
        "(line 834,col 9)-(line 834,col 86)",
        "(line 835,col 9)-(line 835,col 85)",
        "(line 836,col 9)-(line 836,col 85)",
        "(line 837,col 9)-(line 837,col 27)",
        "(line 838,col 9)-(line 838,col 85)",
        "(line 839,col 9)-(line 839,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 842,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 47)",
        "(line 844,col 9)-(line 844,col 47)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 29)",
        "(line 854,col 9)-(line 854,col 29)",
        "(line 856,col 9)-(line 856,col 86)",
        "(line 857,col 9)-(line 857,col 86)",
        "(line 858,col 9)-(line 858,col 85)",
        "(line 859,col 9)-(line 859,col 85)",
        "(line 860,col 9)-(line 860,col 28)",
        "(line 861,col 9)-(line 861,col 85)",
        "(line 862,col 9)-(line 862,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 865,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 40)",
        "(line 867,col 9)-(line 867,col 40)",
        "(line 868,col 9)-(line 868,col 40)",
        "(line 869,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 27)",
        "(line 880,col 9)-(line 880,col 27)",
        "(line 883,col 9)-(line 883,col 86)",
        "(line 884,col 9)-(line 884,col 86)",
        "(line 885,col 9)-(line 885,col 85)",
        "(line 886,col 9)-(line 886,col 85)",
        "(line 887,col 9)-(line 887,col 27)",
        "(line 888,col 9)-(line 888,col 85)",
        "(line 889,col 9)-(line 889,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 892,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 40)",
        "(line 894,col 9)-(line 894,col 40)",
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 36)",
        "(line 907,col 9)-(line 907,col 36)",
        "(line 908,col 9)-(line 908,col 86)",
        "(line 909,col 9)-(line 909,col 86)",
        "(line 910,col 9)-(line 910,col 85)",
        "(line 911,col 9)-(line 911,col 85)",
        "(line 912,col 9)-(line 912,col 38)",
        "(line 913,col 9)-(line 913,col 85)",
        "(line 914,col 9)-(line 914,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 917,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 48)",
        "(line 919,col 9)-(line 919,col 38)",
        "(line 920,col 9)-(line 920,col 38)",
        "(line 921,col 9)-(line 921,col 48)",
        "(line 922,col 9)-(line 922,col 38)",
        "(line 923,col 9)-(line 923,col 38)",
        "(line 924,col 9)-(line 924,col 48)",
        "(line 925,col 9)-(line 925,col 38)",
        "(line 926,col 9)-(line 926,col 38)",
        "(line 927,col 9)-(line 927,col 38)",
        "(line 929,col 9)-(line 929,col 29)",
        "(line 930,col 9)-(line 930,col 29)",
        "(line 931,col 9)-(line 931,col 29)",
        "(line 933,col 9)-(line 933,col 82)",
        "(line 934,col 9)-(line 934,col 82)",
        "(line 935,col 9)-(line 935,col 81)",
        "(line 936,col 9)-(line 936,col 81)",
        "(line 938,col 9)-(line 938,col 38)",
        "(line 939,col 9)-(line 939,col 81)",
        "(line 940,col 9)-(line 940,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 943,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 36)",
        "(line 945,col 9)-(line 945,col 23)",
        "(line 946,col 9)-(line 946,col 23)",
        "(line 947,col 9)-(line 947,col 36)",
        "(line 948,col 9)-(line 948,col 23)",
        "(line 949,col 9)-(line 949,col 23)",
        "(line 950,col 9)-(line 950,col 36)",
        "(line 951,col 9)-(line 951,col 23)",
        "(line 952,col 9)-(line 952,col 23)",
        "(line 953,col 9)-(line 953,col 23)",
        "(line 954,col 9)-(line 954,col 29)",
        "(line 955,col 9)-(line 955,col 29)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 82)",
        "(line 958,col 9)-(line 958,col 82)",
        "(line 959,col 9)-(line 959,col 81)",
        "(line 960,col 9)-(line 960,col 81)",
        "(line 962,col 9)-(line 962,col 22)",
        "(line 963,col 9)-(line 963,col 81)",
        "(line 964,col 9)-(line 964,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 967,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 34)",
        "(line 969,col 9)-(line 969,col 22)",
        "(line 970,col 9)-(line 970,col 22)",
        "(line 971,col 9)-(line 971,col 34)",
        "(line 972,col 9)-(line 972,col 22)",
        "(line 973,col 9)-(line 973,col 22)",
        "(line 974,col 9)-(line 974,col 34)",
        "(line 975,col 9)-(line 975,col 22)",
        "(line 976,col 9)-(line 976,col 22)",
        "(line 977,col 9)-(line 977,col 22)",
        "(line 978,col 9)-(line 978,col 29)",
        "(line 979,col 9)-(line 979,col 29)",
        "(line 980,col 9)-(line 980,col 29)",
        "(line 981,col 9)-(line 981,col 82)",
        "(line 982,col 9)-(line 982,col 82)",
        "(line 983,col 9)-(line 983,col 81)",
        "(line 984,col 9)-(line 984,col 81)",
        "(line 986,col 9)-(line 986,col 22)",
        "(line 987,col 9)-(line 987,col 81)",
        "(line 988,col 9)-(line 988,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 991,
      "end_line": 1013,
      "comment": "",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 38)",
        "(line 993,col 9)-(line 993,col 22)",
        "(line 994,col 9)-(line 994,col 22)",
        "(line 995,col 9)-(line 995,col 38)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 22)",
        "(line 998,col 9)-(line 998,col 38)",
        "(line 999,col 9)-(line 999,col 22)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 29)",
        "(line 1003,col 9)-(line 1003,col 29)",
        "(line 1004,col 9)-(line 1004,col 29)",
        "(line 1005,col 9)-(line 1005,col 82)",
        "(line 1006,col 9)-(line 1006,col 82)",
        "(line 1007,col 9)-(line 1007,col 81)",
        "(line 1008,col 9)-(line 1008,col 81)",
        "(line 1010,col 9)-(line 1010,col 22)",
        "(line 1011,col 9)-(line 1011,col 81)",
        "(line 1012,col 9)-(line 1012,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1015,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 36)",
        "(line 1017,col 9)-(line 1017,col 22)",
        "(line 1018,col 9)-(line 1018,col 22)",
        "(line 1019,col 9)-(line 1019,col 36)",
        "(line 1020,col 9)-(line 1020,col 22)",
        "(line 1021,col 9)-(line 1021,col 22)",
        "(line 1022,col 9)-(line 1022,col 36)",
        "(line 1023,col 9)-(line 1023,col 22)",
        "(line 1024,col 9)-(line 1024,col 22)",
        "(line 1025,col 9)-(line 1025,col 22)",
        "(line 1026,col 9)-(line 1026,col 29)",
        "(line 1027,col 9)-(line 1027,col 29)",
        "(line 1028,col 9)-(line 1028,col 29)",
        "(line 1029,col 9)-(line 1029,col 82)",
        "(line 1030,col 9)-(line 1030,col 82)",
        "(line 1031,col 9)-(line 1031,col 81)",
        "(line 1032,col 9)-(line 1032,col 81)",
        "(line 1034,col 9)-(line 1034,col 22)",
        "(line 1035,col 9)-(line 1035,col 81)",
        "(line 1036,col 9)-(line 1036,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1039,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 36)",
        "(line 1041,col 9)-(line 1041,col 22)",
        "(line 1042,col 9)-(line 1042,col 22)",
        "(line 1043,col 9)-(line 1043,col 36)",
        "(line 1044,col 9)-(line 1044,col 22)",
        "(line 1045,col 9)-(line 1045,col 22)",
        "(line 1046,col 9)-(line 1046,col 36)",
        "(line 1047,col 9)-(line 1047,col 22)",
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 22)",
        "(line 1050,col 9)-(line 1050,col 29)",
        "(line 1051,col 9)-(line 1051,col 29)",
        "(line 1052,col 9)-(line 1052,col 29)",
        "(line 1053,col 9)-(line 1053,col 82)",
        "(line 1054,col 9)-(line 1054,col 82)",
        "(line 1055,col 9)-(line 1055,col 81)",
        "(line 1056,col 9)-(line 1056,col 81)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 81)",
        "(line 1060,col 9)-(line 1060,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1063,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 40)",
        "(line 1065,col 9)-(line 1065,col 22)",
        "(line 1066,col 9)-(line 1066,col 22)",
        "(line 1067,col 9)-(line 1067,col 40)",
        "(line 1068,col 9)-(line 1068,col 22)",
        "(line 1069,col 9)-(line 1069,col 22)",
        "(line 1070,col 9)-(line 1070,col 40)",
        "(line 1071,col 9)-(line 1071,col 22)",
        "(line 1072,col 9)-(line 1072,col 22)",
        "(line 1073,col 9)-(line 1073,col 22)",
        "(line 1074,col 9)-(line 1074,col 29)",
        "(line 1075,col 9)-(line 1075,col 29)",
        "(line 1076,col 9)-(line 1076,col 29)",
        "(line 1077,col 9)-(line 1077,col 82)",
        "(line 1078,col 9)-(line 1078,col 82)",
        "(line 1079,col 9)-(line 1079,col 81)",
        "(line 1080,col 9)-(line 1080,col 81)",
        "(line 1082,col 9)-(line 1082,col 22)",
        "(line 1083,col 9)-(line 1083,col 81)",
        "(line 1084,col 9)-(line 1084,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1087,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 38)",
        "(line 1089,col 9)-(line 1089,col 22)",
        "(line 1090,col 9)-(line 1090,col 22)",
        "(line 1091,col 9)-(line 1091,col 38)",
        "(line 1092,col 9)-(line 1092,col 22)",
        "(line 1093,col 9)-(line 1093,col 22)",
        "(line 1094,col 9)-(line 1094,col 38)",
        "(line 1095,col 9)-(line 1095,col 22)",
        "(line 1096,col 9)-(line 1096,col 22)",
        "(line 1097,col 9)-(line 1097,col 22)",
        "(line 1098,col 9)-(line 1098,col 29)",
        "(line 1099,col 9)-(line 1099,col 29)",
        "(line 1100,col 9)-(line 1100,col 29)",
        "(line 1101,col 9)-(line 1101,col 82)",
        "(line 1102,col 9)-(line 1102,col 82)",
        "(line 1103,col 9)-(line 1103,col 81)",
        "(line 1104,col 9)-(line 1104,col 81)",
        "(line 1106,col 9)-(line 1106,col 22)",
        "(line 1107,col 9)-(line 1107,col 81)",
        "(line 1108,col 9)-(line 1108,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1111,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 42)",
        "(line 1113,col 9)-(line 1113,col 25)",
        "(line 1114,col 9)-(line 1114,col 26)",
        "(line 1115,col 9)-(line 1115,col 42)",
        "(line 1116,col 9)-(line 1116,col 25)",
        "(line 1117,col 9)-(line 1117,col 26)",
        "(line 1118,col 9)-(line 1118,col 42)",
        "(line 1119,col 9)-(line 1119,col 25)",
        "(line 1120,col 9)-(line 1120,col 26)",
        "(line 1121,col 9)-(line 1121,col 25)",
        "(line 1122,col 9)-(line 1122,col 29)",
        "(line 1123,col 9)-(line 1123,col 29)",
        "(line 1124,col 9)-(line 1124,col 29)",
        "(line 1125,col 9)-(line 1125,col 82)",
        "(line 1126,col 9)-(line 1126,col 82)",
        "(line 1127,col 9)-(line 1127,col 81)",
        "(line 1128,col 9)-(line 1128,col 81)",
        "(line 1130,col 9)-(line 1130,col 25)",
        "(line 1131,col 9)-(line 1131,col 81)",
        "(line 1132,col 9)-(line 1132,col 81)"
      ]
    }
  ]
}