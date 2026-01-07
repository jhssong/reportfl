{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 54,
      "end_line": 512,
      "comment": "\n * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionUtilsTest(java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 66,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 53)",
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 48)",
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 57)",
        "(line 74,col 9)-(line 74,col 22)",
        "(line 75,col 9)-(line 75,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.tearDown()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 22)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 26)",
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithoutCause()",
      "begin_line": 88,
      "end_line": 94,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithCause()",
      "begin_line": 96,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 79)",
        "(line 113,col 9)-(line 113,col 37)",
        "(line 114,col 9)-(line 114,col 70)",
        "(line 115,col 9)-(line 115,col 83)",
        "(line 116,col 9)-(line 116,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 120,
      "end_line": 130,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 64)",
        "(line 124,col 9)-(line 124,col 66)",
        "(line 125,col 9)-(line 125,col 63)",
        "(line 126,col 9)-(line 126,col 62)",
        "(line 127,col 9)-(line 127,col 81)",
        "(line 128,col 9)-(line 128,col 126)",
        "(line 129,col 9)-(line 129,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 132,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 62)",
        "(line 135,col 9)-(line 135,col 71)",
        "(line 138,col 9)-(line 138,col 69)",
        "(line 139,col 9)-(line 139,col 76)",
        "(line 140,col 9)-(line 140,col 82)",
        "(line 141,col 9)-(line 141,col 90)",
        "(line 144,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 145,col 79)",
        "(line 146,col 9)-(line 146,col 85)",
        "(line 147,col 9)-(line 147,col 91)",
        "(line 148,col 9)-(line 148,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 151,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 60)",
        "(line 153,col 9)-(line 153,col 68)",
        "(line 154,col 9)-(line 154,col 70)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 161,
      "end_line": 168,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 64)",
        "(line 163,col 9)-(line 163,col 72)",
        "(line 164,col 9)-(line 164,col 66)",
        "(line 165,col 9)-(line 165,col 69)",
        "(line 166,col 9)-(line 166,col 70)",
        "(line 167,col 9)-(line 167,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 76)",
        "(line 177,col 9)-(line 177,col 43)",
        "(line 178,col 9)-(line 178,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 181,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 70)",
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 184,col 42)",
        "(line 185,col 9)-(line 185,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 188,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 73)",
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 192,col 42)",
        "(line 193,col 9)-(line 193,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 196,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 74)",
        "(line 198,col 9)-(line 198,col 43)",
        "(line 199,col 9)-(line 199,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 75)",
        "(line 204,col 9)-(line 204,col 43)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 206,col 58)",
        "(line 207,col 9)-(line 207,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 67)",
        "(line 213,col 9)-(line 213,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 75)",
        "(line 218,col 9)-(line 218,col 43)",
        "(line 219,col 9)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 69)",
        "(line 224,col 9)-(line 224,col 43)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 226,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 229,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 72)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 234,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 237,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 73)",
        "(line 239,col 9)-(line 239,col 43)",
        "(line 240,col 9)-(line 240,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 243,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 74)",
        "(line 245,col 9)-(line 245,col 43)",
        "(line 246,col 9)-(line 246,col 51)",
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 252,
      "end_line": 272,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 70)",
        "(line 254,col 9)-(line 254,col 89)",
        "(line 256,col 9)-(line 256,col 78)",
        "(line 257,col 9)-(line 257,col 98)",
        "(line 258,col 9)-(line 258,col 97)",
        "(line 259,col 9)-(line 259,col 100)",
        "(line 261,col 9)-(line 261,col 72)",
        "(line 262,col 9)-(line 262,col 92)",
        "(line 263,col 9)-(line 263,col 90)",
        "(line 264,col 9)-(line 264,col 94)",
        "(line 266,col 9)-(line 266,col 75)",
        "(line 267,col 9)-(line 267,col 94)",
        "(line 268,col 9)-(line 268,col 93)",
        "(line 269,col 9)-(line 269,col 97)",
        "(line 271,col 9)-(line 271,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 274,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 73)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 278,col 9)-(line 278,col 78)",
        "(line 279,col 9)-(line 279,col 101)",
        "(line 280,col 9)-(line 280,col 100)",
        "(line 281,col 9)-(line 281,col 103)",
        "(line 283,col 9)-(line 283,col 75)",
        "(line 284,col 9)-(line 284,col 95)",
        "(line 285,col 9)-(line 285,col 93)",
        "(line 286,col 9)-(line 286,col 97)",
        "(line 288,col 9)-(line 288,col 75)",
        "(line 289,col 9)-(line 289,col 97)",
        "(line 290,col 9)-(line 290,col 96)",
        "(line 291,col 9)-(line 291,col 100)",
        "(line 293,col 9)-(line 293,col 98)",
        "(line 294,col 9)-(line 294,col 97)",
        "(line 295,col 9)-(line 295,col 98)",
        "(line 296,col 9)-(line 296,col 98)",
        "(line 298,col 9)-(line 298,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 302,
      "end_line": 322,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 65)",
        "(line 304,col 9)-(line 304,col 84)",
        "(line 306,col 9)-(line 306,col 73)",
        "(line 307,col 9)-(line 307,col 93)",
        "(line 308,col 9)-(line 308,col 92)",
        "(line 309,col 9)-(line 309,col 95)",
        "(line 311,col 9)-(line 311,col 67)",
        "(line 312,col 9)-(line 312,col 87)",
        "(line 313,col 9)-(line 313,col 85)",
        "(line 314,col 9)-(line 314,col 89)",
        "(line 316,col 9)-(line 316,col 70)",
        "(line 317,col 9)-(line 317,col 89)",
        "(line 318,col 9)-(line 318,col 88)",
        "(line 319,col 9)-(line 319,col 92)",
        "(line 321,col 9)-(line 321,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 324,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 68)",
        "(line 326,col 9)-(line 326,col 87)",
        "(line 328,col 9)-(line 328,col 73)",
        "(line 329,col 9)-(line 329,col 96)",
        "(line 330,col 9)-(line 330,col 95)",
        "(line 331,col 9)-(line 331,col 98)",
        "(line 333,col 9)-(line 333,col 70)",
        "(line 334,col 9)-(line 334,col 90)",
        "(line 335,col 9)-(line 335,col 88)",
        "(line 336,col 9)-(line 336,col 92)",
        "(line 338,col 9)-(line 338,col 70)",
        "(line 339,col 9)-(line 339,col 92)",
        "(line 340,col 9)-(line 340,col 91)",
        "(line 341,col 9)-(line 341,col 95)",
        "(line 343,col 9)-(line 343,col 93)",
        "(line 344,col 9)-(line 344,col 92)",
        "(line 345,col 9)-(line 345,col 93)",
        "(line 346,col 9)-(line 346,col 93)",
        "(line 348,col 9)-(line 348,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 352,
      "end_line": 356,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 358,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 68)",
        "(line 360,col 9)-(line 360,col 74)",
        "(line 361,col 9)-(line 361,col 76)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 364,col 9)-(line 364,col 46)",
        "(line 365,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 46)",
        "(line 372,col 9)-(line 372,col 57)",
        "(line 373,col 9)-(line 373,col 81)",
        "(line 374,col 9)-(line 374,col 43)",
        "(line 375,col 9)-(line 375,col 76)",
        "(line 377,col 9)-(line 377,col 46)",
        "(line 378,col 9)-(line 378,col 84)",
        "(line 379,col 9)-(line 379,col 36)",
        "(line 380,col 9)-(line 380,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 383,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 53)",
        "(line 385,col 9)-(line 385,col 74)",
        "(line 386,col 9)-(line 386,col 79)",
        "(line 387,col 9)-(line 387,col 53)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 40)",
        "(line 397,col 9)-(line 397,col 57)",
        "(line 398,col 9)-(line 398,col 84)",
        "(line 399,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 400,col 76)",
        "(line 402,col 9)-(line 402,col 40)",
        "(line 403,col 9)-(line 403,col 87)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 409,
      "end_line": 432,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 76)",
        "(line 412,col 9)-(line 412,col 57)",
        "(line 413,col 9)-(line 413,col 79)",
        "(line 414,col 9)-(line 414,col 30)",
        "(line 415,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 34)",
        "(line 423,col 9)-(line 423,col 73)",
        "(line 424,col 9)-(line 424,col 22)",
        "(line 425,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 434,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 442,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 28)",
        "(line 444,col 9)-(line 444,col 56)",
        "(line 446,col 9)-(line 446,col 50)",
        "(line 447,col 9)-(line 447,col 86)",
        "(line 449,col 9)-(line 449,col 51)",
        "(line 450,col 9)-(line 450,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 453,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 28)",
        "(line 455,col 9)-(line 455,col 65)",
        "(line 457,col 9)-(line 457,col 50)",
        "(line 458,col 9)-(line 458,col 95)",
        "(line 460,col 9)-(line 460,col 51)",
        "(line 461,col 9)-(line 461,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 470,
      "end_line": 491,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 474,col 13)-(line 474,col 23)",
        "(line 475,col 13)-(line 475,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 478,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 20)",
        "(line 480,col 13)-(line 480,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 483,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 485,col 13)-(line 485,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 498,
      "end_line": 502,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NestableException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 506,
      "end_line": 510,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 507,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 508,col 38)-(line 508,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 509,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 509,col 49)-(line 509,col 57)"
      ]
    }
  ]
}