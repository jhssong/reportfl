{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 62,
      "end_line": 613,
      "comment": "\n * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfCause"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionUtilsTest(java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.suite()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 79,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 53)",
        "(line 82,col 9)-(line 82,col 53)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 49)",
        "(line 86,col 9)-(line 86,col 38)",
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 89,col 22)",
        "(line 90,col 9)-(line 90,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.tearDown()",
      "begin_line": 93,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 28)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 98,col 26)",
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithoutCause()",
      "begin_line": 104,
      "end_line": 110,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithCause()",
      "begin_line": 112,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor()",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 79)",
        "(line 129,col 9)-(line 129,col 37)",
        "(line 130,col 9)-(line 130,col 70)",
        "(line 131,col 9)-(line 131,col 83)",
        "(line 132,col 9)-(line 132,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testCauseMethodNameOps()",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 139,col 40)",
        "(line 140,col 9)-(line 140,col 41)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 142,col 9)-(line 142,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testCauseMethodNameOps(java.lang.String)",
      "begin_line": 145,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 45)",
        "(line 147,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 160,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 56)",
        "(line 162,col 9)-(line 162,col 64)",
        "(line 163,col 9)-(line 163,col 66)",
        "(line 164,col 9)-(line 164,col 63)",
        "(line 165,col 9)-(line 165,col 62)",
        "(line 166,col 9)-(line 166,col 66)",
        "(line 167,col 9)-(line 167,col 81)",
        "(line 168,col 9)-(line 168,col 126)",
        "(line 169,col 9)-(line 169,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 172,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 62)",
        "(line 174,col 9)-(line 174,col 71)",
        "(line 177,col 9)-(line 177,col 69)",
        "(line 178,col 9)-(line 178,col 76)",
        "(line 179,col 9)-(line 179,col 82)",
        "(line 180,col 9)-(line 180,col 90)",
        "(line 183,col 9)-(line 183,col 70)",
        "(line 184,col 9)-(line 184,col 79)",
        "(line 185,col 9)-(line 185,col 85)",
        "(line 186,col 9)-(line 186,col 91)",
        "(line 187,col 9)-(line 187,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 60)",
        "(line 192,col 9)-(line 192,col 68)",
        "(line 193,col 9)-(line 193,col 70)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 65)",
        "(line 197,col 9)-(line 197,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testSetCause()",
      "begin_line": 200,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 54)",
        "(line 202,col 9)-(line 202,col 89)",
        "(line 203,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testSetCauseToNull()",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Tests overriding a cause to \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 65)",
        "(line 213,col 9)-(line 213,col 85)",
        "(line 214,col 9)-(line 214,col 51)",
        "(line 215,col 9)-(line 215,col 62)",
        "(line 216,col 9)-(line 216,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIsThrowableNested()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 221,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIsNestedThrowable_Throwable()",
      "begin_line": 228,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 81)",
        "(line 230,col 9)-(line 230,col 109)",
        "(line 231,col 9)-(line 231,col 93)",
        "(line 232,col 9)-(line 232,col 72)",
        "(line 233,col 9)-(line 233,col 69)",
        "(line 234,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 244,
      "end_line": 252,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 64)",
        "(line 246,col 9)-(line 246,col 72)",
        "(line 247,col 9)-(line 247,col 66)",
        "(line 248,col 9)-(line 248,col 69)",
        "(line 249,col 9)-(line 249,col 70)",
        "(line 250,col 9)-(line 250,col 69)",
        "(line 251,col 9)-(line 251,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 259,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 76)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 272,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 73)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 275,col 9)-(line 275,col 45)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 74)",
        "(line 282,col 9)-(line 282,col 43)",
        "(line 283,col 9)-(line 283,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_selfCause()",
      "begin_line": 286,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 73)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 75)",
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 296,col 9)-(line 296,col 58)",
        "(line 297,col 9)-(line 297,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 67)",
        "(line 303,col 9)-(line 303,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 306,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 75)",
        "(line 308,col 9)-(line 308,col 43)",
        "(line 309,col 9)-(line 309,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 312,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 69)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 315,col 46)",
        "(line 316,col 9)-(line 316,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 319,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 72)",
        "(line 321,col 9)-(line 321,col 43)",
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 323,col 46)",
        "(line 324,col 9)-(line 324,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 73)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_selfCause()",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 72)",
        "(line 335,col 9)-(line 335,col 43)",
        "(line 336,col 9)-(line 336,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 339,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 74)",
        "(line 341,col 9)-(line 341,col 43)",
        "(line 342,col 9)-(line 342,col 51)",
        "(line 343,col 9)-(line 343,col 62)",
        "(line 344,col 9)-(line 344,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 348,
      "end_line": 368,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 70)",
        "(line 350,col 9)-(line 350,col 89)",
        "(line 352,col 9)-(line 352,col 78)",
        "(line 353,col 9)-(line 353,col 98)",
        "(line 354,col 9)-(line 354,col 97)",
        "(line 355,col 9)-(line 355,col 100)",
        "(line 357,col 9)-(line 357,col 72)",
        "(line 358,col 9)-(line 358,col 92)",
        "(line 359,col 9)-(line 359,col 90)",
        "(line 360,col 9)-(line 360,col 94)",
        "(line 362,col 9)-(line 362,col 75)",
        "(line 363,col 9)-(line 363,col 94)",
        "(line 364,col 9)-(line 364,col 93)",
        "(line 365,col 9)-(line 365,col 97)",
        "(line 367,col 9)-(line 367,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 370,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 73)",
        "(line 372,col 9)-(line 372,col 92)",
        "(line 374,col 9)-(line 374,col 78)",
        "(line 375,col 9)-(line 375,col 101)",
        "(line 376,col 9)-(line 376,col 100)",
        "(line 377,col 9)-(line 377,col 103)",
        "(line 379,col 9)-(line 379,col 75)",
        "(line 380,col 9)-(line 380,col 95)",
        "(line 381,col 9)-(line 381,col 93)",
        "(line 382,col 9)-(line 382,col 97)",
        "(line 384,col 9)-(line 384,col 75)",
        "(line 385,col 9)-(line 385,col 97)",
        "(line 386,col 9)-(line 386,col 96)",
        "(line 387,col 9)-(line 387,col 100)",
        "(line 389,col 9)-(line 389,col 98)",
        "(line 390,col 9)-(line 390,col 97)",
        "(line 391,col 9)-(line 391,col 98)",
        "(line 392,col 9)-(line 392,col 98)",
        "(line 394,col 9)-(line 394,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 398,
      "end_line": 418,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 65)",
        "(line 400,col 9)-(line 400,col 84)",
        "(line 402,col 9)-(line 402,col 73)",
        "(line 403,col 9)-(line 403,col 93)",
        "(line 404,col 9)-(line 404,col 92)",
        "(line 405,col 9)-(line 405,col 95)",
        "(line 407,col 9)-(line 407,col 67)",
        "(line 408,col 9)-(line 408,col 87)",
        "(line 409,col 9)-(line 409,col 85)",
        "(line 410,col 9)-(line 410,col 89)",
        "(line 412,col 9)-(line 412,col 70)",
        "(line 413,col 9)-(line 413,col 89)",
        "(line 414,col 9)-(line 414,col 88)",
        "(line 415,col 9)-(line 415,col 92)",
        "(line 417,col 9)-(line 417,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 420,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 68)",
        "(line 422,col 9)-(line 422,col 87)",
        "(line 424,col 9)-(line 424,col 73)",
        "(line 425,col 9)-(line 425,col 96)",
        "(line 426,col 9)-(line 426,col 95)",
        "(line 427,col 9)-(line 427,col 98)",
        "(line 429,col 9)-(line 429,col 70)",
        "(line 430,col 9)-(line 430,col 90)",
        "(line 431,col 9)-(line 431,col 88)",
        "(line 432,col 9)-(line 432,col 92)",
        "(line 434,col 9)-(line 434,col 70)",
        "(line 435,col 9)-(line 435,col 92)",
        "(line 436,col 9)-(line 436,col 91)",
        "(line 437,col 9)-(line 437,col 95)",
        "(line 439,col 9)-(line 439,col 93)",
        "(line 440,col 9)-(line 440,col 92)",
        "(line 441,col 9)-(line 441,col 93)",
        "(line 442,col 9)-(line 442,col 93)",
        "(line 444,col 9)-(line 444,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 448,
      "end_line": 452,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 454,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 68)",
        "(line 456,col 9)-(line 456,col 74)",
        "(line 457,col 9)-(line 457,col 76)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 460,col 9)-(line 460,col 46)",
        "(line 461,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 46)",
        "(line 468,col 9)-(line 468,col 57)",
        "(line 469,col 9)-(line 469,col 81)",
        "(line 470,col 9)-(line 470,col 43)",
        "(line 471,col 9)-(line 471,col 76)",
        "(line 473,col 9)-(line 473,col 46)",
        "(line 474,col 9)-(line 474,col 84)",
        "(line 475,col 9)-(line 475,col 36)",
        "(line 476,col 9)-(line 476,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 479,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 53)",
        "(line 481,col 9)-(line 481,col 74)",
        "(line 482,col 9)-(line 482,col 79)",
        "(line 483,col 9)-(line 483,col 53)",
        "(line 485,col 9)-(line 485,col 40)",
        "(line 486,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 40)",
        "(line 493,col 9)-(line 493,col 57)",
        "(line 494,col 9)-(line 494,col 84)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 76)",
        "(line 498,col 9)-(line 498,col 40)",
        "(line 499,col 9)-(line 499,col 87)",
        "(line 500,col 9)-(line 500,col 39)",
        "(line 501,col 9)-(line 501,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 505,
      "end_line": 528,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 76)",
        "(line 508,col 9)-(line 508,col 57)",
        "(line 509,col 9)-(line 509,col 79)",
        "(line 510,col 9)-(line 510,col 30)",
        "(line 511,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 34)",
        "(line 519,col 9)-(line 519,col 73)",
        "(line 520,col 9)-(line 520,col 22)",
        "(line 521,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 530,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 538,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 28)",
        "(line 540,col 9)-(line 540,col 56)",
        "(line 542,col 9)-(line 542,col 50)",
        "(line 543,col 9)-(line 543,col 86)",
        "(line 545,col 9)-(line 545,col 51)",
        "(line 546,col 9)-(line 546,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 549,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 28)",
        "(line 551,col 9)-(line 551,col 65)",
        "(line 553,col 9)-(line 553,col 50)",
        "(line 554,col 9)-(line 554,col 95)",
        "(line 556,col 9)-(line 556,col 51)",
        "(line 557,col 9)-(line 557,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 566,
      "end_line": 587,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 569,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 23)",
        "(line 571,col 13)-(line 571,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 574,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 20)",
        "(line 576,col 13)-(line 576,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 579,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 13)-(line 581,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 13)-(line 585,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 594,
      "end_line": 598,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NestableRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 602,
      "end_line": 606,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableRuntimeException.NestableRuntimeException()",
      "begin_line": 603,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 603,col 45)-(line 603,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableRuntimeException.NestableRuntimeException(java.lang.Throwable)",
      "begin_line": 604,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 605,col 56)-(line 605,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NestableException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 607,
      "end_line": 611,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 608,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 609,col 38)-(line 609,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 610,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 610,col 49)-(line 610,col 57)"
      ]
    }
  ]
}