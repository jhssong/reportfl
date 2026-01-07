{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/queue/CircularFifoQueueTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircularFifoQueueTest",
      "is_interface": false,
      "parent_types": [
        "AbstractQueueTest\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 446,
      "comment": "\n * Test cases for CircularFifoQueue.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.CircularFifoQueueTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.verify()",
      "begin_line": 48,
      "end_line": 58,
      "comment": "\n     *  Runs through the regular verifications, but also verifies that\n     *  the buffer contains the same elements in the same sequence as the\n     *  list.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)",
        "(line 51,col 9)-(line 51,col 65)",
        "(line 52,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.isNullSupported()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Overridden because CircularFifoQueue doesn\u0027t allow null elements.\n     * @return false\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.isFailFastSupported()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Overridden because CircularFifoQueue isn\u0027t fail fast.\n     * @return false\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.makeConfirmedCollection()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Returns an empty ArrayList.\n     *\n     * @return an empty ArrayList\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.makeConfirmedFullCollection()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Returns a full ArrayList.\n     *\n     * @return a full ArrayList\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 58)",
        "(line 98,col 9)-(line 98,col 61)",
        "(line 99,col 9)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.makeObject()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Returns an empty CircularFifoQueue that won\u0027t overflow.\n     *\n     * @return an empty CircularFifoQueue\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testCircularFifoQueueCircular()",
      "begin_line": 116,
      "end_line": 139,
      "comment": "\n     * Tests that the removal operation actually removes the first element.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 26)",
        "(line 120,col 9)-(line 120,col 26)",
        "(line 121,col 9)-(line 121,col 26)",
        "(line 122,col 9)-(line 122,col 62)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 48)",
        "(line 126,col 9)-(line 126,col 48)",
        "(line 128,col 9)-(line 128,col 27)",
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 131,col 48)",
        "(line 132,col 9)-(line 132,col 48)",
        "(line 133,col 9)-(line 133,col 48)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 138,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testCircularFifoQueueRemove()",
      "begin_line": 144,
      "end_line": 160,
      "comment": "\n     * Tests that the removal operation actually removes the first element.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 20)",
        "(line 146,col 9)-(line 146,col 47)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testConstructorException1()",
      "begin_line": 165,
      "end_line": 172,
      "comment": "\n     * Tests that the constructor correctly throws an exception.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testConstructorException2()",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Tests that the constructor correctly throws an exception.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testConstructorException3()",
      "begin_line": 189,
      "end_line": 196,
      "comment": "\n     * Tests that the constructor correctly throws an exception.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError1()",
      "begin_line": 198,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 202,col 9)-(line 202,col 26)",
        "(line 203,col 9)-(line 203,col 26)",
        "(line 204,col 9)-(line 204,col 26)",
        "(line 205,col 9)-(line 205,col 26)",
        "(line 206,col 9)-(line 206,col 26)",
        "(line 208,col 9)-(line 208,col 57)",
        "(line 210,col 9)-(line 210,col 25)",
        "(line 211,col 9)-(line 211,col 54)",
        "(line 213,col 9)-(line 213,col 25)",
        "(line 214,col 9)-(line 214,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError2()",
      "begin_line": 217,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 70)",
        "(line 221,col 9)-(line 221,col 26)",
        "(line 222,col 9)-(line 222,col 26)",
        "(line 223,col 9)-(line 223,col 26)",
        "(line 224,col 9)-(line 224,col 26)",
        "(line 225,col 9)-(line 225,col 26)",
        "(line 226,col 9)-(line 226,col 26)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 229,col 9)-(line 229,col 57)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 54)",
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError3()",
      "begin_line": 238,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 70)",
        "(line 242,col 9)-(line 242,col 26)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 26)",
        "(line 245,col 9)-(line 245,col 26)",
        "(line 246,col 9)-(line 246,col 26)",
        "(line 248,col 9)-(line 248,col 57)",
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 54)",
        "(line 253,col 9)-(line 253,col 26)",
        "(line 254,col 9)-(line 254,col 26)",
        "(line 255,col 9)-(line 255,col 57)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError4()",
      "begin_line": 261,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 70)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 266,col 26)",
        "(line 267,col 9)-(line 267,col 26)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 269,col 9)-(line 269,col 26)",
        "(line 270,col 9)-(line 270,col 26)",
        "(line 271,col 9)-(line 271,col 26)",
        "(line 273,col 9)-(line 273,col 57)",
        "(line 275,col 9)-(line 275,col 25)",
        "(line 276,col 9)-(line 276,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError5()",
      "begin_line": 279,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 70)",
        "(line 283,col 9)-(line 283,col 26)",
        "(line 284,col 9)-(line 284,col 26)",
        "(line 285,col 9)-(line 285,col 26)",
        "(line 286,col 9)-(line 286,col 26)",
        "(line 287,col 9)-(line 287,col 26)",
        "(line 288,col 9)-(line 288,col 26)",
        "(line 289,col 9)-(line 289,col 26)",
        "(line 291,col 9)-(line 291,col 57)",
        "(line 293,col 9)-(line 293,col 25)",
        "(line 294,col 9)-(line 294,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError6()",
      "begin_line": 297,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 70)",
        "(line 301,col 9)-(line 301,col 26)",
        "(line 302,col 9)-(line 302,col 26)",
        "(line 303,col 9)-(line 303,col 26)",
        "(line 304,col 9)-(line 304,col 26)",
        "(line 305,col 9)-(line 305,col 26)",
        "(line 306,col 9)-(line 306,col 26)",
        "(line 307,col 9)-(line 307,col 26)",
        "(line 309,col 9)-(line 309,col 57)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError7()",
      "begin_line": 315,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 70)",
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 322,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 26)",
        "(line 324,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 325,col 26)",
        "(line 327,col 9)-(line 327,col 57)",
        "(line 329,col 9)-(line 329,col 25)",
        "(line 330,col 9)-(line 330,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError8()",
      "begin_line": 333,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 70)",
        "(line 337,col 9)-(line 337,col 26)",
        "(line 338,col 9)-(line 338,col 26)",
        "(line 339,col 9)-(line 339,col 26)",
        "(line 340,col 9)-(line 340,col 26)",
        "(line 341,col 9)-(line 341,col 26)",
        "(line 342,col 9)-(line 342,col 26)",
        "(line 343,col 9)-(line 343,col 26)",
        "(line 344,col 9)-(line 344,col 26)",
        "(line 346,col 9)-(line 346,col 57)",
        "(line 348,col 9)-(line 348,col 25)",
        "(line 349,col 9)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRemoveError9()",
      "begin_line": 352,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 70)",
        "(line 356,col 9)-(line 356,col 26)",
        "(line 357,col 9)-(line 357,col 26)",
        "(line 358,col 9)-(line 358,col 26)",
        "(line 359,col 9)-(line 359,col 26)",
        "(line 360,col 9)-(line 360,col 26)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 365,col 9)-(line 365,col 57)",
        "(line 367,col 9)-(line 367,col 25)",
        "(line 368,col 9)-(line 368,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testRepeatedSerialization()",
      "begin_line": 372,
      "end_line": 406,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 67)",
        "(line 376,col 9)-(line 376,col 23)",
        "(line 377,col 9)-(line 377,col 34)",
        "(line 378,col 9)-(line 378,col 44)",
        "(line 380,col 9)-(line 380,col 64)",
        "(line 381,col 9)-(line 381,col 51)",
        "(line 383,col 9)-(line 384,col 70)",
        "(line 386,col 9)-(line 386,col 35)",
        "(line 387,col 9)-(line 387,col 45)",
        "(line 388,col 9)-(line 388,col 24)",
        "(line 389,col 9)-(line 389,col 35)",
        "(line 390,col 9)-(line 390,col 45)",
        "(line 391,col 9)-(line 391,col 45)",
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 394,col 52)",
        "(line 396,col 9)-(line 397,col 70)",
        "(line 399,col 9)-(line 399,col 35)",
        "(line 400,col 9)-(line 400,col 45)",
        "(line 401,col 9)-(line 401,col 45)",
        "(line 402,col 9)-(line 402,col 24)",
        "(line 403,col 9)-(line 403,col 35)",
        "(line 404,col 9)-(line 404,col 45)",
        "(line 405,col 9)-(line 405,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.testGetIndex()",
      "begin_line": 408,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 20)",
        "(line 411,col 9)-(line 411,col 59)",
        "(line 412,col 9)-(line 412,col 59)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 418,col 9)-(line 418,col 23)",
        "(line 419,col 9)-(line 419,col 23)",
        "(line 421,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.getCompatibilityVersion()",
      "begin_line": 426,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueueTest.getCollection()",
      "begin_line": 441,
      "end_line": 444,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 60)"
      ]
    }
  ]
}