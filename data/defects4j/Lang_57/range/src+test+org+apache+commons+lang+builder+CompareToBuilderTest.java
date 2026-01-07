{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1131,
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
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.tearDown()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 58,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 63,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 66,col 13)",
        "(line 67,col 13)-(line 69,col 13)",
        "(line 70,col 13)-(line 70,col 44)",
        "(line 71,col 13)-(line 71,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject.compareTo(java.lang.Object)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 44)",
        "(line 83,col 13)-(line 83,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 87,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 21)",
        "(line 94,col 13)-(line 94,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 99,col 13)",
        "(line 100,col 13)-(line 102,col 13)",
        "(line 103,col 13)-(line 103,col 50)",
        "(line 104,col 13)-(line 104,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 108,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 21)",
        "(line 112,col 13)-(line 112,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 19)",
        "(line 122,col 9)-(line 122,col 67)",
        "(line 123,col 9)-(line 123,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 126,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 149,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 60)",
        "(line 153,col 9)-(line 153,col 24)",
        "(line 154,col 9)-(line 154,col 24)",
        "(line 155,col 9)-(line 155,col 24)",
        "(line 157,col 9)-(line 157,col 36)",
        "(line 158,col 9)-(line 158,col 36)",
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 160,col 60)",
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 36)",
        "(line 165,col 9)-(line 165,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 168,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 51)",
        "(line 171,col 9)-(line 171,col 33)",
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 45)",
        "(line 177,col 9)-(line 177,col 45)",
        "(line 178,col 9)-(line 178,col 51)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 45)",
        "(line 182,col 9)-(line 182,col 45)",
        "(line 183,col 9)-(line 183,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 186,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 103)",
        "(line 188,col 9)-(line 188,col 103)",
        "(line 189,col 9)-(line 189,col 103)",
        "(line 191,col 9)-(line 191,col 102)",
        "(line 192,col 9)-(line 192,col 102)",
        "(line 193,col 9)-(line 193,col 102)",
        "(line 195,col 9)-(line 195,col 102)",
        "(line 196,col 9)-(line 196,col 102)",
        "(line 197,col 9)-(line 197,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 200,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 43)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 43)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 205,col 53)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 208,col 9)-(line 208,col 77)",
        "(line 209,col 9)-(line 209,col 77)",
        "(line 210,col 9)-(line 210,col 80)",
        "(line 211,col 9)-(line 211,col 80)",
        "(line 212,col 9)-(line 212,col 77)",
        "(line 214,col 9)-(line 214,col 107)",
        "(line 215,col 9)-(line 215,col 107)",
        "(line 218,col 9)-(line 218,col 57)",
        "(line 220,col 9)-(line 220,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 232,
      "end_line": 250,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 146)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 249,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 266,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 93)",
        "(line 270,col 9)-(line 270,col 92)",
        "(line 271,col 9)-(line 271,col 92)",
        "(line 273,col 9)-(line 273,col 93)",
        "(line 274,col 9)-(line 274,col 93)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 277,col 9)-(line 277,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObject()",
      "begin_line": 280,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 78)",
        "(line 284,col 9)-(line 284,col 78)",
        "(line 285,col 9)-(line 285,col 19)",
        "(line 286,col 9)-(line 286,col 77)",
        "(line 287,col 9)-(line 287,col 77)",
        "(line 289,col 9)-(line 289,col 79)",
        "(line 290,col 9)-(line 290,col 100)",
        "(line 291,col 9)-(line 291,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 294,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 33)",
        "(line 297,col 9)-(line 300,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 303,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 109)",
        "(line 307,col 9)-(line 307,col 109)",
        "(line 308,col 9)-(line 308,col 20)",
        "(line 309,col 9)-(line 309,col 109)",
        "(line 310,col 9)-(line 310,col 109)",
        "(line 311,col 9)-(line 311,col 21)",
        "(line 312,col 9)-(line 312,col 108)",
        "(line 313,col 9)-(line 313,col 108)",
        "(line 315,col 9)-(line 315,col 110)",
        "(line 316,col 9)-(line 316,col 131)",
        "(line 317,col 9)-(line 317,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 320,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 27)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 323,col 84)",
        "(line 324,col 9)-(line 324,col 84)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 83)",
        "(line 327,col 9)-(line 327,col 83)",
        "(line 329,col 9)-(line 329,col 85)",
        "(line 330,col 9)-(line 330,col 106)",
        "(line 331,col 9)-(line 331,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLong()",
      "begin_line": 334,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 21)",
        "(line 336,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 337,col 78)",
        "(line 338,col 9)-(line 338,col 77)",
        "(line 339,col 9)-(line 339,col 77)",
        "(line 340,col 9)-(line 340,col 89)",
        "(line 341,col 9)-(line 341,col 89)",
        "(line 342,col 9)-(line 342,col 89)",
        "(line 343,col 9)-(line 343,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testInt()",
      "begin_line": 346,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 348,col 19)",
        "(line 349,col 9)-(line 349,col 78)",
        "(line 350,col 9)-(line 350,col 77)",
        "(line 351,col 9)-(line 351,col 77)",
        "(line 352,col 9)-(line 352,col 92)",
        "(line 353,col 9)-(line 353,col 92)",
        "(line 354,col 9)-(line 354,col 92)",
        "(line 355,col 9)-(line 355,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShort()",
      "begin_line": 358,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 21)",
        "(line 360,col 9)-(line 360,col 21)",
        "(line 361,col 9)-(line 361,col 78)",
        "(line 362,col 9)-(line 362,col 77)",
        "(line 363,col 9)-(line 363,col 77)",
        "(line 364,col 9)-(line 364,col 90)",
        "(line 365,col 9)-(line 365,col 90)",
        "(line 366,col 9)-(line 366,col 90)",
        "(line 367,col 9)-(line 367,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testChar()",
      "begin_line": 370,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 20)",
        "(line 372,col 9)-(line 372,col 20)",
        "(line 373,col 9)-(line 373,col 78)",
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 375,col 77)",
        "(line 376,col 9)-(line 376,col 94)",
        "(line 377,col 9)-(line 377,col 94)",
        "(line 378,col 9)-(line 378,col 94)",
        "(line 379,col 9)-(line 379,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByte()",
      "begin_line": 382,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 20)",
        "(line 384,col 9)-(line 384,col 20)",
        "(line 385,col 9)-(line 385,col 78)",
        "(line 386,col 9)-(line 386,col 77)",
        "(line 387,col 9)-(line 387,col 77)",
        "(line 388,col 9)-(line 388,col 89)",
        "(line 389,col 9)-(line 389,col 89)",
        "(line 390,col 9)-(line 390,col 89)",
        "(line 391,col 9)-(line 391,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 394,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 22)",
        "(line 396,col 9)-(line 396,col 22)",
        "(line 397,col 9)-(line 397,col 78)",
        "(line 398,col 9)-(line 398,col 77)",
        "(line 399,col 9)-(line 399,col 77)",
        "(line 400,col 9)-(line 400,col 91)",
        "(line 401,col 9)-(line 401,col 91)",
        "(line 402,col 9)-(line 402,col 91)",
        "(line 403,col 9)-(line 403,col 91)",
        "(line 404,col 9)-(line 404,col 94)",
        "(line 405,col 9)-(line 405,col 99)",
        "(line 406,col 9)-(line 406,col 113)",
        "(line 407,col 9)-(line 407,col 113)",
        "(line 408,col 9)-(line 408,col 85)",
        "(line 409,col 9)-(line 409,col 85)",
        "(line 410,col 9)-(line 410,col 80)",
        "(line 411,col 9)-(line 411,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 414,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 21)",
        "(line 416,col 9)-(line 416,col 21)",
        "(line 417,col 9)-(line 417,col 78)",
        "(line 418,col 9)-(line 418,col 77)",
        "(line 419,col 9)-(line 419,col 77)",
        "(line 420,col 9)-(line 420,col 90)",
        "(line 421,col 9)-(line 421,col 90)",
        "(line 422,col 9)-(line 422,col 90)",
        "(line 423,col 9)-(line 423,col 90)",
        "(line 424,col 9)-(line 424,col 92)",
        "(line 425,col 9)-(line 425,col 97)",
        "(line 426,col 9)-(line 426,col 111)",
        "(line 427,col 9)-(line 427,col 111)",
        "(line 428,col 9)-(line 428,col 84)",
        "(line 429,col 9)-(line 429,col 84)",
        "(line 430,col 9)-(line 430,col 80)",
        "(line 431,col 9)-(line 431,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 434,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 26)",
        "(line 436,col 9)-(line 436,col 27)",
        "(line 437,col 9)-(line 437,col 78)",
        "(line 438,col 9)-(line 438,col 78)",
        "(line 439,col 9)-(line 439,col 77)",
        "(line 440,col 9)-(line 440,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 443,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 46)",
        "(line 445,col 9)-(line 445,col 36)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 46)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 36)",
        "(line 450,col 9)-(line 450,col 46)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 36)",
        "(line 453,col 9)-(line 453,col 36)",
        "(line 455,col 9)-(line 455,col 82)",
        "(line 456,col 9)-(line 456,col 82)",
        "(line 457,col 9)-(line 457,col 81)",
        "(line 458,col 9)-(line 458,col 81)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 81)",
        "(line 462,col 9)-(line 462,col 81)",
        "(line 464,col 9)-(line 464,col 81)",
        "(line 465,col 9)-(line 465,col 104)",
        "(line 466,col 9)-(line 466,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 469,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 34)",
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 21)",
        "(line 473,col 9)-(line 473,col 34)",
        "(line 474,col 9)-(line 474,col 21)",
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 34)",
        "(line 477,col 9)-(line 477,col 21)",
        "(line 478,col 9)-(line 478,col 21)",
        "(line 479,col 9)-(line 479,col 21)",
        "(line 481,col 9)-(line 481,col 82)",
        "(line 482,col 9)-(line 482,col 82)",
        "(line 483,col 9)-(line 483,col 81)",
        "(line 484,col 9)-(line 484,col 81)",
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 81)",
        "(line 488,col 9)-(line 488,col 81)",
        "(line 490,col 9)-(line 490,col 81)",
        "(line 491,col 9)-(line 491,col 100)",
        "(line 492,col 9)-(line 492,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 495,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 32)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 32)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 502,col 9)-(line 502,col 32)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 20)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 507,col 9)-(line 507,col 82)",
        "(line 508,col 9)-(line 508,col 82)",
        "(line 509,col 9)-(line 509,col 81)",
        "(line 510,col 9)-(line 510,col 81)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 81)",
        "(line 514,col 9)-(line 514,col 81)",
        "(line 516,col 9)-(line 516,col 81)",
        "(line 517,col 9)-(line 517,col 98)",
        "(line 518,col 9)-(line 518,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 521,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 36)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 36)",
        "(line 526,col 9)-(line 526,col 20)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 36)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 533,col 9)-(line 533,col 82)",
        "(line 534,col 9)-(line 534,col 82)",
        "(line 535,col 9)-(line 535,col 81)",
        "(line 536,col 9)-(line 536,col 81)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 81)",
        "(line 540,col 9)-(line 540,col 81)",
        "(line 542,col 9)-(line 542,col 81)",
        "(line 543,col 9)-(line 543,col 102)",
        "(line 544,col 9)-(line 544,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 547,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 34)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 34)",
        "(line 552,col 9)-(line 552,col 20)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 554,col 9)-(line 554,col 34)",
        "(line 555,col 9)-(line 555,col 20)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 559,col 9)-(line 559,col 82)",
        "(line 560,col 9)-(line 560,col 82)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 562,col 9)-(line 562,col 81)",
        "(line 564,col 9)-(line 564,col 20)",
        "(line 565,col 9)-(line 565,col 81)",
        "(line 566,col 9)-(line 566,col 81)",
        "(line 568,col 9)-(line 568,col 81)",
        "(line 569,col 9)-(line 569,col 100)",
        "(line 570,col 9)-(line 570,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 573,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 34)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 577,col 9)-(line 577,col 34)",
        "(line 578,col 9)-(line 578,col 20)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 580,col 9)-(line 580,col 34)",
        "(line 581,col 9)-(line 581,col 20)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 585,col 9)-(line 585,col 82)",
        "(line 586,col 9)-(line 586,col 82)",
        "(line 587,col 9)-(line 587,col 81)",
        "(line 588,col 9)-(line 588,col 81)",
        "(line 590,col 9)-(line 590,col 20)",
        "(line 591,col 9)-(line 591,col 81)",
        "(line 592,col 9)-(line 592,col 81)",
        "(line 594,col 9)-(line 594,col 81)",
        "(line 595,col 9)-(line 595,col 100)",
        "(line 596,col 9)-(line 596,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 599,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 38)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 20)",
        "(line 603,col 9)-(line 603,col 38)",
        "(line 604,col 9)-(line 604,col 20)",
        "(line 605,col 9)-(line 605,col 20)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 20)",
        "(line 608,col 9)-(line 608,col 20)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 611,col 9)-(line 611,col 82)",
        "(line 612,col 9)-(line 612,col 82)",
        "(line 613,col 9)-(line 613,col 81)",
        "(line 614,col 9)-(line 614,col 81)",
        "(line 616,col 9)-(line 616,col 20)",
        "(line 617,col 9)-(line 617,col 81)",
        "(line 618,col 9)-(line 618,col 81)",
        "(line 620,col 9)-(line 620,col 81)",
        "(line 621,col 9)-(line 621,col 104)",
        "(line 622,col 9)-(line 622,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 625,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 36)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 20)",
        "(line 629,col 9)-(line 629,col 36)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 631,col 9)-(line 631,col 20)",
        "(line 632,col 9)-(line 632,col 36)",
        "(line 633,col 9)-(line 633,col 20)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 635,col 9)-(line 635,col 20)",
        "(line 637,col 9)-(line 637,col 82)",
        "(line 638,col 9)-(line 638,col 82)",
        "(line 639,col 9)-(line 639,col 81)",
        "(line 640,col 9)-(line 640,col 81)",
        "(line 642,col 9)-(line 642,col 20)",
        "(line 643,col 9)-(line 643,col 81)",
        "(line 644,col 9)-(line 644,col 81)",
        "(line 646,col 9)-(line 646,col 81)",
        "(line 647,col 9)-(line 647,col 102)",
        "(line 648,col 9)-(line 648,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 651,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 40)",
        "(line 653,col 9)-(line 653,col 23)",
        "(line 654,col 9)-(line 654,col 24)",
        "(line 655,col 9)-(line 655,col 40)",
        "(line 656,col 9)-(line 656,col 23)",
        "(line 657,col 9)-(line 657,col 24)",
        "(line 658,col 9)-(line 658,col 40)",
        "(line 659,col 9)-(line 659,col 23)",
        "(line 660,col 9)-(line 660,col 24)",
        "(line 661,col 9)-(line 661,col 23)",
        "(line 663,col 9)-(line 663,col 82)",
        "(line 664,col 9)-(line 664,col 82)",
        "(line 665,col 9)-(line 665,col 81)",
        "(line 666,col 9)-(line 666,col 81)",
        "(line 668,col 9)-(line 668,col 23)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 670,col 81)",
        "(line 672,col 9)-(line 672,col 81)",
        "(line 673,col 9)-(line 673,col 106)",
        "(line 674,col 9)-(line 674,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 677,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 41)",
        "(line 679,col 9)-(line 679,col 41)",
        "(line 680,col 9)-(line 680,col 41)",
        "(line 681,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 27)",
        "(line 689,col 9)-(line 689,col 27)",
        "(line 691,col 9)-(line 691,col 86)",
        "(line 692,col 9)-(line 692,col 86)",
        "(line 693,col 9)-(line 693,col 85)",
        "(line 694,col 9)-(line 694,col 85)",
        "(line 695,col 9)-(line 695,col 27)",
        "(line 696,col 9)-(line 696,col 85)",
        "(line 697,col 9)-(line 697,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 700,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 39)",
        "(line 702,col 9)-(line 702,col 39)",
        "(line 703,col 9)-(line 703,col 39)",
        "(line 704,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 27)",
        "(line 712,col 9)-(line 712,col 27)",
        "(line 714,col 9)-(line 714,col 86)",
        "(line 715,col 9)-(line 715,col 86)",
        "(line 716,col 9)-(line 716,col 85)",
        "(line 717,col 9)-(line 717,col 85)",
        "(line 718,col 9)-(line 718,col 27)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 723,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 43)",
        "(line 725,col 9)-(line 725,col 43)",
        "(line 726,col 9)-(line 726,col 43)",
        "(line 727,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 27)",
        "(line 735,col 9)-(line 735,col 27)",
        "(line 737,col 9)-(line 737,col 86)",
        "(line 738,col 9)-(line 738,col 86)",
        "(line 739,col 9)-(line 739,col 85)",
        "(line 740,col 9)-(line 740,col 85)",
        "(line 741,col 9)-(line 741,col 27)",
        "(line 742,col 9)-(line 742,col 85)",
        "(line 743,col 9)-(line 743,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 746,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 41)",
        "(line 748,col 9)-(line 748,col 41)",
        "(line 749,col 9)-(line 749,col 41)",
        "(line 750,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 27)",
        "(line 758,col 9)-(line 758,col 27)",
        "(line 760,col 9)-(line 760,col 86)",
        "(line 761,col 9)-(line 761,col 86)",
        "(line 762,col 9)-(line 762,col 85)",
        "(line 763,col 9)-(line 763,col 85)",
        "(line 764,col 9)-(line 764,col 27)",
        "(line 765,col 9)-(line 765,col 85)",
        "(line 766,col 9)-(line 766,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 769,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 41)",
        "(line 771,col 9)-(line 771,col 41)",
        "(line 772,col 9)-(line 772,col 41)",
        "(line 773,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 27)",
        "(line 781,col 9)-(line 781,col 27)",
        "(line 783,col 9)-(line 783,col 86)",
        "(line 784,col 9)-(line 784,col 86)",
        "(line 785,col 9)-(line 785,col 85)",
        "(line 786,col 9)-(line 786,col 85)",
        "(line 787,col 9)-(line 787,col 27)",
        "(line 788,col 9)-(line 788,col 85)",
        "(line 789,col 9)-(line 789,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 792,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 43)",
        "(line 794,col 9)-(line 794,col 43)",
        "(line 795,col 9)-(line 795,col 43)",
        "(line 796,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 27)",
        "(line 804,col 9)-(line 804,col 27)",
        "(line 806,col 9)-(line 806,col 86)",
        "(line 807,col 9)-(line 807,col 86)",
        "(line 808,col 9)-(line 808,col 85)",
        "(line 809,col 9)-(line 809,col 85)",
        "(line 810,col 9)-(line 810,col 27)",
        "(line 811,col 9)-(line 811,col 85)",
        "(line 812,col 9)-(line 812,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 815,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 45)",
        "(line 819,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 27)",
        "(line 827,col 9)-(line 827,col 27)",
        "(line 829,col 9)-(line 829,col 86)",
        "(line 830,col 9)-(line 830,col 86)",
        "(line 831,col 9)-(line 831,col 85)",
        "(line 832,col 9)-(line 832,col 85)",
        "(line 833,col 9)-(line 833,col 27)",
        "(line 834,col 9)-(line 834,col 85)",
        "(line 835,col 9)-(line 835,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 838,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 47)",
        "(line 840,col 9)-(line 840,col 47)",
        "(line 841,col 9)-(line 841,col 47)",
        "(line 842,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 29)",
        "(line 850,col 9)-(line 850,col 29)",
        "(line 852,col 9)-(line 852,col 86)",
        "(line 853,col 9)-(line 853,col 86)",
        "(line 854,col 9)-(line 854,col 85)",
        "(line 855,col 9)-(line 855,col 85)",
        "(line 856,col 9)-(line 856,col 28)",
        "(line 857,col 9)-(line 857,col 85)",
        "(line 858,col 9)-(line 858,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 861,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 40)",
        "(line 863,col 9)-(line 863,col 40)",
        "(line 864,col 9)-(line 864,col 40)",
        "(line 865,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 27)",
        "(line 876,col 9)-(line 876,col 27)",
        "(line 879,col 9)-(line 879,col 86)",
        "(line 880,col 9)-(line 880,col 86)",
        "(line 881,col 9)-(line 881,col 85)",
        "(line 882,col 9)-(line 882,col 85)",
        "(line 883,col 9)-(line 883,col 27)",
        "(line 884,col 9)-(line 884,col 85)",
        "(line 885,col 9)-(line 885,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 888,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 890,col 40)",
        "(line 891,col 9)-(line 891,col 40)",
        "(line 892,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 902,col 36)",
        "(line 903,col 9)-(line 903,col 36)",
        "(line 904,col 9)-(line 904,col 86)",
        "(line 905,col 9)-(line 905,col 86)",
        "(line 906,col 9)-(line 906,col 85)",
        "(line 907,col 9)-(line 907,col 85)",
        "(line 908,col 9)-(line 908,col 38)",
        "(line 909,col 9)-(line 909,col 85)",
        "(line 910,col 9)-(line 910,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 913,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 48)",
        "(line 915,col 9)-(line 915,col 38)",
        "(line 916,col 9)-(line 916,col 38)",
        "(line 917,col 9)-(line 917,col 48)",
        "(line 918,col 9)-(line 918,col 38)",
        "(line 919,col 9)-(line 919,col 38)",
        "(line 920,col 9)-(line 920,col 48)",
        "(line 921,col 9)-(line 921,col 38)",
        "(line 922,col 9)-(line 922,col 38)",
        "(line 923,col 9)-(line 923,col 38)",
        "(line 925,col 9)-(line 925,col 29)",
        "(line 926,col 9)-(line 926,col 29)",
        "(line 927,col 9)-(line 927,col 29)",
        "(line 929,col 9)-(line 929,col 82)",
        "(line 930,col 9)-(line 930,col 82)",
        "(line 931,col 9)-(line 931,col 81)",
        "(line 932,col 9)-(line 932,col 81)",
        "(line 934,col 9)-(line 934,col 38)",
        "(line 935,col 9)-(line 935,col 81)",
        "(line 936,col 9)-(line 936,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 939,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 36)",
        "(line 941,col 9)-(line 941,col 23)",
        "(line 942,col 9)-(line 942,col 23)",
        "(line 943,col 9)-(line 943,col 36)",
        "(line 944,col 9)-(line 944,col 23)",
        "(line 945,col 9)-(line 945,col 23)",
        "(line 946,col 9)-(line 946,col 36)",
        "(line 947,col 9)-(line 947,col 23)",
        "(line 948,col 9)-(line 948,col 23)",
        "(line 949,col 9)-(line 949,col 23)",
        "(line 950,col 9)-(line 950,col 29)",
        "(line 951,col 9)-(line 951,col 29)",
        "(line 952,col 9)-(line 952,col 29)",
        "(line 953,col 9)-(line 953,col 82)",
        "(line 954,col 9)-(line 954,col 82)",
        "(line 955,col 9)-(line 955,col 81)",
        "(line 956,col 9)-(line 956,col 81)",
        "(line 958,col 9)-(line 958,col 22)",
        "(line 959,col 9)-(line 959,col 81)",
        "(line 960,col 9)-(line 960,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 963,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 34)",
        "(line 965,col 9)-(line 965,col 22)",
        "(line 966,col 9)-(line 966,col 22)",
        "(line 967,col 9)-(line 967,col 34)",
        "(line 968,col 9)-(line 968,col 22)",
        "(line 969,col 9)-(line 969,col 22)",
        "(line 970,col 9)-(line 970,col 34)",
        "(line 971,col 9)-(line 971,col 22)",
        "(line 972,col 9)-(line 972,col 22)",
        "(line 973,col 9)-(line 973,col 22)",
        "(line 974,col 9)-(line 974,col 29)",
        "(line 975,col 9)-(line 975,col 29)",
        "(line 976,col 9)-(line 976,col 29)",
        "(line 977,col 9)-(line 977,col 82)",
        "(line 978,col 9)-(line 978,col 82)",
        "(line 979,col 9)-(line 979,col 81)",
        "(line 980,col 9)-(line 980,col 81)",
        "(line 982,col 9)-(line 982,col 22)",
        "(line 983,col 9)-(line 983,col 81)",
        "(line 984,col 9)-(line 984,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 987,
      "end_line": 1009,
      "comment": "",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 38)",
        "(line 989,col 9)-(line 989,col 22)",
        "(line 990,col 9)-(line 990,col 22)",
        "(line 991,col 9)-(line 991,col 38)",
        "(line 992,col 9)-(line 992,col 22)",
        "(line 993,col 9)-(line 993,col 22)",
        "(line 994,col 9)-(line 994,col 38)",
        "(line 995,col 9)-(line 995,col 22)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 22)",
        "(line 998,col 9)-(line 998,col 29)",
        "(line 999,col 9)-(line 999,col 29)",
        "(line 1000,col 9)-(line 1000,col 29)",
        "(line 1001,col 9)-(line 1001,col 82)",
        "(line 1002,col 9)-(line 1002,col 82)",
        "(line 1003,col 9)-(line 1003,col 81)",
        "(line 1004,col 9)-(line 1004,col 81)",
        "(line 1006,col 9)-(line 1006,col 22)",
        "(line 1007,col 9)-(line 1007,col 81)",
        "(line 1008,col 9)-(line 1008,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1011,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 36)",
        "(line 1013,col 9)-(line 1013,col 22)",
        "(line 1014,col 9)-(line 1014,col 22)",
        "(line 1015,col 9)-(line 1015,col 36)",
        "(line 1016,col 9)-(line 1016,col 22)",
        "(line 1017,col 9)-(line 1017,col 22)",
        "(line 1018,col 9)-(line 1018,col 36)",
        "(line 1019,col 9)-(line 1019,col 22)",
        "(line 1020,col 9)-(line 1020,col 22)",
        "(line 1021,col 9)-(line 1021,col 22)",
        "(line 1022,col 9)-(line 1022,col 29)",
        "(line 1023,col 9)-(line 1023,col 29)",
        "(line 1024,col 9)-(line 1024,col 29)",
        "(line 1025,col 9)-(line 1025,col 82)",
        "(line 1026,col 9)-(line 1026,col 82)",
        "(line 1027,col 9)-(line 1027,col 81)",
        "(line 1028,col 9)-(line 1028,col 81)",
        "(line 1030,col 9)-(line 1030,col 22)",
        "(line 1031,col 9)-(line 1031,col 81)",
        "(line 1032,col 9)-(line 1032,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1035,
      "end_line": 1057,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 36)",
        "(line 1037,col 9)-(line 1037,col 22)",
        "(line 1038,col 9)-(line 1038,col 22)",
        "(line 1039,col 9)-(line 1039,col 36)",
        "(line 1040,col 9)-(line 1040,col 22)",
        "(line 1041,col 9)-(line 1041,col 22)",
        "(line 1042,col 9)-(line 1042,col 36)",
        "(line 1043,col 9)-(line 1043,col 22)",
        "(line 1044,col 9)-(line 1044,col 22)",
        "(line 1045,col 9)-(line 1045,col 22)",
        "(line 1046,col 9)-(line 1046,col 29)",
        "(line 1047,col 9)-(line 1047,col 29)",
        "(line 1048,col 9)-(line 1048,col 29)",
        "(line 1049,col 9)-(line 1049,col 82)",
        "(line 1050,col 9)-(line 1050,col 82)",
        "(line 1051,col 9)-(line 1051,col 81)",
        "(line 1052,col 9)-(line 1052,col 81)",
        "(line 1054,col 9)-(line 1054,col 22)",
        "(line 1055,col 9)-(line 1055,col 81)",
        "(line 1056,col 9)-(line 1056,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1059,
      "end_line": 1081,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 40)",
        "(line 1061,col 9)-(line 1061,col 22)",
        "(line 1062,col 9)-(line 1062,col 22)",
        "(line 1063,col 9)-(line 1063,col 40)",
        "(line 1064,col 9)-(line 1064,col 22)",
        "(line 1065,col 9)-(line 1065,col 22)",
        "(line 1066,col 9)-(line 1066,col 40)",
        "(line 1067,col 9)-(line 1067,col 22)",
        "(line 1068,col 9)-(line 1068,col 22)",
        "(line 1069,col 9)-(line 1069,col 22)",
        "(line 1070,col 9)-(line 1070,col 29)",
        "(line 1071,col 9)-(line 1071,col 29)",
        "(line 1072,col 9)-(line 1072,col 29)",
        "(line 1073,col 9)-(line 1073,col 82)",
        "(line 1074,col 9)-(line 1074,col 82)",
        "(line 1075,col 9)-(line 1075,col 81)",
        "(line 1076,col 9)-(line 1076,col 81)",
        "(line 1078,col 9)-(line 1078,col 22)",
        "(line 1079,col 9)-(line 1079,col 81)",
        "(line 1080,col 9)-(line 1080,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1083,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 38)",
        "(line 1085,col 9)-(line 1085,col 22)",
        "(line 1086,col 9)-(line 1086,col 22)",
        "(line 1087,col 9)-(line 1087,col 38)",
        "(line 1088,col 9)-(line 1088,col 22)",
        "(line 1089,col 9)-(line 1089,col 22)",
        "(line 1090,col 9)-(line 1090,col 38)",
        "(line 1091,col 9)-(line 1091,col 22)",
        "(line 1092,col 9)-(line 1092,col 22)",
        "(line 1093,col 9)-(line 1093,col 22)",
        "(line 1094,col 9)-(line 1094,col 29)",
        "(line 1095,col 9)-(line 1095,col 29)",
        "(line 1096,col 9)-(line 1096,col 29)",
        "(line 1097,col 9)-(line 1097,col 82)",
        "(line 1098,col 9)-(line 1098,col 82)",
        "(line 1099,col 9)-(line 1099,col 81)",
        "(line 1100,col 9)-(line 1100,col 81)",
        "(line 1102,col 9)-(line 1102,col 22)",
        "(line 1103,col 9)-(line 1103,col 81)",
        "(line 1104,col 9)-(line 1104,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1107,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 42)",
        "(line 1109,col 9)-(line 1109,col 25)",
        "(line 1110,col 9)-(line 1110,col 26)",
        "(line 1111,col 9)-(line 1111,col 42)",
        "(line 1112,col 9)-(line 1112,col 25)",
        "(line 1113,col 9)-(line 1113,col 26)",
        "(line 1114,col 9)-(line 1114,col 42)",
        "(line 1115,col 9)-(line 1115,col 25)",
        "(line 1116,col 9)-(line 1116,col 26)",
        "(line 1117,col 9)-(line 1117,col 25)",
        "(line 1118,col 9)-(line 1118,col 29)",
        "(line 1119,col 9)-(line 1119,col 29)",
        "(line 1120,col 9)-(line 1120,col 29)",
        "(line 1121,col 9)-(line 1121,col 82)",
        "(line 1122,col 9)-(line 1122,col 82)",
        "(line 1123,col 9)-(line 1123,col 81)",
        "(line 1124,col 9)-(line 1124,col 81)",
        "(line 1126,col 9)-(line 1126,col 25)",
        "(line 1127,col 9)-(line 1127,col 81)",
        "(line 1128,col 9)-(line 1128,col 81)"
      ]
    }
  ]
}