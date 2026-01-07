{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 1174,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.lang3.builder.CompareToBuilderTest.TestObject\u003e"
      ],
      "begin_line": 36,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 41,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 45,col 13)",
        "(line 46,col 13)-(line 48,col 13)",
        "(line 49,col 13)-(line 49,col 44)",
        "(line 50,col 13)-(line 50,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 66,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 69,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 21)",
        "(line 73,col 13)-(line 73,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 79,col 13)",
        "(line 80,col 13)-(line 82,col 13)",
        "(line 83,col 13)-(line 83,col 50)",
        "(line 84,col 13)-(line 84,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 88,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 97,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 42)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 68)",
        "(line 103,col 9)-(line 103,col 19)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 42)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 119,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 126,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 134,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 54)",
        "(line 137,col 9)-(line 137,col 60)",
        "(line 139,col 9)-(line 139,col 24)",
        "(line 140,col 9)-(line 140,col 24)",
        "(line 141,col 9)-(line 141,col 24)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 36)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 154,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 51)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 45)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 51)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 169,col 45)",
        "(line 170,col 9)-(line 170,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 173,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 103)",
        "(line 175,col 9)-(line 175,col 103)",
        "(line 176,col 9)-(line 176,col 103)",
        "(line 178,col 9)-(line 178,col 102)",
        "(line 179,col 9)-(line 179,col 102)",
        "(line 180,col 9)-(line 180,col 102)",
        "(line 182,col 9)-(line 182,col 102)",
        "(line 183,col 9)-(line 183,col 102)",
        "(line 184,col 9)-(line 184,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 187,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 53)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 195,col 9)-(line 195,col 77)",
        "(line 196,col 9)-(line 196,col 77)",
        "(line 197,col 9)-(line 197,col 80)",
        "(line 198,col 9)-(line 198,col 80)",
        "(line 199,col 9)-(line 199,col 77)",
        "(line 201,col 9)-(line 201,col 107)",
        "(line 202,col 9)-(line 202,col 107)",
        "(line 205,col 9)-(line 205,col 57)",
        "(line 207,col 9)-(line 207,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 219,
      "end_line": 237,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 146)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 236,col 9)-(line 236,col 137)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 253,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 93)",
        "(line 258,col 9)-(line 258,col 92)",
        "(line 259,col 9)-(line 259,col 92)",
        "(line 261,col 9)-(line 261,col 93)",
        "(line 262,col 9)-(line 262,col 93)",
        "(line 264,col 9)-(line 264,col 92)",
        "(line 265,col 9)-(line 265,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 268,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 78)",
        "(line 273,col 9)-(line 273,col 78)",
        "(line 274,col 9)-(line 274,col 19)",
        "(line 275,col 9)-(line 275,col 77)",
        "(line 276,col 9)-(line 276,col 77)",
        "(line 278,col 9)-(line 278,col 79)",
        "(line 279,col 9)-(line 279,col 100)",
        "(line 280,col 9)-(line 280,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 283,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 88)",
        "(line 288,col 9)-(line 288,col 88)",
        "(line 289,col 9)-(line 289,col 19)",
        "(line 290,col 9)-(line 290,col 81)",
        "(line 291,col 9)-(line 291,col 81)",
        "(line 293,col 9)-(line 293,col 83)",
        "(line 294,col 9)-(line 294,col 110)",
        "(line 295,col 9)-(line 295,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 298,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 308,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 311,col 27)",
        "(line 312,col 9)-(line 312,col 109)",
        "(line 313,col 9)-(line 313,col 109)",
        "(line 314,col 9)-(line 314,col 20)",
        "(line 315,col 9)-(line 315,col 109)",
        "(line 316,col 9)-(line 316,col 109)",
        "(line 317,col 9)-(line 317,col 21)",
        "(line 318,col 9)-(line 318,col 108)",
        "(line 319,col 9)-(line 319,col 108)",
        "(line 321,col 9)-(line 321,col 110)",
        "(line 322,col 9)-(line 322,col 131)",
        "(line 323,col 9)-(line 323,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 326,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 27)",
        "(line 329,col 9)-(line 329,col 27)",
        "(line 330,col 9)-(line 330,col 84)",
        "(line 331,col 9)-(line 331,col 84)",
        "(line 332,col 9)-(line 332,col 21)",
        "(line 333,col 9)-(line 333,col 83)",
        "(line 334,col 9)-(line 334,col 83)",
        "(line 336,col 9)-(line 336,col 85)",
        "(line 337,col 9)-(line 337,col 106)",
        "(line 338,col 9)-(line 338,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 341,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 21)",
        "(line 344,col 9)-(line 344,col 21)",
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 346,col 77)",
        "(line 347,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 348,col 89)",
        "(line 349,col 9)-(line 349,col 89)",
        "(line 350,col 9)-(line 350,col 89)",
        "(line 351,col 9)-(line 351,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 354,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 19)",
        "(line 357,col 9)-(line 357,col 19)",
        "(line 358,col 9)-(line 358,col 78)",
        "(line 359,col 9)-(line 359,col 77)",
        "(line 360,col 9)-(line 360,col 77)",
        "(line 361,col 9)-(line 361,col 92)",
        "(line 362,col 9)-(line 362,col 92)",
        "(line 363,col 9)-(line 363,col 92)",
        "(line 364,col 9)-(line 364,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 367,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 21)",
        "(line 370,col 9)-(line 370,col 21)",
        "(line 371,col 9)-(line 371,col 78)",
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 373,col 77)",
        "(line 374,col 9)-(line 374,col 90)",
        "(line 375,col 9)-(line 375,col 90)",
        "(line 376,col 9)-(line 376,col 90)",
        "(line 377,col 9)-(line 377,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 380,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 20)",
        "(line 383,col 9)-(line 383,col 20)",
        "(line 384,col 9)-(line 384,col 78)",
        "(line 385,col 9)-(line 385,col 77)",
        "(line 386,col 9)-(line 386,col 77)",
        "(line 387,col 9)-(line 387,col 94)",
        "(line 388,col 9)-(line 388,col 94)",
        "(line 389,col 9)-(line 389,col 94)",
        "(line 390,col 9)-(line 390,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 393,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 20)",
        "(line 396,col 9)-(line 396,col 20)",
        "(line 397,col 9)-(line 397,col 78)",
        "(line 398,col 9)-(line 398,col 77)",
        "(line 399,col 9)-(line 399,col 77)",
        "(line 400,col 9)-(line 400,col 89)",
        "(line 401,col 9)-(line 401,col 89)",
        "(line 402,col 9)-(line 402,col 89)",
        "(line 403,col 9)-(line 403,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 406,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 22)",
        "(line 409,col 9)-(line 409,col 22)",
        "(line 410,col 9)-(line 410,col 78)",
        "(line 411,col 9)-(line 411,col 77)",
        "(line 412,col 9)-(line 412,col 77)",
        "(line 413,col 9)-(line 413,col 91)",
        "(line 414,col 9)-(line 414,col 91)",
        "(line 415,col 9)-(line 415,col 91)",
        "(line 416,col 9)-(line 416,col 91)",
        "(line 417,col 9)-(line 417,col 94)",
        "(line 418,col 9)-(line 418,col 99)",
        "(line 419,col 9)-(line 419,col 113)",
        "(line 420,col 9)-(line 420,col 113)",
        "(line 421,col 9)-(line 421,col 85)",
        "(line 422,col 9)-(line 422,col 85)",
        "(line 423,col 9)-(line 423,col 80)",
        "(line 424,col 9)-(line 424,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 427,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 21)",
        "(line 431,col 9)-(line 431,col 78)",
        "(line 432,col 9)-(line 432,col 77)",
        "(line 433,col 9)-(line 433,col 77)",
        "(line 434,col 9)-(line 434,col 90)",
        "(line 435,col 9)-(line 435,col 90)",
        "(line 436,col 9)-(line 436,col 90)",
        "(line 437,col 9)-(line 437,col 90)",
        "(line 438,col 9)-(line 438,col 92)",
        "(line 439,col 9)-(line 439,col 97)",
        "(line 440,col 9)-(line 440,col 111)",
        "(line 441,col 9)-(line 441,col 111)",
        "(line 442,col 9)-(line 442,col 84)",
        "(line 443,col 9)-(line 443,col 84)",
        "(line 444,col 9)-(line 444,col 80)",
        "(line 445,col 9)-(line 445,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 448,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 26)",
        "(line 451,col 9)-(line 451,col 27)",
        "(line 452,col 9)-(line 452,col 78)",
        "(line 453,col 9)-(line 453,col 78)",
        "(line 454,col 9)-(line 454,col 77)",
        "(line 455,col 9)-(line 455,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 458,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 46)",
        "(line 461,col 9)-(line 461,col 36)",
        "(line 462,col 9)-(line 462,col 36)",
        "(line 463,col 9)-(line 463,col 46)",
        "(line 464,col 9)-(line 464,col 36)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 46)",
        "(line 467,col 9)-(line 467,col 36)",
        "(line 468,col 9)-(line 468,col 36)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 471,col 9)-(line 471,col 82)",
        "(line 472,col 9)-(line 472,col 82)",
        "(line 473,col 9)-(line 473,col 81)",
        "(line 474,col 9)-(line 474,col 81)",
        "(line 476,col 9)-(line 476,col 36)",
        "(line 477,col 9)-(line 477,col 81)",
        "(line 478,col 9)-(line 478,col 81)",
        "(line 480,col 9)-(line 480,col 81)",
        "(line 481,col 9)-(line 481,col 104)",
        "(line 482,col 9)-(line 482,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 485,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 34)",
        "(line 488,col 9)-(line 488,col 21)",
        "(line 489,col 9)-(line 489,col 21)",
        "(line 490,col 9)-(line 490,col 34)",
        "(line 491,col 9)-(line 491,col 21)",
        "(line 492,col 9)-(line 492,col 21)",
        "(line 493,col 9)-(line 493,col 34)",
        "(line 494,col 9)-(line 494,col 21)",
        "(line 495,col 9)-(line 495,col 21)",
        "(line 496,col 9)-(line 496,col 21)",
        "(line 498,col 9)-(line 498,col 82)",
        "(line 499,col 9)-(line 499,col 82)",
        "(line 500,col 9)-(line 500,col 81)",
        "(line 501,col 9)-(line 501,col 81)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 81)",
        "(line 505,col 9)-(line 505,col 81)",
        "(line 507,col 9)-(line 507,col 81)",
        "(line 508,col 9)-(line 508,col 100)",
        "(line 509,col 9)-(line 509,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 512,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 32)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 32)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 20)",
        "(line 520,col 9)-(line 520,col 32)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 525,col 9)-(line 525,col 82)",
        "(line 526,col 9)-(line 526,col 82)",
        "(line 527,col 9)-(line 527,col 81)",
        "(line 528,col 9)-(line 528,col 81)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 81)",
        "(line 532,col 9)-(line 532,col 81)",
        "(line 534,col 9)-(line 534,col 81)",
        "(line 535,col 9)-(line 535,col 98)",
        "(line 536,col 9)-(line 536,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 539,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 36)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 36)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 36)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 552,col 9)-(line 552,col 82)",
        "(line 553,col 9)-(line 553,col 82)",
        "(line 554,col 9)-(line 554,col 81)",
        "(line 555,col 9)-(line 555,col 81)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 558,col 9)-(line 558,col 81)",
        "(line 559,col 9)-(line 559,col 81)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 562,col 9)-(line 562,col 102)",
        "(line 563,col 9)-(line 563,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 566,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 34)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 20)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 579,col 9)-(line 579,col 82)",
        "(line 580,col 9)-(line 580,col 82)",
        "(line 581,col 9)-(line 581,col 81)",
        "(line 582,col 9)-(line 582,col 81)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 585,col 81)",
        "(line 586,col 9)-(line 586,col 81)",
        "(line 588,col 9)-(line 588,col 81)",
        "(line 589,col 9)-(line 589,col 100)",
        "(line 590,col 9)-(line 590,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 593,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 34)",
        "(line 596,col 9)-(line 596,col 20)",
        "(line 597,col 9)-(line 597,col 20)",
        "(line 598,col 9)-(line 598,col 34)",
        "(line 599,col 9)-(line 599,col 20)",
        "(line 600,col 9)-(line 600,col 20)",
        "(line 601,col 9)-(line 601,col 34)",
        "(line 602,col 9)-(line 602,col 20)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 604,col 9)-(line 604,col 20)",
        "(line 606,col 9)-(line 606,col 82)",
        "(line 607,col 9)-(line 607,col 82)",
        "(line 608,col 9)-(line 608,col 81)",
        "(line 609,col 9)-(line 609,col 81)",
        "(line 611,col 9)-(line 611,col 20)",
        "(line 612,col 9)-(line 612,col 81)",
        "(line 613,col 9)-(line 613,col 81)",
        "(line 615,col 9)-(line 615,col 81)",
        "(line 616,col 9)-(line 616,col 100)",
        "(line 617,col 9)-(line 617,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 620,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 38)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 38)",
        "(line 626,col 9)-(line 626,col 20)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 38)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 631,col 9)-(line 631,col 20)",
        "(line 633,col 9)-(line 633,col 82)",
        "(line 634,col 9)-(line 634,col 82)",
        "(line 635,col 9)-(line 635,col 81)",
        "(line 636,col 9)-(line 636,col 81)",
        "(line 638,col 9)-(line 638,col 20)",
        "(line 639,col 9)-(line 639,col 81)",
        "(line 640,col 9)-(line 640,col 81)",
        "(line 642,col 9)-(line 642,col 81)",
        "(line 643,col 9)-(line 643,col 104)",
        "(line 644,col 9)-(line 644,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 647,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 36)",
        "(line 650,col 9)-(line 650,col 20)",
        "(line 651,col 9)-(line 651,col 20)",
        "(line 652,col 9)-(line 652,col 36)",
        "(line 653,col 9)-(line 653,col 20)",
        "(line 654,col 9)-(line 654,col 20)",
        "(line 655,col 9)-(line 655,col 36)",
        "(line 656,col 9)-(line 656,col 20)",
        "(line 657,col 9)-(line 657,col 20)",
        "(line 658,col 9)-(line 658,col 20)",
        "(line 660,col 9)-(line 660,col 82)",
        "(line 661,col 9)-(line 661,col 82)",
        "(line 662,col 9)-(line 662,col 81)",
        "(line 663,col 9)-(line 663,col 81)",
        "(line 665,col 9)-(line 665,col 20)",
        "(line 666,col 9)-(line 666,col 81)",
        "(line 667,col 9)-(line 667,col 81)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 670,col 102)",
        "(line 671,col 9)-(line 671,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 674,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 40)",
        "(line 677,col 9)-(line 677,col 23)",
        "(line 678,col 9)-(line 678,col 24)",
        "(line 679,col 9)-(line 679,col 40)",
        "(line 680,col 9)-(line 680,col 23)",
        "(line 681,col 9)-(line 681,col 24)",
        "(line 682,col 9)-(line 682,col 40)",
        "(line 683,col 9)-(line 683,col 23)",
        "(line 684,col 9)-(line 684,col 24)",
        "(line 685,col 9)-(line 685,col 23)",
        "(line 687,col 9)-(line 687,col 82)",
        "(line 688,col 9)-(line 688,col 82)",
        "(line 689,col 9)-(line 689,col 81)",
        "(line 690,col 9)-(line 690,col 81)",
        "(line 692,col 9)-(line 692,col 23)",
        "(line 693,col 9)-(line 693,col 81)",
        "(line 694,col 9)-(line 694,col 81)",
        "(line 696,col 9)-(line 696,col 81)",
        "(line 697,col 9)-(line 697,col 106)",
        "(line 698,col 9)-(line 698,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 701,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 41)",
        "(line 704,col 9)-(line 704,col 41)",
        "(line 705,col 9)-(line 705,col 41)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 27)",
        "(line 714,col 9)-(line 714,col 27)",
        "(line 716,col 9)-(line 716,col 86)",
        "(line 717,col 9)-(line 717,col 86)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 27)",
        "(line 721,col 9)-(line 721,col 85)",
        "(line 722,col 9)-(line 722,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 725,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 39)",
        "(line 728,col 9)-(line 728,col 39)",
        "(line 729,col 9)-(line 729,col 39)",
        "(line 730,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 27)",
        "(line 738,col 9)-(line 738,col 27)",
        "(line 740,col 9)-(line 740,col 86)",
        "(line 741,col 9)-(line 741,col 86)",
        "(line 742,col 9)-(line 742,col 85)",
        "(line 743,col 9)-(line 743,col 85)",
        "(line 744,col 9)-(line 744,col 27)",
        "(line 745,col 9)-(line 745,col 85)",
        "(line 746,col 9)-(line 746,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 749,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 43)",
        "(line 752,col 9)-(line 752,col 43)",
        "(line 753,col 9)-(line 753,col 43)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 773,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 797,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 41)",
        "(line 800,col 9)-(line 800,col 41)",
        "(line 801,col 9)-(line 801,col 41)",
        "(line 802,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 27)",
        "(line 810,col 9)-(line 810,col 27)",
        "(line 812,col 9)-(line 812,col 86)",
        "(line 813,col 9)-(line 813,col 86)",
        "(line 814,col 9)-(line 814,col 85)",
        "(line 815,col 9)-(line 815,col 85)",
        "(line 816,col 9)-(line 816,col 27)",
        "(line 817,col 9)-(line 817,col 85)",
        "(line 818,col 9)-(line 818,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 821,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 43)",
        "(line 824,col 9)-(line 824,col 43)",
        "(line 825,col 9)-(line 825,col 43)",
        "(line 826,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 27)",
        "(line 834,col 9)-(line 834,col 27)",
        "(line 836,col 9)-(line 836,col 86)",
        "(line 837,col 9)-(line 837,col 86)",
        "(line 838,col 9)-(line 838,col 85)",
        "(line 839,col 9)-(line 839,col 85)",
        "(line 840,col 9)-(line 840,col 27)",
        "(line 841,col 9)-(line 841,col 85)",
        "(line 842,col 9)-(line 842,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 845,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 45)",
        "(line 848,col 9)-(line 848,col 45)",
        "(line 849,col 9)-(line 849,col 45)",
        "(line 850,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 27)",
        "(line 858,col 9)-(line 858,col 27)",
        "(line 860,col 9)-(line 860,col 86)",
        "(line 861,col 9)-(line 861,col 86)",
        "(line 862,col 9)-(line 862,col 85)",
        "(line 863,col 9)-(line 863,col 85)",
        "(line 864,col 9)-(line 864,col 27)",
        "(line 865,col 9)-(line 865,col 85)",
        "(line 866,col 9)-(line 866,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 869,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 47)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 873,col 9)-(line 873,col 47)",
        "(line 874,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 29)",
        "(line 882,col 9)-(line 882,col 29)",
        "(line 884,col 9)-(line 884,col 86)",
        "(line 885,col 9)-(line 885,col 86)",
        "(line 886,col 9)-(line 886,col 85)",
        "(line 887,col 9)-(line 887,col 85)",
        "(line 888,col 9)-(line 888,col 28)",
        "(line 889,col 9)-(line 889,col 85)",
        "(line 890,col 9)-(line 890,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 893,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 896,col 40)",
        "(line 897,col 9)-(line 897,col 40)",
        "(line 898,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 27)",
        "(line 909,col 9)-(line 909,col 27)",
        "(line 912,col 9)-(line 912,col 86)",
        "(line 913,col 9)-(line 913,col 86)",
        "(line 914,col 9)-(line 914,col 85)",
        "(line 915,col 9)-(line 915,col 85)",
        "(line 916,col 9)-(line 916,col 27)",
        "(line 917,col 9)-(line 917,col 85)",
        "(line 918,col 9)-(line 918,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 921,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 40)",
        "(line 924,col 9)-(line 924,col 40)",
        "(line 925,col 9)-(line 925,col 40)",
        "(line 926,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 36)",
        "(line 937,col 9)-(line 937,col 36)",
        "(line 938,col 9)-(line 938,col 86)",
        "(line 939,col 9)-(line 939,col 86)",
        "(line 940,col 9)-(line 940,col 85)",
        "(line 941,col 9)-(line 941,col 85)",
        "(line 942,col 9)-(line 942,col 38)",
        "(line 943,col 9)-(line 943,col 85)",
        "(line 944,col 9)-(line 944,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 947,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 48)",
        "(line 950,col 9)-(line 950,col 38)",
        "(line 951,col 9)-(line 951,col 38)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 953,col 9)-(line 953,col 38)",
        "(line 954,col 9)-(line 954,col 38)",
        "(line 955,col 9)-(line 955,col 48)",
        "(line 956,col 9)-(line 956,col 38)",
        "(line 957,col 9)-(line 957,col 38)",
        "(line 958,col 9)-(line 958,col 38)",
        "(line 960,col 9)-(line 960,col 29)",
        "(line 961,col 9)-(line 961,col 29)",
        "(line 962,col 9)-(line 962,col 29)",
        "(line 964,col 9)-(line 964,col 82)",
        "(line 965,col 9)-(line 965,col 82)",
        "(line 966,col 9)-(line 966,col 81)",
        "(line 967,col 9)-(line 967,col 81)",
        "(line 969,col 9)-(line 969,col 38)",
        "(line 970,col 9)-(line 970,col 81)",
        "(line 971,col 9)-(line 971,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 974,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 36)",
        "(line 977,col 9)-(line 977,col 23)",
        "(line 978,col 9)-(line 978,col 23)",
        "(line 979,col 9)-(line 979,col 36)",
        "(line 980,col 9)-(line 980,col 23)",
        "(line 981,col 9)-(line 981,col 23)",
        "(line 982,col 9)-(line 982,col 36)",
        "(line 983,col 9)-(line 983,col 23)",
        "(line 984,col 9)-(line 984,col 23)",
        "(line 985,col 9)-(line 985,col 23)",
        "(line 986,col 9)-(line 986,col 29)",
        "(line 987,col 9)-(line 987,col 29)",
        "(line 988,col 9)-(line 988,col 29)",
        "(line 989,col 9)-(line 989,col 82)",
        "(line 990,col 9)-(line 990,col 82)",
        "(line 991,col 9)-(line 991,col 81)",
        "(line 992,col 9)-(line 992,col 81)",
        "(line 994,col 9)-(line 994,col 22)",
        "(line 995,col 9)-(line 995,col 81)",
        "(line 996,col 9)-(line 996,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 999,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 34)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 22)",
        "(line 1004,col 9)-(line 1004,col 34)",
        "(line 1005,col 9)-(line 1005,col 22)",
        "(line 1006,col 9)-(line 1006,col 22)",
        "(line 1007,col 9)-(line 1007,col 34)",
        "(line 1008,col 9)-(line 1008,col 22)",
        "(line 1009,col 9)-(line 1009,col 22)",
        "(line 1010,col 9)-(line 1010,col 22)",
        "(line 1011,col 9)-(line 1011,col 29)",
        "(line 1012,col 9)-(line 1012,col 29)",
        "(line 1013,col 9)-(line 1013,col 29)",
        "(line 1014,col 9)-(line 1014,col 82)",
        "(line 1015,col 9)-(line 1015,col 82)",
        "(line 1016,col 9)-(line 1016,col 81)",
        "(line 1017,col 9)-(line 1017,col 81)",
        "(line 1019,col 9)-(line 1019,col 22)",
        "(line 1020,col 9)-(line 1020,col 81)",
        "(line 1021,col 9)-(line 1021,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 1024,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 38)",
        "(line 1027,col 9)-(line 1027,col 22)",
        "(line 1028,col 9)-(line 1028,col 22)",
        "(line 1029,col 9)-(line 1029,col 38)",
        "(line 1030,col 9)-(line 1030,col 22)",
        "(line 1031,col 9)-(line 1031,col 22)",
        "(line 1032,col 9)-(line 1032,col 38)",
        "(line 1033,col 9)-(line 1033,col 22)",
        "(line 1034,col 9)-(line 1034,col 22)",
        "(line 1035,col 9)-(line 1035,col 22)",
        "(line 1036,col 9)-(line 1036,col 29)",
        "(line 1037,col 9)-(line 1037,col 29)",
        "(line 1038,col 9)-(line 1038,col 29)",
        "(line 1039,col 9)-(line 1039,col 82)",
        "(line 1040,col 9)-(line 1040,col 82)",
        "(line 1041,col 9)-(line 1041,col 81)",
        "(line 1042,col 9)-(line 1042,col 81)",
        "(line 1044,col 9)-(line 1044,col 22)",
        "(line 1045,col 9)-(line 1045,col 81)",
        "(line 1046,col 9)-(line 1046,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1049,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 36)",
        "(line 1052,col 9)-(line 1052,col 22)",
        "(line 1053,col 9)-(line 1053,col 22)",
        "(line 1054,col 9)-(line 1054,col 36)",
        "(line 1055,col 9)-(line 1055,col 22)",
        "(line 1056,col 9)-(line 1056,col 22)",
        "(line 1057,col 9)-(line 1057,col 36)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 22)",
        "(line 1060,col 9)-(line 1060,col 22)",
        "(line 1061,col 9)-(line 1061,col 29)",
        "(line 1062,col 9)-(line 1062,col 29)",
        "(line 1063,col 9)-(line 1063,col 29)",
        "(line 1064,col 9)-(line 1064,col 82)",
        "(line 1065,col 9)-(line 1065,col 82)",
        "(line 1066,col 9)-(line 1066,col 81)",
        "(line 1067,col 9)-(line 1067,col 81)",
        "(line 1069,col 9)-(line 1069,col 22)",
        "(line 1070,col 9)-(line 1070,col 81)",
        "(line 1071,col 9)-(line 1071,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1074,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 36)",
        "(line 1077,col 9)-(line 1077,col 22)",
        "(line 1078,col 9)-(line 1078,col 22)",
        "(line 1079,col 9)-(line 1079,col 36)",
        "(line 1080,col 9)-(line 1080,col 22)",
        "(line 1081,col 9)-(line 1081,col 22)",
        "(line 1082,col 9)-(line 1082,col 36)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 22)",
        "(line 1085,col 9)-(line 1085,col 22)",
        "(line 1086,col 9)-(line 1086,col 29)",
        "(line 1087,col 9)-(line 1087,col 29)",
        "(line 1088,col 9)-(line 1088,col 29)",
        "(line 1089,col 9)-(line 1089,col 82)",
        "(line 1090,col 9)-(line 1090,col 82)",
        "(line 1091,col 9)-(line 1091,col 81)",
        "(line 1092,col 9)-(line 1092,col 81)",
        "(line 1094,col 9)-(line 1094,col 22)",
        "(line 1095,col 9)-(line 1095,col 81)",
        "(line 1096,col 9)-(line 1096,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1099,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 40)",
        "(line 1102,col 9)-(line 1102,col 22)",
        "(line 1103,col 9)-(line 1103,col 22)",
        "(line 1104,col 9)-(line 1104,col 40)",
        "(line 1105,col 9)-(line 1105,col 22)",
        "(line 1106,col 9)-(line 1106,col 22)",
        "(line 1107,col 9)-(line 1107,col 40)",
        "(line 1108,col 9)-(line 1108,col 22)",
        "(line 1109,col 9)-(line 1109,col 22)",
        "(line 1110,col 9)-(line 1110,col 22)",
        "(line 1111,col 9)-(line 1111,col 29)",
        "(line 1112,col 9)-(line 1112,col 29)",
        "(line 1113,col 9)-(line 1113,col 29)",
        "(line 1114,col 9)-(line 1114,col 82)",
        "(line 1115,col 9)-(line 1115,col 82)",
        "(line 1116,col 9)-(line 1116,col 81)",
        "(line 1117,col 9)-(line 1117,col 81)",
        "(line 1119,col 9)-(line 1119,col 22)",
        "(line 1120,col 9)-(line 1120,col 81)",
        "(line 1121,col 9)-(line 1121,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1124,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 38)",
        "(line 1127,col 9)-(line 1127,col 22)",
        "(line 1128,col 9)-(line 1128,col 22)",
        "(line 1129,col 9)-(line 1129,col 38)",
        "(line 1130,col 9)-(line 1130,col 22)",
        "(line 1131,col 9)-(line 1131,col 22)",
        "(line 1132,col 9)-(line 1132,col 38)",
        "(line 1133,col 9)-(line 1133,col 22)",
        "(line 1134,col 9)-(line 1134,col 22)",
        "(line 1135,col 9)-(line 1135,col 22)",
        "(line 1136,col 9)-(line 1136,col 29)",
        "(line 1137,col 9)-(line 1137,col 29)",
        "(line 1138,col 9)-(line 1138,col 29)",
        "(line 1139,col 9)-(line 1139,col 82)",
        "(line 1140,col 9)-(line 1140,col 82)",
        "(line 1141,col 9)-(line 1141,col 81)",
        "(line 1142,col 9)-(line 1142,col 81)",
        "(line 1144,col 9)-(line 1144,col 22)",
        "(line 1145,col 9)-(line 1145,col 81)",
        "(line 1146,col 9)-(line 1146,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1149,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 42)",
        "(line 1152,col 9)-(line 1152,col 25)",
        "(line 1153,col 9)-(line 1153,col 26)",
        "(line 1154,col 9)-(line 1154,col 42)",
        "(line 1155,col 9)-(line 1155,col 25)",
        "(line 1156,col 9)-(line 1156,col 26)",
        "(line 1157,col 9)-(line 1157,col 42)",
        "(line 1158,col 9)-(line 1158,col 25)",
        "(line 1159,col 9)-(line 1159,col 26)",
        "(line 1160,col 9)-(line 1160,col 25)",
        "(line 1161,col 9)-(line 1161,col 29)",
        "(line 1162,col 9)-(line 1162,col 29)",
        "(line 1163,col 9)-(line 1163,col 29)",
        "(line 1164,col 9)-(line 1164,col 82)",
        "(line 1165,col 9)-(line 1165,col 82)",
        "(line 1166,col 9)-(line 1166,col 81)",
        "(line 1167,col 9)-(line 1167,col 81)",
        "(line 1169,col 9)-(line 1169,col 25)",
        "(line 1170,col 9)-(line 1170,col 81)",
        "(line 1171,col 9)-(line 1171,col 81)"
      ]
    }
  ]
}