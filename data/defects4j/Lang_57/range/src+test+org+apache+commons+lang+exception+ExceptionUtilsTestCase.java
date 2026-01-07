{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/exception/ExceptionUtilsTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTestCase",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 61,
      "end_line": 600,
      "comment": "\n * Tests {@link org.apache.commons.lang.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfCause"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionUtilsTestCase(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.suite()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.setUp()",
      "begin_line": 78,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 53)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 51)",
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 49)",
        "(line 84,col 9)-(line 84,col 38)",
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 86,col 57)",
        "(line 87,col 9)-(line 87,col 22)",
        "(line 88,col 9)-(line 88,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.tearDown()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 28)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 96,col 25)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.createExceptionWithoutCause()",
      "begin_line": 101,
      "end_line": 107,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 102,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.createExceptionWithCause()",
      "begin_line": 109,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testConstructor()",
      "begin_line": 123,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 76)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 70)",
        "(line 128,col 9)-(line 128,col 83)",
        "(line 129,col 9)-(line 129,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testCauseMethodNameOps()",
      "begin_line": 134,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 42)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 137,col 9)-(line 137,col 41)",
        "(line 138,col 9)-(line 138,col 48)",
        "(line 139,col 9)-(line 139,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testCauseMethodNameOps(java.lang.String)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetCause_Throwable()",
      "begin_line": 157,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 63)",
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 66)",
        "(line 164,col 9)-(line 164,col 81)",
        "(line 165,col 9)-(line 165,col 126)",
        "(line 166,col 9)-(line 166,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetCause_ThrowableArray()",
      "begin_line": 169,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 171,col 71)",
        "(line 174,col 9)-(line 174,col 72)",
        "(line 175,col 9)-(line 175,col 81)",
        "(line 176,col 9)-(line 176,col 93)",
        "(line 179,col 9)-(line 179,col 69)",
        "(line 180,col 9)-(line 180,col 76)",
        "(line 181,col 9)-(line 181,col 82)",
        "(line 182,col 9)-(line 182,col 90)",
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 186,col 79)",
        "(line 187,col 9)-(line 187,col 85)",
        "(line 188,col 9)-(line 188,col 91)",
        "(line 189,col 9)-(line 189,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetRootCause_Throwable()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 60)",
        "(line 194,col 9)-(line 194,col 68)",
        "(line 195,col 9)-(line 195,col 70)",
        "(line 196,col 9)-(line 196,col 73)",
        "(line 197,col 9)-(line 197,col 66)",
        "(line 198,col 9)-(line 198,col 65)",
        "(line 199,col 9)-(line 199,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testSetCause()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 54)",
        "(line 204,col 9)-(line 204,col 89)",
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testSetCauseToNull()",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * Tests overriding a cause to \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 65)",
        "(line 215,col 9)-(line 215,col 85)",
        "(line 216,col 9)-(line 216,col 51)",
        "(line 217,col 9)-(line 217,col 62)",
        "(line 218,col 9)-(line 218,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIsThrowableNested()",
      "begin_line": 222,
      "end_line": 228,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 223,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIsNestedThrowable_Throwable()",
      "begin_line": 230,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 81)",
        "(line 232,col 9)-(line 232,col 109)",
        "(line 233,col 9)-(line 233,col 93)",
        "(line 234,col 9)-(line 234,col 72)",
        "(line 235,col 9)-(line 235,col 69)",
        "(line 236,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableCount_Throwable()",
      "begin_line": 246,
      "end_line": 254,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 64)",
        "(line 248,col 9)-(line 248,col 72)",
        "(line 249,col 9)-(line 249,col 66)",
        "(line 250,col 9)-(line 250,col 69)",
        "(line 251,col 9)-(line 251,col 70)",
        "(line 252,col 9)-(line 252,col 69)",
        "(line 253,col 9)-(line 253,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_null()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 261,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 76)",
        "(line 263,col 9)-(line 263,col 43)",
        "(line 264,col 9)-(line 264,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_nested()",
      "begin_line": 267,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 70)",
        "(line 269,col 9)-(line 269,col 43)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_withCause()",
      "begin_line": 274,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 73)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 74)",
        "(line 284,col 9)-(line 284,col 43)",
        "(line 285,col 9)-(line 285,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_selfCause()",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 73)",
        "(line 290,col 9)-(line 290,col 43)",
        "(line 291,col 9)-(line 291,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 294,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 75)",
        "(line 296,col 9)-(line 296,col 43)",
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 58)",
        "(line 299,col 9)-(line 299,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_null()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 64)",
        "(line 305,col 9)-(line 305,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 72)",
        "(line 310,col 9)-(line 310,col 43)",
        "(line 311,col 9)-(line 311,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_nested()",
      "begin_line": 314,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 66)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 317,col 46)",
        "(line 318,col 9)-(line 318,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_withCause()",
      "begin_line": 321,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 49)",
        "(line 325,col 9)-(line 325,col 46)",
        "(line 326,col 9)-(line 326,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 329,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 70)",
        "(line 331,col 9)-(line 331,col 43)",
        "(line 332,col 9)-(line 332,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_selfCause()",
      "begin_line": 335,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 69)",
        "(line 337,col 9)-(line 337,col 43)",
        "(line 338,col 9)-(line 338,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 341,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 71)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 51)",
        "(line 345,col 9)-(line 345,col 62)",
        "(line 346,col 9)-(line 346,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOf_ThrowableClass()",
      "begin_line": 350,
      "end_line": 370,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 70)",
        "(line 352,col 9)-(line 352,col 89)",
        "(line 354,col 9)-(line 354,col 78)",
        "(line 355,col 9)-(line 355,col 98)",
        "(line 356,col 9)-(line 356,col 97)",
        "(line 357,col 9)-(line 357,col 100)",
        "(line 359,col 9)-(line 359,col 72)",
        "(line 360,col 9)-(line 360,col 92)",
        "(line 361,col 9)-(line 361,col 90)",
        "(line 362,col 9)-(line 362,col 94)",
        "(line 364,col 9)-(line 364,col 75)",
        "(line 365,col 9)-(line 365,col 94)",
        "(line 366,col 9)-(line 366,col 93)",
        "(line 367,col 9)-(line 367,col 97)",
        "(line 369,col 9)-(line 369,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOf_ThrowableClassInt()",
      "begin_line": 372,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 73)",
        "(line 374,col 9)-(line 374,col 92)",
        "(line 376,col 9)-(line 376,col 78)",
        "(line 377,col 9)-(line 377,col 101)",
        "(line 378,col 9)-(line 378,col 100)",
        "(line 379,col 9)-(line 379,col 103)",
        "(line 381,col 9)-(line 381,col 75)",
        "(line 382,col 9)-(line 382,col 95)",
        "(line 383,col 9)-(line 383,col 93)",
        "(line 384,col 9)-(line 384,col 97)",
        "(line 386,col 9)-(line 386,col 75)",
        "(line 387,col 9)-(line 387,col 97)",
        "(line 388,col 9)-(line 388,col 96)",
        "(line 389,col 9)-(line 389,col 100)",
        "(line 391,col 9)-(line 391,col 98)",
        "(line 392,col 9)-(line 392,col 97)",
        "(line 393,col 9)-(line 393,col 98)",
        "(line 394,col 9)-(line 394,col 98)",
        "(line 396,col 9)-(line 396,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOfType_ThrowableClass()",
      "begin_line": 400,
      "end_line": 420,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 65)",
        "(line 402,col 9)-(line 402,col 84)",
        "(line 404,col 9)-(line 404,col 73)",
        "(line 405,col 9)-(line 405,col 93)",
        "(line 406,col 9)-(line 406,col 92)",
        "(line 407,col 9)-(line 407,col 95)",
        "(line 409,col 9)-(line 409,col 67)",
        "(line 410,col 9)-(line 410,col 87)",
        "(line 411,col 9)-(line 411,col 85)",
        "(line 412,col 9)-(line 412,col 89)",
        "(line 414,col 9)-(line 414,col 70)",
        "(line 415,col 9)-(line 415,col 89)",
        "(line 416,col 9)-(line 416,col 88)",
        "(line 417,col 9)-(line 417,col 92)",
        "(line 419,col 9)-(line 419,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testIndexOfType_ThrowableClassInt()",
      "begin_line": 422,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 68)",
        "(line 424,col 9)-(line 424,col 87)",
        "(line 426,col 9)-(line 426,col 73)",
        "(line 427,col 9)-(line 427,col 96)",
        "(line 428,col 9)-(line 428,col 95)",
        "(line 429,col 9)-(line 429,col 98)",
        "(line 431,col 9)-(line 431,col 70)",
        "(line 432,col 9)-(line 432,col 90)",
        "(line 433,col 9)-(line 433,col 88)",
        "(line 434,col 9)-(line 434,col 92)",
        "(line 436,col 9)-(line 436,col 70)",
        "(line 437,col 9)-(line 437,col 92)",
        "(line 438,col 9)-(line 438,col 91)",
        "(line 439,col 9)-(line 439,col 95)",
        "(line 441,col 9)-(line 441,col 93)",
        "(line 442,col 9)-(line 442,col 92)",
        "(line 443,col 9)-(line 443,col 93)",
        "(line 444,col 9)-(line 444,col 93)",
        "(line 446,col 9)-(line 446,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 450,
      "end_line": 454,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 456,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 68)",
        "(line 458,col 9)-(line 458,col 74)",
        "(line 459,col 9)-(line 459,col 76)",
        "(line 460,col 9)-(line 460,col 49)",
        "(line 462,col 9)-(line 462,col 46)",
        "(line 463,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 46)",
        "(line 470,col 9)-(line 470,col 57)",
        "(line 471,col 9)-(line 471,col 81)",
        "(line 472,col 9)-(line 472,col 43)",
        "(line 473,col 9)-(line 473,col 76)",
        "(line 475,col 9)-(line 475,col 46)",
        "(line 476,col 9)-(line 476,col 84)",
        "(line 477,col 9)-(line 477,col 36)",
        "(line 478,col 9)-(line 478,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 481,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 53)",
        "(line 483,col 9)-(line 483,col 74)",
        "(line 484,col 9)-(line 484,col 79)",
        "(line 485,col 9)-(line 485,col 53)",
        "(line 487,col 9)-(line 487,col 40)",
        "(line 488,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 40)",
        "(line 495,col 9)-(line 495,col 57)",
        "(line 496,col 9)-(line 496,col 84)",
        "(line 497,col 9)-(line 497,col 46)",
        "(line 498,col 9)-(line 498,col 76)",
        "(line 500,col 9)-(line 500,col 40)",
        "(line 501,col 9)-(line 501,col 87)",
        "(line 502,col 9)-(line 502,col 39)",
        "(line 503,col 9)-(line 503,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 507,
      "end_line": 530,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 76)",
        "(line 510,col 9)-(line 510,col 57)",
        "(line 511,col 9)-(line 511,col 79)",
        "(line 512,col 9)-(line 512,col 30)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 34)",
        "(line 521,col 9)-(line 521,col 73)",
        "(line 522,col 9)-(line 522,col 22)",
        "(line 523,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.testRemoveCommonFrames_ListList()",
      "begin_line": 532,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.test_getMessage_Throwable()",
      "begin_line": 540,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 28)",
        "(line 542,col 9)-(line 542,col 56)",
        "(line 544,col 9)-(line 544,col 50)",
        "(line 545,col 9)-(line 545,col 86)",
        "(line 547,col 9)-(line 547,col 51)",
        "(line 548,col 9)-(line 548,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.test_getRootCauseMessage_Throwable()",
      "begin_line": 551,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 28)",
        "(line 553,col 9)-(line 553,col 65)",
        "(line 555,col 9)-(line 555,col 50)",
        "(line 556,col 9)-(line 556,col 95)",
        "(line 558,col 9)-(line 558,col 51)",
        "(line 559,col 9)-(line 559,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 568,
      "end_line": 588,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 571,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 23)",
        "(line 573,col 13)-(line 573,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 20)",
        "(line 578,col 13)-(line 578,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.getCause()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 13)-(line 582,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 595,
      "end_line": 598,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtilsTestCase.ExceptionWithoutCause.getTargetException()",
      "begin_line": 596,
      "end_line": 597,
      "comment": "",
      "child_ranges": []
    }
  ]
}