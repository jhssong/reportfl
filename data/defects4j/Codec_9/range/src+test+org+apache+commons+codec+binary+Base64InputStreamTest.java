{
  "filepath": "/tmp/Codec-9b/src/test/org/apache/commons/codec/binary/Base64InputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64InputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 426,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.Base64InputStreamTest(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec105()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Tests the bug reported in CODEC-105. Bad interactions with InputStream when reading one byte at a time.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 100)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec101()",
      "begin_line": 68,
      "end_line": 78,
      "comment": "\n     * Test for the CODEC-101 bug:  InputStream.read(byte[]) should never return 0\n     * because Java\u0027s builtin InputStreamReader hates that.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 91)",
        "(line 70,col 9)-(line 70,col 71)",
        "(line 71,col 9)-(line 71,col 59)",
        "(line 72,col 9)-(line 72,col 39)",
        "(line 73,col 9)-(line 73,col 32)",
        "(line 74,col 9)-(line 74,col 75)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 77,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader()",
      "begin_line": 99,
      "end_line": 107,
      "comment": "\n     * Another test for the CODEC-101 bug:\n     * In commons-codec-1.4 this test shows InputStreamReader explicitly hating an\n     * InputStream.read(byte[]) return of 0:\n     *\n     * java.io.IOException: Underlying input stream returned zero bytes\n     * at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:268)\n     * at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:306)\n     * at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:158)\n     * at java.io.InputStreamReader.read(InputStreamReader.java:167)\n     * at java.io.BufferedReader.fill(BufferedReader.java:136)\n     * at java.io.BufferedReader.readLine(BufferedReader.java:299)\n     * at java.io.BufferedReader.readLine(BufferedReader.java:362)\n     * at org.apache.commons.codec.binary.Base64InputStreamTest.testInputStreamReader(Base64InputStreamTest.java:75)\n     *\n     * But in commons-codec-1.5 it\u0027s fixed.  :-)\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 91)",
        "(line 101,col 9)-(line 101,col 71)",
        "(line 102,col 9)-(line 102,col 59)",
        "(line 103,col 9)-(line 103,col 58)",
        "(line 104,col 9)-(line 104,col 52)",
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testCodec98NPE()",
      "begin_line": 115,
      "end_line": 127,
      "comment": "\n     * Test the Base64InputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 79)",
        "(line 117,col 9)-(line 117,col 70)",
        "(line 118,col 9)-(line 118,col 63)",
        "(line 121,col 9)-(line 121,col 83)",
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 126,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamMimeChuckSize()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStreamPemChuckSize()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Tests the Base64InputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64EmptyInputStream(int)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 42)",
        "(line 151,col 9)-(line 151,col 42)",
        "(line 152,col 9)-(line 152,col 68)",
        "(line 153,col 9)-(line 153,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByChunk()",
      "begin_line": 162,
      "end_line": 191,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 74)",
        "(line 165,col 9)-(line 165,col 66)",
        "(line 166,col 9)-(line 166,col 68)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 68)",
        "(line 174,col 9)-(line 174,col 85)",
        "(line 175,col 9)-(line 175,col 41)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 179,col 9)-(line 179,col 90)",
        "(line 180,col 9)-(line 180,col 55)",
        "(line 181,col 9)-(line 181,col 41)",
        "(line 182,col 9)-(line 182,col 45)",
        "(line 185,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testBase64InputStreamByteByByte()",
      "begin_line": 199,
      "end_line": 228,
      "comment": "\n     * Tests the Base64InputStream implementation.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 74)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 71)",
        "(line 206,col 9)-(line 206,col 55)",
        "(line 207,col 9)-(line 207,col 39)",
        "(line 208,col 9)-(line 208,col 71)",
        "(line 211,col 9)-(line 211,col 85)",
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 213,col 68)",
        "(line 216,col 9)-(line 216,col 90)",
        "(line 217,col 9)-(line 217,col 55)",
        "(line 218,col 9)-(line 218,col 41)",
        "(line 219,col 9)-(line 219,col 48)",
        "(line 222,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 248,
      "end_line": 279,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 59)",
        "(line 252,col 9)-(line 252,col 67)",
        "(line 253,col 9)-(line 253,col 57)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 49)",
        "(line 257,col 9)-(line 257,col 78)",
        "(line 260,col 9)-(line 260,col 47)",
        "(line 261,col 9)-(line 261,col 39)",
        "(line 262,col 9)-(line 262,col 50)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 49)",
        "(line 266,col 9)-(line 266,col 78)",
        "(line 269,col 9)-(line 269,col 47)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 50)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 278,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 299,
      "end_line": 339,
      "comment": "\n     * Tests method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64InputStream wraps itself in encode and decode mode\n     * over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 67)",
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 43)",
        "(line 310,col 9)-(line 310,col 49)",
        "(line 311,col 9)-(line 311,col 78)",
        "(line 314,col 9)-(line 314,col 47)",
        "(line 315,col 9)-(line 315,col 39)",
        "(line 316,col 9)-(line 316,col 42)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 43)",
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 323,col 78)",
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 42)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 43)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testMarkSupported()",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\n     * Tests markSupported.\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 66)",
        "(line 348,col 9)-(line 348,col 69)",
        "(line 349,col 9)-(line 349,col 88)",
        "(line 351,col 9)-(line 351,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testRead0()",
      "begin_line": 359,
      "end_line": 367,
      "comment": "\n     * Tests read returning 0\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 66)",
        "(line 361,col 9)-(line 361,col 36)",
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 363,col 69)",
        "(line 364,col 9)-(line 364,col 88)",
        "(line 365,col 9)-(line 365,col 39)",
        "(line 366,col 9)-(line 366,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadNull()",
      "begin_line": 375,
      "end_line": 385,
      "comment": "\n     * Tests read with null.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 66)",
        "(line 377,col 9)-(line 377,col 69)",
        "(line 378,col 9)-(line 378,col 88)",
        "(line 379,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64InputStreamTest.testReadOutOfBounds()",
      "begin_line": 392,
      "end_line": 425,
      "comment": "\n     * Tests read throwing IndexOutOfBoundsException\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 66)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 69)",
        "(line 396,col 9)-(line 396,col 88)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 424,col 9)"
      ]
    }
  ]
}