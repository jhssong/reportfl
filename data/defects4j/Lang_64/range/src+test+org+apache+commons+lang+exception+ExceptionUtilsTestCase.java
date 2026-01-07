{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/exception/ExceptionUtilsTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTestCase",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 58,
      "end_line": 586,
      "comment": "\n * Tests {@link org.apache.commons.lang.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfCause"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionUtilsTestCase(java.lang.String)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.suite()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.setUp()",
      "begin_line": 75,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 53)",
        "(line 77,col 9)-(line 77,col 53)",
        "(line 78,col 9)-(line 78,col 51)",
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 80,col 49)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.tearDown()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 90,col 22)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 26)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.createExceptionWithoutCause()",
      "begin_line": 98,
      "end_line": 104,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.createExceptionWithCause()",
      "begin_line": 106,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testCauseMethodNameOps()",
      "begin_line": 120,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testCauseMethodNameOps(java.lang.String)",
      "begin_line": 128,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 45)",
        "(line 130,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetCause_Throwable()",
      "begin_line": 143,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 56)",
        "(line 145,col 9)-(line 145,col 64)",
        "(line 146,col 9)-(line 146,col 66)",
        "(line 147,col 9)-(line 147,col 63)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 66)",
        "(line 150,col 9)-(line 150,col 81)",
        "(line 151,col 9)-(line 151,col 126)",
        "(line 152,col 9)-(line 152,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetCause_ThrowableArray()",
      "begin_line": 155,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 157,col 71)",
        "(line 160,col 9)-(line 160,col 72)",
        "(line 161,col 9)-(line 161,col 81)",
        "(line 162,col 9)-(line 162,col 93)",
        "(line 165,col 9)-(line 165,col 69)",
        "(line 166,col 9)-(line 166,col 76)",
        "(line 167,col 9)-(line 167,col 82)",
        "(line 168,col 9)-(line 168,col 90)",
        "(line 171,col 9)-(line 171,col 70)",
        "(line 172,col 9)-(line 172,col 79)",
        "(line 173,col 9)-(line 173,col 85)",
        "(line 174,col 9)-(line 174,col 91)",
        "(line 175,col 9)-(line 175,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetRootCause_Throwable()",
      "begin_line": 178,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 60)",
        "(line 180,col 9)-(line 180,col 68)",
        "(line 181,col 9)-(line 181,col 70)",
        "(line 182,col 9)-(line 182,col 73)",
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 184,col 65)",
        "(line 185,col 9)-(line 185,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testSetCause()",
      "begin_line": 188,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 54)",
        "(line 190,col 9)-(line 190,col 89)",
        "(line 191,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testSetCauseToNull()",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Tests overriding a cause to \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 65)",
        "(line 201,col 9)-(line 201,col 85)",
        "(line 202,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 203,col 62)",
        "(line 204,col 9)-(line 204,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIsThrowableNested()",
      "begin_line": 208,
      "end_line": 214,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 209,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIsNestedThrowable_Throwable()",
      "begin_line": 216,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 81)",
        "(line 218,col 9)-(line 218,col 109)",
        "(line 219,col 9)-(line 219,col 93)",
        "(line 220,col 9)-(line 220,col 72)",
        "(line 221,col 9)-(line 221,col 69)",
        "(line 222,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableCount_Throwable()",
      "begin_line": 232,
      "end_line": 240,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 64)",
        "(line 234,col 9)-(line 234,col 72)",
        "(line 235,col 9)-(line 235,col 66)",
        "(line 236,col 9)-(line 236,col 69)",
        "(line 237,col 9)-(line 237,col 70)",
        "(line 238,col 9)-(line 238,col 69)",
        "(line 239,col 9)-(line 239,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_null()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 247,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 76)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_nested()",
      "begin_line": 253,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 70)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_withCause()",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 73)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 263,col 45)",
        "(line 264,col 9)-(line 264,col 42)",
        "(line 265,col 9)-(line 265,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 268,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 74)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_selfCause()",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 73)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 280,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 75)",
        "(line 282,col 9)-(line 282,col 43)",
        "(line 283,col 9)-(line 283,col 47)",
        "(line 284,col 9)-(line 284,col 58)",
        "(line 285,col 9)-(line 285,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_null()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 64)",
        "(line 291,col 9)-(line 291,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 294,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 72)",
        "(line 296,col 9)-(line 296,col 43)",
        "(line 297,col 9)-(line 297,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_nested()",
      "begin_line": 300,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 66)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 304,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_withCause()",
      "begin_line": 307,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 69)",
        "(line 309,col 9)-(line 309,col 43)",
        "(line 310,col 9)-(line 310,col 49)",
        "(line 311,col 9)-(line 311,col 46)",
        "(line 312,col 9)-(line 312,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 315,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 70)",
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_selfCause()",
      "begin_line": 321,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 327,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 71)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 51)",
        "(line 331,col 9)-(line 331,col 62)",
        "(line 332,col 9)-(line 332,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOf_ThrowableClass()",
      "begin_line": 336,
      "end_line": 356,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 70)",
        "(line 338,col 9)-(line 338,col 89)",
        "(line 340,col 9)-(line 340,col 78)",
        "(line 341,col 9)-(line 341,col 98)",
        "(line 342,col 9)-(line 342,col 97)",
        "(line 343,col 9)-(line 343,col 100)",
        "(line 345,col 9)-(line 345,col 72)",
        "(line 346,col 9)-(line 346,col 92)",
        "(line 347,col 9)-(line 347,col 90)",
        "(line 348,col 9)-(line 348,col 94)",
        "(line 350,col 9)-(line 350,col 75)",
        "(line 351,col 9)-(line 351,col 94)",
        "(line 352,col 9)-(line 352,col 93)",
        "(line 353,col 9)-(line 353,col 97)",
        "(line 355,col 9)-(line 355,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOf_ThrowableClassInt()",
      "begin_line": 358,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 73)",
        "(line 360,col 9)-(line 360,col 92)",
        "(line 362,col 9)-(line 362,col 78)",
        "(line 363,col 9)-(line 363,col 101)",
        "(line 364,col 9)-(line 364,col 100)",
        "(line 365,col 9)-(line 365,col 103)",
        "(line 367,col 9)-(line 367,col 75)",
        "(line 368,col 9)-(line 368,col 95)",
        "(line 369,col 9)-(line 369,col 93)",
        "(line 370,col 9)-(line 370,col 97)",
        "(line 372,col 9)-(line 372,col 75)",
        "(line 373,col 9)-(line 373,col 97)",
        "(line 374,col 9)-(line 374,col 96)",
        "(line 375,col 9)-(line 375,col 100)",
        "(line 377,col 9)-(line 377,col 98)",
        "(line 378,col 9)-(line 378,col 97)",
        "(line 379,col 9)-(line 379,col 98)",
        "(line 380,col 9)-(line 380,col 98)",
        "(line 382,col 9)-(line 382,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOfType_ThrowableClass()",
      "begin_line": 386,
      "end_line": 406,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 65)",
        "(line 388,col 9)-(line 388,col 84)",
        "(line 390,col 9)-(line 390,col 73)",
        "(line 391,col 9)-(line 391,col 93)",
        "(line 392,col 9)-(line 392,col 92)",
        "(line 393,col 9)-(line 393,col 95)",
        "(line 395,col 9)-(line 395,col 67)",
        "(line 396,col 9)-(line 396,col 87)",
        "(line 397,col 9)-(line 397,col 85)",
        "(line 398,col 9)-(line 398,col 89)",
        "(line 400,col 9)-(line 400,col 70)",
        "(line 401,col 9)-(line 401,col 89)",
        "(line 402,col 9)-(line 402,col 88)",
        "(line 403,col 9)-(line 403,col 92)",
        "(line 405,col 9)-(line 405,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOfType_ThrowableClassInt()",
      "begin_line": 408,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 68)",
        "(line 410,col 9)-(line 410,col 87)",
        "(line 412,col 9)-(line 412,col 73)",
        "(line 413,col 9)-(line 413,col 96)",
        "(line 414,col 9)-(line 414,col 95)",
        "(line 415,col 9)-(line 415,col 98)",
        "(line 417,col 9)-(line 417,col 70)",
        "(line 418,col 9)-(line 418,col 90)",
        "(line 419,col 9)-(line 419,col 88)",
        "(line 420,col 9)-(line 420,col 92)",
        "(line 422,col 9)-(line 422,col 70)",
        "(line 423,col 9)-(line 423,col 92)",
        "(line 424,col 9)-(line 424,col 91)",
        "(line 425,col 9)-(line 425,col 95)",
        "(line 427,col 9)-(line 427,col 93)",
        "(line 428,col 9)-(line 428,col 92)",
        "(line 429,col 9)-(line 429,col 93)",
        "(line 430,col 9)-(line 430,col 93)",
        "(line 432,col 9)-(line 432,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 436,
      "end_line": 440,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 442,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 68)",
        "(line 444,col 9)-(line 444,col 74)",
        "(line 445,col 9)-(line 445,col 76)",
        "(line 446,col 9)-(line 446,col 49)",
        "(line 448,col 9)-(line 448,col 46)",
        "(line 449,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 57)",
        "(line 457,col 9)-(line 457,col 81)",
        "(line 458,col 9)-(line 458,col 43)",
        "(line 459,col 9)-(line 459,col 76)",
        "(line 461,col 9)-(line 461,col 46)",
        "(line 462,col 9)-(line 462,col 84)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 467,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 53)",
        "(line 469,col 9)-(line 469,col 74)",
        "(line 470,col 9)-(line 470,col 79)",
        "(line 471,col 9)-(line 471,col 53)",
        "(line 473,col 9)-(line 473,col 40)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 40)",
        "(line 481,col 9)-(line 481,col 57)",
        "(line 482,col 9)-(line 482,col 84)",
        "(line 483,col 9)-(line 483,col 46)",
        "(line 484,col 9)-(line 484,col 76)",
        "(line 486,col 9)-(line 486,col 40)",
        "(line 487,col 9)-(line 487,col 87)",
        "(line 488,col 9)-(line 488,col 39)",
        "(line 489,col 9)-(line 489,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 493,
      "end_line": 516,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 76)",
        "(line 496,col 9)-(line 496,col 57)",
        "(line 497,col 9)-(line 497,col 79)",
        "(line 498,col 9)-(line 498,col 30)",
        "(line 499,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 34)",
        "(line 507,col 9)-(line 507,col 73)",
        "(line 508,col 9)-(line 508,col 22)",
        "(line 509,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testRemoveCommonFrames_ListList()",
      "begin_line": 518,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 523,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.test_getMessage_Throwable()",
      "begin_line": 526,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 28)",
        "(line 528,col 9)-(line 528,col 56)",
        "(line 530,col 9)-(line 530,col 50)",
        "(line 531,col 9)-(line 531,col 86)",
        "(line 533,col 9)-(line 533,col 51)",
        "(line 534,col 9)-(line 534,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.test_getRootCauseMessage_Throwable()",
      "begin_line": 537,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 28)",
        "(line 539,col 9)-(line 539,col 65)",
        "(line 541,col 9)-(line 541,col 50)",
        "(line 542,col 9)-(line 542,col 95)",
        "(line 544,col 9)-(line 544,col 51)",
        "(line 545,col 9)-(line 545,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 554,
      "end_line": 574,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 558,col 13)-(line 558,col 23)",
        "(line 559,col 13)-(line 559,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 20)",
        "(line 564,col 13)-(line 564,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.getCause()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 568,col 13)-(line 568,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 581,
      "end_line": 584,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithoutCause.getTargetException()",
      "begin_line": 582,
      "end_line": 583,
      "comment": "",
      "child_ranges": []
    }
  ]
}