{
  "filepath": "/tmp/Lang-26b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 1127,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.CompareToBuilderTest(java.lang.String)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.lang3.builder.CompareToBuilderTest.TestObject\u003e"
      ],
      "begin_line": 38,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 43,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 47,col 13)",
        "(line 48,col 13)-(line 50,col 13)",
        "(line 51,col 13)-(line 51,col 44)",
        "(line 52,col 13)-(line 52,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 67,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 21)",
        "(line 74,col 13)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 80,col 13)",
        "(line 81,col 13)-(line 83,col 13)",
        "(line 84,col 13)-(line 84,col 50)",
        "(line 85,col 13)-(line 85,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 89,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 98,
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
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 124,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 131,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 54)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 60)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 150,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 51)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 157,col 9)-(line 157,col 45)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 51)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 45)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 168,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 103)",
        "(line 170,col 9)-(line 170,col 103)",
        "(line 171,col 9)-(line 171,col 103)",
        "(line 173,col 9)-(line 173,col 102)",
        "(line 174,col 9)-(line 174,col 102)",
        "(line 175,col 9)-(line 175,col 102)",
        "(line 177,col 9)-(line 177,col 102)",
        "(line 178,col 9)-(line 178,col 102)",
        "(line 179,col 9)-(line 179,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 182,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 190,col 9)-(line 190,col 77)",
        "(line 191,col 9)-(line 191,col 77)",
        "(line 192,col 9)-(line 192,col 80)",
        "(line 193,col 9)-(line 193,col 80)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 196,col 9)-(line 196,col 107)",
        "(line 197,col 9)-(line 197,col 107)",
        "(line 200,col 9)-(line 200,col 57)",
        "(line 202,col 9)-(line 202,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 214,
      "end_line": 232,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 146)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 248,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 42)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 93)",
        "(line 252,col 9)-(line 252,col 92)",
        "(line 253,col 9)-(line 253,col 92)",
        "(line 255,col 9)-(line 255,col 93)",
        "(line 256,col 9)-(line 256,col 93)",
        "(line 258,col 9)-(line 258,col 92)",
        "(line 259,col 9)-(line 259,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 262,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 264,col 42)",
        "(line 265,col 9)-(line 265,col 78)",
        "(line 266,col 9)-(line 266,col 78)",
        "(line 267,col 9)-(line 267,col 19)",
        "(line 268,col 9)-(line 268,col 77)",
        "(line 269,col 9)-(line 269,col 77)",
        "(line 271,col 9)-(line 271,col 79)",
        "(line 272,col 9)-(line 272,col 100)",
        "(line 273,col 9)-(line 273,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 276,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 42)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 71)",
        "(line 280,col 9)-(line 280,col 71)",
        "(line 281,col 9)-(line 281,col 19)",
        "(line 282,col 9)-(line 282,col 70)",
        "(line 283,col 9)-(line 283,col 70)",
        "(line 285,col 9)-(line 285,col 72)",
        "(line 286,col 9)-(line 286,col 93)",
        "(line 287,col 9)-(line 287,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 296,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 299,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 27)",
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 302,col 109)",
        "(line 303,col 9)-(line 303,col 109)",
        "(line 304,col 9)-(line 304,col 20)",
        "(line 305,col 9)-(line 305,col 109)",
        "(line 306,col 9)-(line 306,col 109)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 308,col 9)-(line 308,col 108)",
        "(line 309,col 9)-(line 309,col 108)",
        "(line 311,col 9)-(line 311,col 110)",
        "(line 312,col 9)-(line 312,col 131)",
        "(line 313,col 9)-(line 313,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 316,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 27)",
        "(line 318,col 9)-(line 318,col 27)",
        "(line 319,col 9)-(line 319,col 84)",
        "(line 320,col 9)-(line 320,col 84)",
        "(line 321,col 9)-(line 321,col 21)",
        "(line 322,col 9)-(line 322,col 83)",
        "(line 323,col 9)-(line 323,col 83)",
        "(line 325,col 9)-(line 325,col 85)",
        "(line 326,col 9)-(line 326,col 106)",
        "(line 327,col 9)-(line 327,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 330,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 21)",
        "(line 332,col 9)-(line 332,col 21)",
        "(line 333,col 9)-(line 333,col 78)",
        "(line 334,col 9)-(line 334,col 77)",
        "(line 335,col 9)-(line 335,col 77)",
        "(line 336,col 9)-(line 336,col 89)",
        "(line 337,col 9)-(line 337,col 89)",
        "(line 338,col 9)-(line 338,col 89)",
        "(line 339,col 9)-(line 339,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 19)",
        "(line 344,col 9)-(line 344,col 19)",
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 346,col 77)",
        "(line 347,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 348,col 92)",
        "(line 349,col 9)-(line 349,col 92)",
        "(line 350,col 9)-(line 350,col 92)",
        "(line 351,col 9)-(line 351,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 354,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 21)",
        "(line 356,col 9)-(line 356,col 21)",
        "(line 357,col 9)-(line 357,col 78)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 77)",
        "(line 360,col 9)-(line 360,col 90)",
        "(line 361,col 9)-(line 361,col 90)",
        "(line 362,col 9)-(line 362,col 90)",
        "(line 363,col 9)-(line 363,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 366,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 20)",
        "(line 368,col 9)-(line 368,col 20)",
        "(line 369,col 9)-(line 369,col 78)",
        "(line 370,col 9)-(line 370,col 77)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 372,col 94)",
        "(line 373,col 9)-(line 373,col 94)",
        "(line 374,col 9)-(line 374,col 94)",
        "(line 375,col 9)-(line 375,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 378,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 20)",
        "(line 380,col 9)-(line 380,col 20)",
        "(line 381,col 9)-(line 381,col 78)",
        "(line 382,col 9)-(line 382,col 77)",
        "(line 383,col 9)-(line 383,col 77)",
        "(line 384,col 9)-(line 384,col 89)",
        "(line 385,col 9)-(line 385,col 89)",
        "(line 386,col 9)-(line 386,col 89)",
        "(line 387,col 9)-(line 387,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 390,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 22)",
        "(line 392,col 9)-(line 392,col 22)",
        "(line 393,col 9)-(line 393,col 78)",
        "(line 394,col 9)-(line 394,col 77)",
        "(line 395,col 9)-(line 395,col 77)",
        "(line 396,col 9)-(line 396,col 91)",
        "(line 397,col 9)-(line 397,col 91)",
        "(line 398,col 9)-(line 398,col 91)",
        "(line 399,col 9)-(line 399,col 91)",
        "(line 400,col 9)-(line 400,col 94)",
        "(line 401,col 9)-(line 401,col 99)",
        "(line 402,col 9)-(line 402,col 113)",
        "(line 403,col 9)-(line 403,col 113)",
        "(line 404,col 9)-(line 404,col 85)",
        "(line 405,col 9)-(line 405,col 85)",
        "(line 406,col 9)-(line 406,col 80)",
        "(line 407,col 9)-(line 407,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 410,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 21)",
        "(line 412,col 9)-(line 412,col 21)",
        "(line 413,col 9)-(line 413,col 78)",
        "(line 414,col 9)-(line 414,col 77)",
        "(line 415,col 9)-(line 415,col 77)",
        "(line 416,col 9)-(line 416,col 90)",
        "(line 417,col 9)-(line 417,col 90)",
        "(line 418,col 9)-(line 418,col 90)",
        "(line 419,col 9)-(line 419,col 90)",
        "(line 420,col 9)-(line 420,col 92)",
        "(line 421,col 9)-(line 421,col 97)",
        "(line 422,col 9)-(line 422,col 111)",
        "(line 423,col 9)-(line 423,col 111)",
        "(line 424,col 9)-(line 424,col 84)",
        "(line 425,col 9)-(line 425,col 84)",
        "(line 426,col 9)-(line 426,col 80)",
        "(line 427,col 9)-(line 427,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 430,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 26)",
        "(line 432,col 9)-(line 432,col 27)",
        "(line 433,col 9)-(line 433,col 78)",
        "(line 434,col 9)-(line 434,col 78)",
        "(line 435,col 9)-(line 435,col 77)",
        "(line 436,col 9)-(line 436,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 439,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 46)",
        "(line 441,col 9)-(line 441,col 36)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 46)",
        "(line 444,col 9)-(line 444,col 36)",
        "(line 445,col 9)-(line 445,col 36)",
        "(line 446,col 9)-(line 446,col 46)",
        "(line 447,col 9)-(line 447,col 36)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 36)",
        "(line 451,col 9)-(line 451,col 82)",
        "(line 452,col 9)-(line 452,col 82)",
        "(line 453,col 9)-(line 453,col 81)",
        "(line 454,col 9)-(line 454,col 81)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 81)",
        "(line 458,col 9)-(line 458,col 81)",
        "(line 460,col 9)-(line 460,col 81)",
        "(line 461,col 9)-(line 461,col 104)",
        "(line 462,col 9)-(line 462,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 465,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 34)",
        "(line 467,col 9)-(line 467,col 21)",
        "(line 468,col 9)-(line 468,col 21)",
        "(line 469,col 9)-(line 469,col 34)",
        "(line 470,col 9)-(line 470,col 21)",
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 34)",
        "(line 473,col 9)-(line 473,col 21)",
        "(line 474,col 9)-(line 474,col 21)",
        "(line 475,col 9)-(line 475,col 21)",
        "(line 477,col 9)-(line 477,col 82)",
        "(line 478,col 9)-(line 478,col 82)",
        "(line 479,col 9)-(line 479,col 81)",
        "(line 480,col 9)-(line 480,col 81)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 81)",
        "(line 484,col 9)-(line 484,col 81)",
        "(line 486,col 9)-(line 486,col 81)",
        "(line 487,col 9)-(line 487,col 100)",
        "(line 488,col 9)-(line 488,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 491,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 32)",
        "(line 493,col 9)-(line 493,col 20)",
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 32)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 32)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 503,col 9)-(line 503,col 82)",
        "(line 504,col 9)-(line 504,col 82)",
        "(line 505,col 9)-(line 505,col 81)",
        "(line 506,col 9)-(line 506,col 81)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 81)",
        "(line 510,col 9)-(line 510,col 81)",
        "(line 512,col 9)-(line 512,col 81)",
        "(line 513,col 9)-(line 513,col 98)",
        "(line 514,col 9)-(line 514,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 517,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 36)",
        "(line 519,col 9)-(line 519,col 20)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 36)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 20)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 529,col 9)-(line 529,col 82)",
        "(line 530,col 9)-(line 530,col 82)",
        "(line 531,col 9)-(line 531,col 81)",
        "(line 532,col 9)-(line 532,col 81)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 81)",
        "(line 536,col 9)-(line 536,col 81)",
        "(line 538,col 9)-(line 538,col 81)",
        "(line 539,col 9)-(line 539,col 102)",
        "(line 540,col 9)-(line 540,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 543,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 34)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 34)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 34)",
        "(line 551,col 9)-(line 551,col 20)",
        "(line 552,col 9)-(line 552,col 20)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 555,col 9)-(line 555,col 82)",
        "(line 556,col 9)-(line 556,col 82)",
        "(line 557,col 9)-(line 557,col 81)",
        "(line 558,col 9)-(line 558,col 81)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 562,col 9)-(line 562,col 81)",
        "(line 564,col 9)-(line 564,col 81)",
        "(line 565,col 9)-(line 565,col 100)",
        "(line 566,col 9)-(line 566,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 569,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 34)",
        "(line 571,col 9)-(line 571,col 20)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 34)",
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 20)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 581,col 9)-(line 581,col 82)",
        "(line 582,col 9)-(line 582,col 82)",
        "(line 583,col 9)-(line 583,col 81)",
        "(line 584,col 9)-(line 584,col 81)",
        "(line 586,col 9)-(line 586,col 20)",
        "(line 587,col 9)-(line 587,col 81)",
        "(line 588,col 9)-(line 588,col 81)",
        "(line 590,col 9)-(line 590,col 81)",
        "(line 591,col 9)-(line 591,col 100)",
        "(line 592,col 9)-(line 592,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 595,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 38)",
        "(line 597,col 9)-(line 597,col 20)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 38)",
        "(line 600,col 9)-(line 600,col 20)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 38)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 604,col 9)-(line 604,col 20)",
        "(line 605,col 9)-(line 605,col 20)",
        "(line 607,col 9)-(line 607,col 82)",
        "(line 608,col 9)-(line 608,col 82)",
        "(line 609,col 9)-(line 609,col 81)",
        "(line 610,col 9)-(line 610,col 81)",
        "(line 612,col 9)-(line 612,col 20)",
        "(line 613,col 9)-(line 613,col 81)",
        "(line 614,col 9)-(line 614,col 81)",
        "(line 616,col 9)-(line 616,col 81)",
        "(line 617,col 9)-(line 617,col 104)",
        "(line 618,col 9)-(line 618,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 621,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 36)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 36)",
        "(line 626,col 9)-(line 626,col 20)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 36)",
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
        "(line 643,col 9)-(line 643,col 102)",
        "(line 644,col 9)-(line 644,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 647,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 40)",
        "(line 649,col 9)-(line 649,col 23)",
        "(line 650,col 9)-(line 650,col 24)",
        "(line 651,col 9)-(line 651,col 40)",
        "(line 652,col 9)-(line 652,col 23)",
        "(line 653,col 9)-(line 653,col 24)",
        "(line 654,col 9)-(line 654,col 40)",
        "(line 655,col 9)-(line 655,col 23)",
        "(line 656,col 9)-(line 656,col 24)",
        "(line 657,col 9)-(line 657,col 23)",
        "(line 659,col 9)-(line 659,col 82)",
        "(line 660,col 9)-(line 660,col 82)",
        "(line 661,col 9)-(line 661,col 81)",
        "(line 662,col 9)-(line 662,col 81)",
        "(line 664,col 9)-(line 664,col 23)",
        "(line 665,col 9)-(line 665,col 81)",
        "(line 666,col 9)-(line 666,col 81)",
        "(line 668,col 9)-(line 668,col 81)",
        "(line 669,col 9)-(line 669,col 106)",
        "(line 670,col 9)-(line 670,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 673,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 41)",
        "(line 675,col 9)-(line 675,col 41)",
        "(line 676,col 9)-(line 676,col 41)",
        "(line 677,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 27)",
        "(line 685,col 9)-(line 685,col 27)",
        "(line 687,col 9)-(line 687,col 86)",
        "(line 688,col 9)-(line 688,col 86)",
        "(line 689,col 9)-(line 689,col 85)",
        "(line 690,col 9)-(line 690,col 85)",
        "(line 691,col 9)-(line 691,col 27)",
        "(line 692,col 9)-(line 692,col 85)",
        "(line 693,col 9)-(line 693,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 696,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 39)",
        "(line 698,col 9)-(line 698,col 39)",
        "(line 699,col 9)-(line 699,col 39)",
        "(line 700,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 27)",
        "(line 708,col 9)-(line 708,col 27)",
        "(line 710,col 9)-(line 710,col 86)",
        "(line 711,col 9)-(line 711,col 86)",
        "(line 712,col 9)-(line 712,col 85)",
        "(line 713,col 9)-(line 713,col 85)",
        "(line 714,col 9)-(line 714,col 27)",
        "(line 715,col 9)-(line 715,col 85)",
        "(line 716,col 9)-(line 716,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 719,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 43)",
        "(line 721,col 9)-(line 721,col 43)",
        "(line 722,col 9)-(line 722,col 43)",
        "(line 723,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 27)",
        "(line 731,col 9)-(line 731,col 27)",
        "(line 733,col 9)-(line 733,col 86)",
        "(line 734,col 9)-(line 734,col 86)",
        "(line 735,col 9)-(line 735,col 85)",
        "(line 736,col 9)-(line 736,col 85)",
        "(line 737,col 9)-(line 737,col 27)",
        "(line 738,col 9)-(line 738,col 85)",
        "(line 739,col 9)-(line 739,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 742,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 41)",
        "(line 744,col 9)-(line 744,col 41)",
        "(line 745,col 9)-(line 745,col 41)",
        "(line 746,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 27)",
        "(line 754,col 9)-(line 754,col 27)",
        "(line 756,col 9)-(line 756,col 86)",
        "(line 757,col 9)-(line 757,col 86)",
        "(line 758,col 9)-(line 758,col 85)",
        "(line 759,col 9)-(line 759,col 85)",
        "(line 760,col 9)-(line 760,col 27)",
        "(line 761,col 9)-(line 761,col 85)",
        "(line 762,col 9)-(line 762,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 765,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 41)",
        "(line 767,col 9)-(line 767,col 41)",
        "(line 768,col 9)-(line 768,col 41)",
        "(line 769,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 27)",
        "(line 777,col 9)-(line 777,col 27)",
        "(line 779,col 9)-(line 779,col 86)",
        "(line 780,col 9)-(line 780,col 86)",
        "(line 781,col 9)-(line 781,col 85)",
        "(line 782,col 9)-(line 782,col 85)",
        "(line 783,col 9)-(line 783,col 27)",
        "(line 784,col 9)-(line 784,col 85)",
        "(line 785,col 9)-(line 785,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 788,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 43)",
        "(line 790,col 9)-(line 790,col 43)",
        "(line 791,col 9)-(line 791,col 43)",
        "(line 792,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 27)",
        "(line 800,col 9)-(line 800,col 27)",
        "(line 802,col 9)-(line 802,col 86)",
        "(line 803,col 9)-(line 803,col 86)",
        "(line 804,col 9)-(line 804,col 85)",
        "(line 805,col 9)-(line 805,col 85)",
        "(line 806,col 9)-(line 806,col 27)",
        "(line 807,col 9)-(line 807,col 85)",
        "(line 808,col 9)-(line 808,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 811,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 813,col 45)",
        "(line 814,col 9)-(line 814,col 45)",
        "(line 815,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 27)",
        "(line 823,col 9)-(line 823,col 27)",
        "(line 825,col 9)-(line 825,col 86)",
        "(line 826,col 9)-(line 826,col 86)",
        "(line 827,col 9)-(line 827,col 85)",
        "(line 828,col 9)-(line 828,col 85)",
        "(line 829,col 9)-(line 829,col 27)",
        "(line 830,col 9)-(line 830,col 85)",
        "(line 831,col 9)-(line 831,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 834,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 47)",
        "(line 836,col 9)-(line 836,col 47)",
        "(line 837,col 9)-(line 837,col 47)",
        "(line 838,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 29)",
        "(line 846,col 9)-(line 846,col 29)",
        "(line 848,col 9)-(line 848,col 86)",
        "(line 849,col 9)-(line 849,col 86)",
        "(line 850,col 9)-(line 850,col 85)",
        "(line 851,col 9)-(line 851,col 85)",
        "(line 852,col 9)-(line 852,col 28)",
        "(line 853,col 9)-(line 853,col 85)",
        "(line 854,col 9)-(line 854,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 857,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 40)",
        "(line 859,col 9)-(line 859,col 40)",
        "(line 860,col 9)-(line 860,col 40)",
        "(line 861,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 27)",
        "(line 872,col 9)-(line 872,col 27)",
        "(line 875,col 9)-(line 875,col 86)",
        "(line 876,col 9)-(line 876,col 86)",
        "(line 877,col 9)-(line 877,col 85)",
        "(line 878,col 9)-(line 878,col 85)",
        "(line 879,col 9)-(line 879,col 27)",
        "(line 880,col 9)-(line 880,col 85)",
        "(line 881,col 9)-(line 881,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 884,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 40)",
        "(line 886,col 9)-(line 886,col 40)",
        "(line 887,col 9)-(line 887,col 40)",
        "(line 888,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 36)",
        "(line 899,col 9)-(line 899,col 36)",
        "(line 900,col 9)-(line 900,col 86)",
        "(line 901,col 9)-(line 901,col 86)",
        "(line 902,col 9)-(line 902,col 85)",
        "(line 903,col 9)-(line 903,col 85)",
        "(line 904,col 9)-(line 904,col 38)",
        "(line 905,col 9)-(line 905,col 85)",
        "(line 906,col 9)-(line 906,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 909,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 48)",
        "(line 911,col 9)-(line 911,col 38)",
        "(line 912,col 9)-(line 912,col 38)",
        "(line 913,col 9)-(line 913,col 48)",
        "(line 914,col 9)-(line 914,col 38)",
        "(line 915,col 9)-(line 915,col 38)",
        "(line 916,col 9)-(line 916,col 48)",
        "(line 917,col 9)-(line 917,col 38)",
        "(line 918,col 9)-(line 918,col 38)",
        "(line 919,col 9)-(line 919,col 38)",
        "(line 921,col 9)-(line 921,col 29)",
        "(line 922,col 9)-(line 922,col 29)",
        "(line 923,col 9)-(line 923,col 29)",
        "(line 925,col 9)-(line 925,col 82)",
        "(line 926,col 9)-(line 926,col 82)",
        "(line 927,col 9)-(line 927,col 81)",
        "(line 928,col 9)-(line 928,col 81)",
        "(line 930,col 9)-(line 930,col 38)",
        "(line 931,col 9)-(line 931,col 81)",
        "(line 932,col 9)-(line 932,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 935,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 36)",
        "(line 937,col 9)-(line 937,col 23)",
        "(line 938,col 9)-(line 938,col 23)",
        "(line 939,col 9)-(line 939,col 36)",
        "(line 940,col 9)-(line 940,col 23)",
        "(line 941,col 9)-(line 941,col 23)",
        "(line 942,col 9)-(line 942,col 36)",
        "(line 943,col 9)-(line 943,col 23)",
        "(line 944,col 9)-(line 944,col 23)",
        "(line 945,col 9)-(line 945,col 23)",
        "(line 946,col 9)-(line 946,col 29)",
        "(line 947,col 9)-(line 947,col 29)",
        "(line 948,col 9)-(line 948,col 29)",
        "(line 949,col 9)-(line 949,col 82)",
        "(line 950,col 9)-(line 950,col 82)",
        "(line 951,col 9)-(line 951,col 81)",
        "(line 952,col 9)-(line 952,col 81)",
        "(line 954,col 9)-(line 954,col 22)",
        "(line 955,col 9)-(line 955,col 81)",
        "(line 956,col 9)-(line 956,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 959,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 34)",
        "(line 961,col 9)-(line 961,col 22)",
        "(line 962,col 9)-(line 962,col 22)",
        "(line 963,col 9)-(line 963,col 34)",
        "(line 964,col 9)-(line 964,col 22)",
        "(line 965,col 9)-(line 965,col 22)",
        "(line 966,col 9)-(line 966,col 34)",
        "(line 967,col 9)-(line 967,col 22)",
        "(line 968,col 9)-(line 968,col 22)",
        "(line 969,col 9)-(line 969,col 22)",
        "(line 970,col 9)-(line 970,col 29)",
        "(line 971,col 9)-(line 971,col 29)",
        "(line 972,col 9)-(line 972,col 29)",
        "(line 973,col 9)-(line 973,col 82)",
        "(line 974,col 9)-(line 974,col 82)",
        "(line 975,col 9)-(line 975,col 81)",
        "(line 976,col 9)-(line 976,col 81)",
        "(line 978,col 9)-(line 978,col 22)",
        "(line 979,col 9)-(line 979,col 81)",
        "(line 980,col 9)-(line 980,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 983,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 38)",
        "(line 985,col 9)-(line 985,col 22)",
        "(line 986,col 9)-(line 986,col 22)",
        "(line 987,col 9)-(line 987,col 38)",
        "(line 988,col 9)-(line 988,col 22)",
        "(line 989,col 9)-(line 989,col 22)",
        "(line 990,col 9)-(line 990,col 38)",
        "(line 991,col 9)-(line 991,col 22)",
        "(line 992,col 9)-(line 992,col 22)",
        "(line 993,col 9)-(line 993,col 22)",
        "(line 994,col 9)-(line 994,col 29)",
        "(line 995,col 9)-(line 995,col 29)",
        "(line 996,col 9)-(line 996,col 29)",
        "(line 997,col 9)-(line 997,col 82)",
        "(line 998,col 9)-(line 998,col 82)",
        "(line 999,col 9)-(line 999,col 81)",
        "(line 1000,col 9)-(line 1000,col 81)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 81)",
        "(line 1004,col 9)-(line 1004,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1007,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 36)",
        "(line 1009,col 9)-(line 1009,col 22)",
        "(line 1010,col 9)-(line 1010,col 22)",
        "(line 1011,col 9)-(line 1011,col 36)",
        "(line 1012,col 9)-(line 1012,col 22)",
        "(line 1013,col 9)-(line 1013,col 22)",
        "(line 1014,col 9)-(line 1014,col 36)",
        "(line 1015,col 9)-(line 1015,col 22)",
        "(line 1016,col 9)-(line 1016,col 22)",
        "(line 1017,col 9)-(line 1017,col 22)",
        "(line 1018,col 9)-(line 1018,col 29)",
        "(line 1019,col 9)-(line 1019,col 29)",
        "(line 1020,col 9)-(line 1020,col 29)",
        "(line 1021,col 9)-(line 1021,col 82)",
        "(line 1022,col 9)-(line 1022,col 82)",
        "(line 1023,col 9)-(line 1023,col 81)",
        "(line 1024,col 9)-(line 1024,col 81)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 81)",
        "(line 1028,col 9)-(line 1028,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1031,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 36)",
        "(line 1033,col 9)-(line 1033,col 22)",
        "(line 1034,col 9)-(line 1034,col 22)",
        "(line 1035,col 9)-(line 1035,col 36)",
        "(line 1036,col 9)-(line 1036,col 22)",
        "(line 1037,col 9)-(line 1037,col 22)",
        "(line 1038,col 9)-(line 1038,col 36)",
        "(line 1039,col 9)-(line 1039,col 22)",
        "(line 1040,col 9)-(line 1040,col 22)",
        "(line 1041,col 9)-(line 1041,col 22)",
        "(line 1042,col 9)-(line 1042,col 29)",
        "(line 1043,col 9)-(line 1043,col 29)",
        "(line 1044,col 9)-(line 1044,col 29)",
        "(line 1045,col 9)-(line 1045,col 82)",
        "(line 1046,col 9)-(line 1046,col 82)",
        "(line 1047,col 9)-(line 1047,col 81)",
        "(line 1048,col 9)-(line 1048,col 81)",
        "(line 1050,col 9)-(line 1050,col 22)",
        "(line 1051,col 9)-(line 1051,col 81)",
        "(line 1052,col 9)-(line 1052,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1055,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 40)",
        "(line 1057,col 9)-(line 1057,col 22)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 40)",
        "(line 1060,col 9)-(line 1060,col 22)",
        "(line 1061,col 9)-(line 1061,col 22)",
        "(line 1062,col 9)-(line 1062,col 40)",
        "(line 1063,col 9)-(line 1063,col 22)",
        "(line 1064,col 9)-(line 1064,col 22)",
        "(line 1065,col 9)-(line 1065,col 22)",
        "(line 1066,col 9)-(line 1066,col 29)",
        "(line 1067,col 9)-(line 1067,col 29)",
        "(line 1068,col 9)-(line 1068,col 29)",
        "(line 1069,col 9)-(line 1069,col 82)",
        "(line 1070,col 9)-(line 1070,col 82)",
        "(line 1071,col 9)-(line 1071,col 81)",
        "(line 1072,col 9)-(line 1072,col 81)",
        "(line 1074,col 9)-(line 1074,col 22)",
        "(line 1075,col 9)-(line 1075,col 81)",
        "(line 1076,col 9)-(line 1076,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1079,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 38)",
        "(line 1081,col 9)-(line 1081,col 22)",
        "(line 1082,col 9)-(line 1082,col 22)",
        "(line 1083,col 9)-(line 1083,col 38)",
        "(line 1084,col 9)-(line 1084,col 22)",
        "(line 1085,col 9)-(line 1085,col 22)",
        "(line 1086,col 9)-(line 1086,col 38)",
        "(line 1087,col 9)-(line 1087,col 22)",
        "(line 1088,col 9)-(line 1088,col 22)",
        "(line 1089,col 9)-(line 1089,col 22)",
        "(line 1090,col 9)-(line 1090,col 29)",
        "(line 1091,col 9)-(line 1091,col 29)",
        "(line 1092,col 9)-(line 1092,col 29)",
        "(line 1093,col 9)-(line 1093,col 82)",
        "(line 1094,col 9)-(line 1094,col 82)",
        "(line 1095,col 9)-(line 1095,col 81)",
        "(line 1096,col 9)-(line 1096,col 81)",
        "(line 1098,col 9)-(line 1098,col 22)",
        "(line 1099,col 9)-(line 1099,col 81)",
        "(line 1100,col 9)-(line 1100,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1103,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 42)",
        "(line 1105,col 9)-(line 1105,col 25)",
        "(line 1106,col 9)-(line 1106,col 26)",
        "(line 1107,col 9)-(line 1107,col 42)",
        "(line 1108,col 9)-(line 1108,col 25)",
        "(line 1109,col 9)-(line 1109,col 26)",
        "(line 1110,col 9)-(line 1110,col 42)",
        "(line 1111,col 9)-(line 1111,col 25)",
        "(line 1112,col 9)-(line 1112,col 26)",
        "(line 1113,col 9)-(line 1113,col 25)",
        "(line 1114,col 9)-(line 1114,col 29)",
        "(line 1115,col 9)-(line 1115,col 29)",
        "(line 1116,col 9)-(line 1116,col 29)",
        "(line 1117,col 9)-(line 1117,col 82)",
        "(line 1118,col 9)-(line 1118,col 82)",
        "(line 1119,col 9)-(line 1119,col 81)",
        "(line 1120,col 9)-(line 1120,col 81)",
        "(line 1122,col 9)-(line 1122,col 25)",
        "(line 1123,col 9)-(line 1123,col 81)",
        "(line 1124,col 9)-(line 1124,col 81)"
      ]
    }
  ]
}