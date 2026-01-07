{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/concurrent/TimedSemaphoreTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimedSemaphoreTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 481,
      "comment": "\n * Test class for TimedSemaphore.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PERIOD"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Constant for the time period. "
    },
    {
      "type": "field",
      "varNames": [
        "UNIT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Constant for the time unit. "
    },
    {
      "type": "field",
      "varNames": [
        "LIMIT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Constant for the default limit. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInit()",
      "begin_line": 53,
      "end_line": 70,
      "comment": "\n     * Tests creating a new instance.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 56,col 60)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 33)",
        "(line 61,col 9)-(line 61,col 79)",
        "(line 62,col 9)-(line 62,col 68)",
        "(line 63,col 9)-(line 63,col 62)",
        "(line 64,col 9)-(line 65,col 45)",
        "(line 66,col 9)-(line 67,col 50)",
        "(line 68,col 9)-(line 68,col 64)",
        "(line 69,col 9)-(line 69,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitInvalidPeriod()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Tries to create an instance with a negative period. This should cause an\n     * exception.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitDefaultService()",
      "begin_line": 85,
      "end_line": 96,
      "comment": "\n     * Tests whether a default executor service is created if no service is\n     * provided.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 75)",
        "(line 88,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 91,col 72)",
        "(line 92,col 9)-(line 93,col 70)",
        "(line 94,col 9)-(line 94,col 59)",
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testStartTimer()",
      "begin_line": 101,
      "end_line": 117,
      "comment": "\n     * Tests starting the timer.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 29)",
        "(line 105,col 9)-(line 105,col 59)",
        "(line 106,col 9)-(line 106,col 52)",
        "(line 107,col 9)-(line 107,col 29)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownOwnExecutor()",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\n     * Tests the shutdown() method if the executor belongs to the semaphore. In\n     * this case it has to be shut down.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 75)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 128,col 9)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorNoTask()",
      "begin_line": 136,
      "end_line": 146,
      "comment": "\n     * Tests the shutdown() method for a shared executor service before a task\n     * was started. This should do pretty much nothing.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 139,col 60)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.prepareStartTimer(java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledFuture\u003c?\u003e)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Prepares an executor service mock to expect the start of the timer.\n     *\n     * @param service the mock\n     * @param future the future\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 69)",
        "(line 158,col 9)-(line 158,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorTask()",
      "begin_line": 165,
      "end_line": 179,
      "comment": "\n     * Tests the shutdown() method for a shared executor after the task was\n     * started. In this case the task must be canceled.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 169,col 79)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 87)",
        "(line 172,col 9)-(line 172,col 41)",
        "(line 173,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 28)",
        "(line 176,col 9)-(line 176,col 29)",
        "(line 177,col 9)-(line 177,col 59)",
        "(line 178,col 9)-(line 178,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownMultipleTimes()",
      "begin_line": 184,
      "end_line": 199,
      "comment": "\n     * Tests multiple invocations of the shutdown() method.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 187,col 60)",
        "(line 188,col 9)-(line 188,col 79)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 190,col 9)-(line 190,col 87)",
        "(line 191,col 9)-(line 191,col 41)",
        "(line 192,col 9)-(line 193,col 37)",
        "(line 194,col 9)-(line 194,col 28)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireLimit()",
      "begin_line": 204,
      "end_line": 233,
      "comment": "\n     * Tests the acquire() method if a limit is set.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 207,col 60)",
        "(line 208,col 9)-(line 208,col 79)",
        "(line 209,col 9)-(line 209,col 43)",
        "(line 210,col 9)-(line 210,col 41)",
        "(line 211,col 9)-(line 211,col 29)",
        "(line 212,col 9)-(line 212,col 61)",
        "(line 213,col 9)-(line 213,col 80)",
        "(line 214,col 9)-(line 215,col 27)",
        "(line 216,col 9)-(line 216,col 38)",
        "(line 219,col 9)-(line 219,col 18)",
        "(line 220,col 9)-(line 220,col 22)",
        "(line 222,col 9)-(line 223,col 36)",
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 17)",
        "(line 228,col 9)-(line 229,col 36)",
        "(line 230,col 9)-(line 231,col 45)",
        "(line 232,col 9)-(line 232,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultipleThreads()",
      "begin_line": 241,
      "end_line": 269,
      "comment": "\n     * Tests the acquire() method if more threads are involved than the limit.\n     * This method starts a number of threads that all invoke the semaphore. The\n     * semaphore\u0027s limit is set to 1, so in each period only a single thread can\n     * acquire the semaphore.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 245,col 79)",
        "(line 246,col 9)-(line 246,col 43)",
        "(line 247,col 9)-(line 247,col 41)",
        "(line 248,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 48)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 63)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireNoLimit()",
      "begin_line": 276,
      "end_line": 291,
      "comment": "\n     * Tests the acquire() method if no limit is set. A test thread is started\n     * that calls the semaphore a large number of times. Even if the semaphore\u0027s\n     * period does not end, the thread should never block.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 279,col 60)",
        "(line 280,col 9)-(line 280,col 79)",
        "(line 281,col 9)-(line 281,col 43)",
        "(line 282,col 9)-(line 282,col 41)",
        "(line 283,col 9)-(line 284,col 55)",
        "(line 285,col 9)-(line 285,col 31)",
        "(line 286,col 9)-(line 286,col 57)",
        "(line 287,col 9)-(line 287,col 80)",
        "(line 288,col 9)-(line 288,col 18)",
        "(line 289,col 9)-(line 289,col 22)",
        "(line 290,col 9)-(line 290,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testPassAfterShutdown()",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\n     * Tries to call acquire() after shutdown(). This should cause an exception.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 75)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultiplePeriods()",
      "begin_line": 309,
      "end_line": 321,
      "comment": "\n     * Tests a bigger number of invocations that span multiple periods. The\n     * period is set to a very short time. A background thread calls the\n     * semaphore a large number of times. While it runs at last one end of a\n     * period should be reached.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 31)",
        "(line 312,col 9)-(line 313,col 55)",
        "(line 314,col 9)-(line 314,col 38)",
        "(line 315,col 9)-(line 315,col 57)",
        "(line 316,col 9)-(line 316,col 80)",
        "(line 317,col 9)-(line 317,col 18)",
        "(line 318,col 9)-(line 318,col 22)",
        "(line 319,col 9)-(line 319,col 29)",
        "(line 320,col 9)-(line 320,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAverageCallsPerPeriod()",
      "begin_line": 326,
      "end_line": 345,
      "comment": "\n     * Tests the methods for statistics.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 329,col 60)",
        "(line 330,col 9)-(line 330,col 79)",
        "(line 331,col 9)-(line 331,col 43)",
        "(line 332,col 9)-(line 332,col 41)",
        "(line 333,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 335,col 28)",
        "(line 336,col 9)-(line 336,col 32)",
        "(line 337,col 9)-(line 338,col 51)",
        "(line 339,col 9)-(line 339,col 28)",
        "(line 340,col 9)-(line 340,col 28)",
        "(line 341,col 9)-(line 341,col 32)",
        "(line 342,col 9)-(line 343,col 51)",
        "(line 344,col 9)-(line 344,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAvailablePermits()",
      "begin_line": 350,
      "end_line": 368,
      "comment": "\n     * Tests whether the available non-blocking calls can be queried.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 353,col 60)",
        "(line 354,col 9)-(line 354,col 79)",
        "(line 355,col 9)-(line 355,col 43)",
        "(line 356,col 9)-(line 356,col 41)",
        "(line 357,col 9)-(line 358,col 23)",
        "(line 359,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 32)",
        "(line 365,col 9)-(line 366,col 40)",
        "(line 367,col 9)-(line 367,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimedSemaphoreTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.TimedSemaphore"
      ],
      "begin_line": 374,
      "end_line": 434,
      "comment": "\n     * A specialized implementation of {@code TimedSemaphore} that is easier to\n     * test.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "schedFuture"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " A mock scheduled future. "
    },
    {
      "type": "field",
      "varNames": [
        "latch"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " A latch for synchronizing with the main thread. "
    },
    {
      "type": "field",
      "varNames": [
        "periodEnds"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Counter for the endOfPeriod() invocations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.TimedSemaphoreTestImpl(long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.TimedSemaphoreTestImpl(java.util.concurrent.ScheduledExecutorService, long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.getPeriodEnds()",
      "begin_line": 399,
      "end_line": 403,
      "comment": "\n         * Returns the number of invocations of the endOfPeriod() method.\n         *\n         * @return the endOfPeriod() invocations\n         ",
      "child_ranges": [
        "(line 400,col 13)-(line 402,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.acquire()",
      "begin_line": 408,
      "end_line": 414,
      "comment": "\n         * Invokes the latch if one is set.\n         ",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 28)",
        "(line 411,col 13)-(line 413,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.endOfPeriod()",
      "begin_line": 419,
      "end_line": 425,
      "comment": "\n         * Counts the number of invocations.\n         ",
      "child_ranges": [
        "(line 421,col 13)-(line 421,col 32)",
        "(line 422,col 13)-(line 424,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.startTimer()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n         * Either returns the mock future or calls the super method.\n         ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SemaphoreThread",
      "is_interface": false,
      "parent_types": [
        "java.lang.Thread"
      ],
      "begin_line": 441,
      "end_line": 480,
      "comment": "\n     * A test thread class that will be used by tests for triggering the\n     * semaphore. The thread calls the semaphore a configurable number of times.\n     * When this is done, it can notify the main thread.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "semaphore"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": " The semaphore. "
    },
    {
      "type": "field",
      "varNames": [
        "latch"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": " A latch for communication with the main thread. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": " The number of acquire() calls. "
    },
    {
      "type": "field",
      "varNames": [
        "latchCount"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": " The number of invocations of the latch. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.SemaphoreThread.SemaphoreThread(org.apache.commons.lang3.concurrent.TimedSemaphore, java.util.concurrent.CountDownLatch, int, int)",
      "begin_line": 454,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 26)",
        "(line 456,col 13)-(line 456,col 22)",
        "(line 457,col 13)-(line 457,col 22)",
        "(line 458,col 13)-(line 458,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.SemaphoreThread.run()",
      "begin_line": 466,
      "end_line": 479,
      "comment": "\n         * Calls acquire() on the semaphore for the specified number of times.\n         * Optionally the latch will also be triggered to synchronize with the\n         * main test thread.\n         ",
      "child_ranges": [
        "(line 468,col 13)-(line 478,col 13)"
      ]
    }
  ]
}