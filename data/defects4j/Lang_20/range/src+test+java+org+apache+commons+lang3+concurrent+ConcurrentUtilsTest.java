{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 548,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with a runtime as cause.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with an error as cause.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with null as cause.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 47)",
        "(line 112,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 142,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Tests extractCauseUnchecked() for a null exception.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError()",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 47)",
        "(line 168,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException()",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 60)",
        "(line 182,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked()",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 197,col 67)",
        "(line 198,col 9)-(line 198,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 204,
      "end_line": 213,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 47)",
        "(line 207,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 45)",
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError()",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException()",
      "begin_line": 271,
      "end_line": 280,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 60)",
        "(line 274,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked()",
      "begin_line": 285,
      "end_line": 294,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 45)",
        "(line 288,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * Tests handleCauseUnchecked() for a null parameter or a null cause. In\n     * this case the method should do nothing. We can only test that no\n     * exception is thrown.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 51)",
        "(line 304,col 9)-(line 305,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Tests initialize() for a null argument.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize()",
      "begin_line": 320,
      "end_line": 331,
      "comment": "\n     * Tests a successful initialize() operation.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 57)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 54)",
        "(line 327,col 9)-(line 327,col 30)",
        "(line 328,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull()",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\n     * Tests initializeUnchecked() for a null argument.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked()",
      "begin_line": 344,
      "end_line": 355,
      "comment": "\n     * Tests a successful initializeUnchecked() operation.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 350,col 54)",
        "(line 351,col 9)-(line 351,col 30)",
        "(line 352,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 354,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx()",
      "begin_line": 360,
      "end_line": 375,
      "comment": "\n     * Tests whether exceptions are correctly handled by initializeUnchecked().\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 57)",
        "(line 365,col 9)-(line 365,col 48)",
        "(line 366,col 9)-(line 366,col 77)",
        "(line 367,col 9)-(line 367,col 30)",
        "(line 368,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer()",
      "begin_line": 381,
      "end_line": 392,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 39)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 385,col 34)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 387,col 60)",
        "(line 388,col 9)-(line 388,col 48)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 390,col 39)",
        "(line 391,col 9)-(line 391,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null()",
      "begin_line": 397,
      "end_line": 408,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 29)",
        "(line 400,col 9)-(line 400,col 69)",
        "(line 401,col 9)-(line 401,col 34)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 60)",
        "(line 404,col 9)-(line 404,col 48)",
        "(line 405,col 9)-(line 405,col 40)",
        "(line 406,col 9)-(line 406,col 39)",
        "(line 407,col 9)-(line 407,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyPresent()",
      "begin_line": 414,
      "end_line": 423,
      "comment": "\n     * Tests putIfAbsent() if the map contains the key in question.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 37)",
        "(line 417,col 9)-(line 417,col 33)",
        "(line 418,col 9)-(line 418,col 86)",
        "(line 419,col 9)-(line 419,col 28)",
        "(line 420,col 9)-(line 421,col 58)",
        "(line 422,col 9)-(line 422,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyNotPresent()",
      "begin_line": 428,
      "end_line": 436,
      "comment": "\n     * Tests putIfAbsent() if the map does not contain the key in question.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 37)",
        "(line 431,col 9)-(line 431,col 33)",
        "(line 432,col 9)-(line 432,col 86)",
        "(line 433,col 9)-(line 434,col 62)",
        "(line 435,col 9)-(line 435,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentNullMap()",
      "begin_line": 441,
      "end_line": 445,
      "comment": "\n     * Tests putIfAbsent() if a null map is passed in.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 444,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyPresent()",
      "begin_line": 450,
      "end_line": 464,
      "comment": "\n     * Tests createIfAbsent() if the key is found in the map.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 454,col 57)",
        "(line 455,col 9)-(line 455,col 30)",
        "(line 456,col 9)-(line 456,col 37)",
        "(line 457,col 9)-(line 457,col 33)",
        "(line 458,col 9)-(line 458,col 86)",
        "(line 459,col 9)-(line 459,col 28)",
        "(line 460,col 9)-(line 461,col 64)",
        "(line 462,col 9)-(line 462,col 64)",
        "(line 463,col 9)-(line 463,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyNotPresent()",
      "begin_line": 469,
      "end_line": 483,
      "comment": "\n     * Tests createIfAbsent() if the map does not contain the key in question.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 57)",
        "(line 474,col 9)-(line 474,col 37)",
        "(line 475,col 9)-(line 475,col 33)",
        "(line 476,col 9)-(line 476,col 53)",
        "(line 477,col 9)-(line 477,col 30)",
        "(line 478,col 9)-(line 478,col 86)",
        "(line 479,col 9)-(line 480,col 64)",
        "(line 481,col 9)-(line 481,col 64)",
        "(line 482,col 9)-(line 482,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullMap()",
      "begin_line": 488,
      "end_line": 497,
      "comment": "\n     * Tests createIfAbsent() if a null map is passed in.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 57)",
        "(line 493,col 9)-(line 493,col 30)",
        "(line 494,col 9)-(line 495,col 68)",
        "(line 496,col 9)-(line 496,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullInit()",
      "begin_line": 502,
      "end_line": 511,
      "comment": "\n     * Tests createIfAbsent() if a null initializer is passed in.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 86)",
        "(line 505,col 9)-(line 505,col 37)",
        "(line 506,col 9)-(line 506,col 33)",
        "(line 507,col 9)-(line 507,col 28)",
        "(line 508,col 9)-(line 509,col 64)",
        "(line 510,col 9)-(line 510,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedSuccess()",
      "begin_line": 516,
      "end_line": 525,
      "comment": "\n     * Tests createIfAbsentUnchecked() if no exception is thrown.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 37)",
        "(line 519,col 9)-(line 519,col 33)",
        "(line 520,col 9)-(line 520,col 86)",
        "(line 521,col 9)-(line 523,col 66)",
        "(line 524,col 9)-(line 524,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedException()",
      "begin_line": 530,
      "end_line": 547,
      "comment": "\n     * Tests createIfAbsentUnchecked() if an exception is thrown.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 57)",
        "(line 536,col 9)-(line 536,col 39)",
        "(line 537,col 9)-(line 537,col 74)",
        "(line 538,col 9)-(line 538,col 30)",
        "(line 539,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 30)"
      ]
    }
  ]
}