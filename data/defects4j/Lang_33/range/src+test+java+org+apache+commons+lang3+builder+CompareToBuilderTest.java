{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 1113,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 276,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 42)",
        "(line 278,col 9)-(line 278,col 33)",
        "(line 279,col 9)-(line 282,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 285,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 27)",
        "(line 287,col 9)-(line 287,col 27)",
        "(line 288,col 9)-(line 288,col 109)",
        "(line 289,col 9)-(line 289,col 109)",
        "(line 290,col 9)-(line 290,col 20)",
        "(line 291,col 9)-(line 291,col 109)",
        "(line 292,col 9)-(line 292,col 109)",
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 294,col 108)",
        "(line 295,col 9)-(line 295,col 108)",
        "(line 297,col 9)-(line 297,col 110)",
        "(line 298,col 9)-(line 298,col 131)",
        "(line 299,col 9)-(line 299,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 302,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 27)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 84)",
        "(line 306,col 9)-(line 306,col 84)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 308,col 9)-(line 308,col 83)",
        "(line 309,col 9)-(line 309,col 83)",
        "(line 311,col 9)-(line 311,col 85)",
        "(line 312,col 9)-(line 312,col 106)",
        "(line 313,col 9)-(line 313,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 316,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 21)",
        "(line 318,col 9)-(line 318,col 21)",
        "(line 319,col 9)-(line 319,col 78)",
        "(line 320,col 9)-(line 320,col 77)",
        "(line 321,col 9)-(line 321,col 77)",
        "(line 322,col 9)-(line 322,col 89)",
        "(line 323,col 9)-(line 323,col 89)",
        "(line 324,col 9)-(line 324,col 89)",
        "(line 325,col 9)-(line 325,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 328,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 19)",
        "(line 330,col 9)-(line 330,col 19)",
        "(line 331,col 9)-(line 331,col 78)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 77)",
        "(line 334,col 9)-(line 334,col 92)",
        "(line 335,col 9)-(line 335,col 92)",
        "(line 336,col 9)-(line 336,col 92)",
        "(line 337,col 9)-(line 337,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 21)",
        "(line 342,col 9)-(line 342,col 21)",
        "(line 343,col 9)-(line 343,col 78)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 77)",
        "(line 346,col 9)-(line 346,col 90)",
        "(line 347,col 9)-(line 347,col 90)",
        "(line 348,col 9)-(line 348,col 90)",
        "(line 349,col 9)-(line 349,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 352,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 20)",
        "(line 354,col 9)-(line 354,col 20)",
        "(line 355,col 9)-(line 355,col 78)",
        "(line 356,col 9)-(line 356,col 77)",
        "(line 357,col 9)-(line 357,col 77)",
        "(line 358,col 9)-(line 358,col 94)",
        "(line 359,col 9)-(line 359,col 94)",
        "(line 360,col 9)-(line 360,col 94)",
        "(line 361,col 9)-(line 361,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 364,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 20)",
        "(line 366,col 9)-(line 366,col 20)",
        "(line 367,col 9)-(line 367,col 78)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 77)",
        "(line 370,col 9)-(line 370,col 89)",
        "(line 371,col 9)-(line 371,col 89)",
        "(line 372,col 9)-(line 372,col 89)",
        "(line 373,col 9)-(line 373,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 376,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 22)",
        "(line 378,col 9)-(line 378,col 22)",
        "(line 379,col 9)-(line 379,col 78)",
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 77)",
        "(line 382,col 9)-(line 382,col 91)",
        "(line 383,col 9)-(line 383,col 91)",
        "(line 384,col 9)-(line 384,col 91)",
        "(line 385,col 9)-(line 385,col 91)",
        "(line 386,col 9)-(line 386,col 94)",
        "(line 387,col 9)-(line 387,col 99)",
        "(line 388,col 9)-(line 388,col 113)",
        "(line 389,col 9)-(line 389,col 113)",
        "(line 390,col 9)-(line 390,col 85)",
        "(line 391,col 9)-(line 391,col 85)",
        "(line 392,col 9)-(line 392,col 80)",
        "(line 393,col 9)-(line 393,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 396,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 21)",
        "(line 398,col 9)-(line 398,col 21)",
        "(line 399,col 9)-(line 399,col 78)",
        "(line 400,col 9)-(line 400,col 77)",
        "(line 401,col 9)-(line 401,col 77)",
        "(line 402,col 9)-(line 402,col 90)",
        "(line 403,col 9)-(line 403,col 90)",
        "(line 404,col 9)-(line 404,col 90)",
        "(line 405,col 9)-(line 405,col 90)",
        "(line 406,col 9)-(line 406,col 92)",
        "(line 407,col 9)-(line 407,col 97)",
        "(line 408,col 9)-(line 408,col 111)",
        "(line 409,col 9)-(line 409,col 111)",
        "(line 410,col 9)-(line 410,col 84)",
        "(line 411,col 9)-(line 411,col 84)",
        "(line 412,col 9)-(line 412,col 80)",
        "(line 413,col 9)-(line 413,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 416,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 26)",
        "(line 418,col 9)-(line 418,col 27)",
        "(line 419,col 9)-(line 419,col 78)",
        "(line 420,col 9)-(line 420,col 78)",
        "(line 421,col 9)-(line 421,col 77)",
        "(line 422,col 9)-(line 422,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 425,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 36)",
        "(line 428,col 9)-(line 428,col 36)",
        "(line 429,col 9)-(line 429,col 46)",
        "(line 430,col 9)-(line 430,col 36)",
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 46)",
        "(line 433,col 9)-(line 433,col 36)",
        "(line 434,col 9)-(line 434,col 36)",
        "(line 435,col 9)-(line 435,col 36)",
        "(line 437,col 9)-(line 437,col 82)",
        "(line 438,col 9)-(line 438,col 82)",
        "(line 439,col 9)-(line 439,col 81)",
        "(line 440,col 9)-(line 440,col 81)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 81)",
        "(line 444,col 9)-(line 444,col 81)",
        "(line 446,col 9)-(line 446,col 81)",
        "(line 447,col 9)-(line 447,col 104)",
        "(line 448,col 9)-(line 448,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 451,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 34)",
        "(line 453,col 9)-(line 453,col 21)",
        "(line 454,col 9)-(line 454,col 21)",
        "(line 455,col 9)-(line 455,col 34)",
        "(line 456,col 9)-(line 456,col 21)",
        "(line 457,col 9)-(line 457,col 21)",
        "(line 458,col 9)-(line 458,col 34)",
        "(line 459,col 9)-(line 459,col 21)",
        "(line 460,col 9)-(line 460,col 21)",
        "(line 461,col 9)-(line 461,col 21)",
        "(line 463,col 9)-(line 463,col 82)",
        "(line 464,col 9)-(line 464,col 82)",
        "(line 465,col 9)-(line 465,col 81)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 468,col 9)-(line 468,col 20)",
        "(line 469,col 9)-(line 469,col 81)",
        "(line 470,col 9)-(line 470,col 81)",
        "(line 472,col 9)-(line 472,col 81)",
        "(line 473,col 9)-(line 473,col 100)",
        "(line 474,col 9)-(line 474,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 477,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 32)",
        "(line 479,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 480,col 20)",
        "(line 481,col 9)-(line 481,col 32)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 20)",
        "(line 484,col 9)-(line 484,col 32)",
        "(line 485,col 9)-(line 485,col 20)",
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 20)",
        "(line 489,col 9)-(line 489,col 82)",
        "(line 490,col 9)-(line 490,col 82)",
        "(line 491,col 9)-(line 491,col 81)",
        "(line 492,col 9)-(line 492,col 81)",
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 81)",
        "(line 496,col 9)-(line 496,col 81)",
        "(line 498,col 9)-(line 498,col 81)",
        "(line 499,col 9)-(line 499,col 98)",
        "(line 500,col 9)-(line 500,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 503,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 36)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 36)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 36)",
        "(line 511,col 9)-(line 511,col 20)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 20)",
        "(line 515,col 9)-(line 515,col 82)",
        "(line 516,col 9)-(line 516,col 82)",
        "(line 517,col 9)-(line 517,col 81)",
        "(line 518,col 9)-(line 518,col 81)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 81)",
        "(line 522,col 9)-(line 522,col 81)",
        "(line 524,col 9)-(line 524,col 81)",
        "(line 525,col 9)-(line 525,col 102)",
        "(line 526,col 9)-(line 526,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 529,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 34)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 34)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 34)",
        "(line 537,col 9)-(line 537,col 20)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 20)",
        "(line 541,col 9)-(line 541,col 82)",
        "(line 542,col 9)-(line 542,col 82)",
        "(line 543,col 9)-(line 543,col 81)",
        "(line 544,col 9)-(line 544,col 81)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 81)",
        "(line 548,col 9)-(line 548,col 81)",
        "(line 550,col 9)-(line 550,col 81)",
        "(line 551,col 9)-(line 551,col 100)",
        "(line 552,col 9)-(line 552,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 555,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 34)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 558,col 9)-(line 558,col 20)",
        "(line 559,col 9)-(line 559,col 34)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 562,col 34)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 20)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 567,col 9)-(line 567,col 82)",
        "(line 568,col 9)-(line 568,col 82)",
        "(line 569,col 9)-(line 569,col 81)",
        "(line 570,col 9)-(line 570,col 81)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 81)",
        "(line 574,col 9)-(line 574,col 81)",
        "(line 576,col 9)-(line 576,col 81)",
        "(line 577,col 9)-(line 577,col 100)",
        "(line 578,col 9)-(line 578,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 581,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 38)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 585,col 38)",
        "(line 586,col 9)-(line 586,col 20)",
        "(line 587,col 9)-(line 587,col 20)",
        "(line 588,col 9)-(line 588,col 38)",
        "(line 589,col 9)-(line 589,col 20)",
        "(line 590,col 9)-(line 590,col 20)",
        "(line 591,col 9)-(line 591,col 20)",
        "(line 593,col 9)-(line 593,col 82)",
        "(line 594,col 9)-(line 594,col 82)",
        "(line 595,col 9)-(line 595,col 81)",
        "(line 596,col 9)-(line 596,col 81)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 81)",
        "(line 600,col 9)-(line 600,col 81)",
        "(line 602,col 9)-(line 602,col 81)",
        "(line 603,col 9)-(line 603,col 104)",
        "(line 604,col 9)-(line 604,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 607,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 36)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 610,col 9)-(line 610,col 20)",
        "(line 611,col 9)-(line 611,col 36)",
        "(line 612,col 9)-(line 612,col 20)",
        "(line 613,col 9)-(line 613,col 20)",
        "(line 614,col 9)-(line 614,col 36)",
        "(line 615,col 9)-(line 615,col 20)",
        "(line 616,col 9)-(line 616,col 20)",
        "(line 617,col 9)-(line 617,col 20)",
        "(line 619,col 9)-(line 619,col 82)",
        "(line 620,col 9)-(line 620,col 82)",
        "(line 621,col 9)-(line 621,col 81)",
        "(line 622,col 9)-(line 622,col 81)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 81)",
        "(line 626,col 9)-(line 626,col 81)",
        "(line 628,col 9)-(line 628,col 81)",
        "(line 629,col 9)-(line 629,col 102)",
        "(line 630,col 9)-(line 630,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 633,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 40)",
        "(line 635,col 9)-(line 635,col 23)",
        "(line 636,col 9)-(line 636,col 24)",
        "(line 637,col 9)-(line 637,col 40)",
        "(line 638,col 9)-(line 638,col 23)",
        "(line 639,col 9)-(line 639,col 24)",
        "(line 640,col 9)-(line 640,col 40)",
        "(line 641,col 9)-(line 641,col 23)",
        "(line 642,col 9)-(line 642,col 24)",
        "(line 643,col 9)-(line 643,col 23)",
        "(line 645,col 9)-(line 645,col 82)",
        "(line 646,col 9)-(line 646,col 82)",
        "(line 647,col 9)-(line 647,col 81)",
        "(line 648,col 9)-(line 648,col 81)",
        "(line 650,col 9)-(line 650,col 23)",
        "(line 651,col 9)-(line 651,col 81)",
        "(line 652,col 9)-(line 652,col 81)",
        "(line 654,col 9)-(line 654,col 81)",
        "(line 655,col 9)-(line 655,col 106)",
        "(line 656,col 9)-(line 656,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 659,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 41)",
        "(line 661,col 9)-(line 661,col 41)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 663,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 27)",
        "(line 671,col 9)-(line 671,col 27)",
        "(line 673,col 9)-(line 673,col 86)",
        "(line 674,col 9)-(line 674,col 86)",
        "(line 675,col 9)-(line 675,col 85)",
        "(line 676,col 9)-(line 676,col 85)",
        "(line 677,col 9)-(line 677,col 27)",
        "(line 678,col 9)-(line 678,col 85)",
        "(line 679,col 9)-(line 679,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 682,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 39)",
        "(line 684,col 9)-(line 684,col 39)",
        "(line 685,col 9)-(line 685,col 39)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 705,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 43)",
        "(line 707,col 9)-(line 707,col 43)",
        "(line 708,col 9)-(line 708,col 43)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 728,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 41)",
        "(line 730,col 9)-(line 730,col 41)",
        "(line 731,col 9)-(line 731,col 41)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 774,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 43)",
        "(line 776,col 9)-(line 776,col 43)",
        "(line 777,col 9)-(line 777,col 43)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 797,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 45)",
        "(line 799,col 9)-(line 799,col 45)",
        "(line 800,col 9)-(line 800,col 45)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 820,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 47)",
        "(line 822,col 9)-(line 822,col 47)",
        "(line 823,col 9)-(line 823,col 47)",
        "(line 824,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 29)",
        "(line 832,col 9)-(line 832,col 29)",
        "(line 834,col 9)-(line 834,col 86)",
        "(line 835,col 9)-(line 835,col 86)",
        "(line 836,col 9)-(line 836,col 85)",
        "(line 837,col 9)-(line 837,col 85)",
        "(line 838,col 9)-(line 838,col 28)",
        "(line 839,col 9)-(line 839,col 85)",
        "(line 840,col 9)-(line 840,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 843,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 40)",
        "(line 845,col 9)-(line 845,col 40)",
        "(line 846,col 9)-(line 846,col 40)",
        "(line 847,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 27)",
        "(line 858,col 9)-(line 858,col 27)",
        "(line 861,col 9)-(line 861,col 86)",
        "(line 862,col 9)-(line 862,col 86)",
        "(line 863,col 9)-(line 863,col 85)",
        "(line 864,col 9)-(line 864,col 85)",
        "(line 865,col 9)-(line 865,col 27)",
        "(line 866,col 9)-(line 866,col 85)",
        "(line 867,col 9)-(line 867,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 870,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 40)",
        "(line 872,col 9)-(line 872,col 40)",
        "(line 873,col 9)-(line 873,col 40)",
        "(line 874,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 36)",
        "(line 885,col 9)-(line 885,col 36)",
        "(line 886,col 9)-(line 886,col 86)",
        "(line 887,col 9)-(line 887,col 86)",
        "(line 888,col 9)-(line 888,col 85)",
        "(line 889,col 9)-(line 889,col 85)",
        "(line 890,col 9)-(line 890,col 38)",
        "(line 891,col 9)-(line 891,col 85)",
        "(line 892,col 9)-(line 892,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 895,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 48)",
        "(line 897,col 9)-(line 897,col 38)",
        "(line 898,col 9)-(line 898,col 38)",
        "(line 899,col 9)-(line 899,col 48)",
        "(line 900,col 9)-(line 900,col 38)",
        "(line 901,col 9)-(line 901,col 38)",
        "(line 902,col 9)-(line 902,col 48)",
        "(line 903,col 9)-(line 903,col 38)",
        "(line 904,col 9)-(line 904,col 38)",
        "(line 905,col 9)-(line 905,col 38)",
        "(line 907,col 9)-(line 907,col 29)",
        "(line 908,col 9)-(line 908,col 29)",
        "(line 909,col 9)-(line 909,col 29)",
        "(line 911,col 9)-(line 911,col 82)",
        "(line 912,col 9)-(line 912,col 82)",
        "(line 913,col 9)-(line 913,col 81)",
        "(line 914,col 9)-(line 914,col 81)",
        "(line 916,col 9)-(line 916,col 38)",
        "(line 917,col 9)-(line 917,col 81)",
        "(line 918,col 9)-(line 918,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 921,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 36)",
        "(line 923,col 9)-(line 923,col 23)",
        "(line 924,col 9)-(line 924,col 23)",
        "(line 925,col 9)-(line 925,col 36)",
        "(line 926,col 9)-(line 926,col 23)",
        "(line 927,col 9)-(line 927,col 23)",
        "(line 928,col 9)-(line 928,col 36)",
        "(line 929,col 9)-(line 929,col 23)",
        "(line 930,col 9)-(line 930,col 23)",
        "(line 931,col 9)-(line 931,col 23)",
        "(line 932,col 9)-(line 932,col 29)",
        "(line 933,col 9)-(line 933,col 29)",
        "(line 934,col 9)-(line 934,col 29)",
        "(line 935,col 9)-(line 935,col 82)",
        "(line 936,col 9)-(line 936,col 82)",
        "(line 937,col 9)-(line 937,col 81)",
        "(line 938,col 9)-(line 938,col 81)",
        "(line 940,col 9)-(line 940,col 22)",
        "(line 941,col 9)-(line 941,col 81)",
        "(line 942,col 9)-(line 942,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 945,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 34)",
        "(line 947,col 9)-(line 947,col 22)",
        "(line 948,col 9)-(line 948,col 22)",
        "(line 949,col 9)-(line 949,col 34)",
        "(line 950,col 9)-(line 950,col 22)",
        "(line 951,col 9)-(line 951,col 22)",
        "(line 952,col 9)-(line 952,col 34)",
        "(line 953,col 9)-(line 953,col 22)",
        "(line 954,col 9)-(line 954,col 22)",
        "(line 955,col 9)-(line 955,col 22)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 29)",
        "(line 958,col 9)-(line 958,col 29)",
        "(line 959,col 9)-(line 959,col 82)",
        "(line 960,col 9)-(line 960,col 82)",
        "(line 961,col 9)-(line 961,col 81)",
        "(line 962,col 9)-(line 962,col 81)",
        "(line 964,col 9)-(line 964,col 22)",
        "(line 965,col 9)-(line 965,col 81)",
        "(line 966,col 9)-(line 966,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 969,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 38)",
        "(line 971,col 9)-(line 971,col 22)",
        "(line 972,col 9)-(line 972,col 22)",
        "(line 973,col 9)-(line 973,col 38)",
        "(line 974,col 9)-(line 974,col 22)",
        "(line 975,col 9)-(line 975,col 22)",
        "(line 976,col 9)-(line 976,col 38)",
        "(line 977,col 9)-(line 977,col 22)",
        "(line 978,col 9)-(line 978,col 22)",
        "(line 979,col 9)-(line 979,col 22)",
        "(line 980,col 9)-(line 980,col 29)",
        "(line 981,col 9)-(line 981,col 29)",
        "(line 982,col 9)-(line 982,col 29)",
        "(line 983,col 9)-(line 983,col 82)",
        "(line 984,col 9)-(line 984,col 82)",
        "(line 985,col 9)-(line 985,col 81)",
        "(line 986,col 9)-(line 986,col 81)",
        "(line 988,col 9)-(line 988,col 22)",
        "(line 989,col 9)-(line 989,col 81)",
        "(line 990,col 9)-(line 990,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 993,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 36)",
        "(line 995,col 9)-(line 995,col 22)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 36)",
        "(line 998,col 9)-(line 998,col 22)",
        "(line 999,col 9)-(line 999,col 22)",
        "(line 1000,col 9)-(line 1000,col 36)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 22)",
        "(line 1004,col 9)-(line 1004,col 29)",
        "(line 1005,col 9)-(line 1005,col 29)",
        "(line 1006,col 9)-(line 1006,col 29)",
        "(line 1007,col 9)-(line 1007,col 82)",
        "(line 1008,col 9)-(line 1008,col 82)",
        "(line 1009,col 9)-(line 1009,col 81)",
        "(line 1010,col 9)-(line 1010,col 81)",
        "(line 1012,col 9)-(line 1012,col 22)",
        "(line 1013,col 9)-(line 1013,col 81)",
        "(line 1014,col 9)-(line 1014,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1017,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 36)",
        "(line 1019,col 9)-(line 1019,col 22)",
        "(line 1020,col 9)-(line 1020,col 22)",
        "(line 1021,col 9)-(line 1021,col 36)",
        "(line 1022,col 9)-(line 1022,col 22)",
        "(line 1023,col 9)-(line 1023,col 22)",
        "(line 1024,col 9)-(line 1024,col 36)",
        "(line 1025,col 9)-(line 1025,col 22)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 22)",
        "(line 1028,col 9)-(line 1028,col 29)",
        "(line 1029,col 9)-(line 1029,col 29)",
        "(line 1030,col 9)-(line 1030,col 29)",
        "(line 1031,col 9)-(line 1031,col 82)",
        "(line 1032,col 9)-(line 1032,col 82)",
        "(line 1033,col 9)-(line 1033,col 81)",
        "(line 1034,col 9)-(line 1034,col 81)",
        "(line 1036,col 9)-(line 1036,col 22)",
        "(line 1037,col 9)-(line 1037,col 81)",
        "(line 1038,col 9)-(line 1038,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1041,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 40)",
        "(line 1043,col 9)-(line 1043,col 22)",
        "(line 1044,col 9)-(line 1044,col 22)",
        "(line 1045,col 9)-(line 1045,col 40)",
        "(line 1046,col 9)-(line 1046,col 22)",
        "(line 1047,col 9)-(line 1047,col 22)",
        "(line 1048,col 9)-(line 1048,col 40)",
        "(line 1049,col 9)-(line 1049,col 22)",
        "(line 1050,col 9)-(line 1050,col 22)",
        "(line 1051,col 9)-(line 1051,col 22)",
        "(line 1052,col 9)-(line 1052,col 29)",
        "(line 1053,col 9)-(line 1053,col 29)",
        "(line 1054,col 9)-(line 1054,col 29)",
        "(line 1055,col 9)-(line 1055,col 82)",
        "(line 1056,col 9)-(line 1056,col 82)",
        "(line 1057,col 9)-(line 1057,col 81)",
        "(line 1058,col 9)-(line 1058,col 81)",
        "(line 1060,col 9)-(line 1060,col 22)",
        "(line 1061,col 9)-(line 1061,col 81)",
        "(line 1062,col 9)-(line 1062,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1065,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 38)",
        "(line 1067,col 9)-(line 1067,col 22)",
        "(line 1068,col 9)-(line 1068,col 22)",
        "(line 1069,col 9)-(line 1069,col 38)",
        "(line 1070,col 9)-(line 1070,col 22)",
        "(line 1071,col 9)-(line 1071,col 22)",
        "(line 1072,col 9)-(line 1072,col 38)",
        "(line 1073,col 9)-(line 1073,col 22)",
        "(line 1074,col 9)-(line 1074,col 22)",
        "(line 1075,col 9)-(line 1075,col 22)",
        "(line 1076,col 9)-(line 1076,col 29)",
        "(line 1077,col 9)-(line 1077,col 29)",
        "(line 1078,col 9)-(line 1078,col 29)",
        "(line 1079,col 9)-(line 1079,col 82)",
        "(line 1080,col 9)-(line 1080,col 82)",
        "(line 1081,col 9)-(line 1081,col 81)",
        "(line 1082,col 9)-(line 1082,col 81)",
        "(line 1084,col 9)-(line 1084,col 22)",
        "(line 1085,col 9)-(line 1085,col 81)",
        "(line 1086,col 9)-(line 1086,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1089,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 42)",
        "(line 1091,col 9)-(line 1091,col 25)",
        "(line 1092,col 9)-(line 1092,col 26)",
        "(line 1093,col 9)-(line 1093,col 42)",
        "(line 1094,col 9)-(line 1094,col 25)",
        "(line 1095,col 9)-(line 1095,col 26)",
        "(line 1096,col 9)-(line 1096,col 42)",
        "(line 1097,col 9)-(line 1097,col 25)",
        "(line 1098,col 9)-(line 1098,col 26)",
        "(line 1099,col 9)-(line 1099,col 25)",
        "(line 1100,col 9)-(line 1100,col 29)",
        "(line 1101,col 9)-(line 1101,col 29)",
        "(line 1102,col 9)-(line 1102,col 29)",
        "(line 1103,col 9)-(line 1103,col 82)",
        "(line 1104,col 9)-(line 1104,col 82)",
        "(line 1105,col 9)-(line 1105,col 81)",
        "(line 1106,col 9)-(line 1106,col 81)",
        "(line 1108,col 9)-(line 1108,col 25)",
        "(line 1109,col 9)-(line 1109,col 81)",
        "(line 1110,col 9)-(line 1110,col 81)"
      ]
    }
  ]
}