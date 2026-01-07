{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/binary/Base64OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStreamTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 347,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.Base64OutputStreamTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testCodec98NPE()",
      "begin_line": 55,
      "end_line": 69,
      "comment": "\n     * Test the Base64OutputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 79)",
        "(line 57,col 9)-(line 57,col 45)",
        "(line 58,col 9)-(line 58,col 70)",
        "(line 59,col 9)-(line 59,col 69)",
        "(line 60,col 9)-(line 60,col 72)",
        "(line 61,col 9)-(line 61,col 44)",
        "(line 62,col 9)-(line 62,col 23)",
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 65)",
        "(line 66,col 9)-(line 68,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamMimeChunkSize()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamPemChunkSize()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStream(int)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 42)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 95,col 68)",
        "(line 96,col 9)-(line 96,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByChunk()",
      "begin_line": 105,
      "end_line": 134,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 109,col 68)",
        "(line 112,col 9)-(line 112,col 55)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 68)",
        "(line 117,col 9)-(line 117,col 85)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 65)",
        "(line 122,col 9)-(line 122,col 90)",
        "(line 123,col 9)-(line 123,col 55)",
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByteByByte()",
      "begin_line": 142,
      "end_line": 171,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 74)",
        "(line 145,col 9)-(line 145,col 66)",
        "(line 146,col 9)-(line 146,col 51)",
        "(line 149,col 9)-(line 149,col 55)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 151,col 51)",
        "(line 154,col 9)-(line 154,col 85)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 49)",
        "(line 159,col 9)-(line 159,col 90)",
        "(line 160,col 9)-(line 160,col 55)",
        "(line 161,col 9)-(line 161,col 41)",
        "(line 162,col 9)-(line 162,col 48)",
        "(line 165,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 191,
      "end_line": 221,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 68)",
        "(line 195,col 9)-(line 195,col 87)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 198,col 46)",
        "(line 199,col 9)-(line 199,col 86)",
        "(line 202,col 9)-(line 202,col 46)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 204,col 27)",
        "(line 205,col 9)-(line 205,col 20)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 207,col 86)",
        "(line 210,col 9)-(line 210,col 46)",
        "(line 211,col 9)-(line 211,col 22)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 27)",
        "(line 217,col 9)-(line 217,col 20)",
        "(line 218,col 9)-(line 218,col 39)",
        "(line 220,col 9)-(line 220,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 241,
      "end_line": 288,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 68)",
        "(line 245,col 9)-(line 245,col 87)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 20)",
        "(line 250,col 9)-(line 250,col 46)",
        "(line 251,col 9)-(line 251,col 91)",
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)",
        "(line 260,col 9)-(line 260,col 39)",
        "(line 261,col 9)-(line 261,col 91)",
        "(line 264,col 9)-(line 264,col 46)",
        "(line 265,col 9)-(line 265,col 53)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 20)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 99)",
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 276,col 22)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 20)",
        "(line 285,col 9)-(line 285,col 39)",
        "(line 287,col 9)-(line 287,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 296,
      "end_line": 328,
      "comment": "\n     * Tests Base64OutputStream.write for expected IndexOutOfBoundsException conditions.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 36)",
        "(line 298,col 9)-(line 298,col 65)",
        "(line 299,col 9)-(line 299,col 62)",
        "(line 301,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteToNullCoverage()",
      "begin_line": 336,
      "end_line": 345,
      "comment": "\n     * Tests Base64OutputStream.write(null).\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 65)",
        "(line 338,col 9)-(line 338,col 62)",
        "(line 339,col 9)-(line 344,col 9)"
      ]
    }
  ]
}