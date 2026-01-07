{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/binary/Base64OutputStreamTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64OutputStreamTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 348,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CRLF"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testCodec98NPE()",
      "begin_line": 49,
      "end_line": 64,
      "comment": "\n     * Test the Base64OutputStream implementation against the special NPE inducing input\n     * identified in the CODEC-98 bug.\n     *\n     * @throws Exception for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 79)",
        "(line 52,col 9)-(line 52,col 45)",
        "(line 53,col 9)-(line 53,col 70)",
        "(line 54,col 9)-(line 54,col 69)",
        "(line 55,col 9)-(line 55,col 72)",
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 57,col 23)",
        "(line 59,col 9)-(line 59,col 49)",
        "(line 60,col 9)-(line 60,col 65)",
        "(line 61,col 9)-(line 63,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamMimeChunkSize()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStreamPemChunkSize()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Test the Base64OutputStream implementation against empty input.\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64EmptyOutputStream(int)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 68)",
        "(line 93,col 9)-(line 93,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByChunk()",
      "begin_line": 102,
      "end_line": 132,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 74)",
        "(line 106,col 9)-(line 106,col 66)",
        "(line 107,col 9)-(line 107,col 72)",
        "(line 110,col 9)-(line 110,col 55)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 115,col 9)-(line 115,col 85)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 69)",
        "(line 120,col 9)-(line 120,col 90)",
        "(line 121,col 9)-(line 121,col 55)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testBase64OutputStreamByteByByte()",
      "begin_line": 140,
      "end_line": 170,
      "comment": "\n     * Test the Base64OutputStream implementation\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 74)",
        "(line 144,col 9)-(line 144,col 66)",
        "(line 145,col 9)-(line 145,col 51)",
        "(line 148,col 9)-(line 148,col 55)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 51)",
        "(line 153,col 9)-(line 153,col 85)",
        "(line 154,col 9)-(line 154,col 41)",
        "(line 155,col 9)-(line 155,col 49)",
        "(line 158,col 9)-(line 158,col 90)",
        "(line 159,col 9)-(line 159,col 55)",
        "(line 160,col 9)-(line 160,col 41)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 164,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByChunk(byte[], byte[], int, byte[])",
      "begin_line": 190,
      "end_line": 220,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 68)",
        "(line 194,col 9)-(line 194,col 87)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 196,col 20)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 198,col 9)-(line 198,col 86)",
        "(line 201,col 9)-(line 201,col 46)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 27)",
        "(line 204,col 9)-(line 204,col 20)",
        "(line 205,col 9)-(line 205,col 39)",
        "(line 206,col 9)-(line 206,col 86)",
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 22)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 27)",
        "(line 216,col 9)-(line 216,col 20)",
        "(line 217,col 9)-(line 217,col 39)",
        "(line 219,col 9)-(line 219,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testByteByByte(byte[], byte[], int, byte[])",
      "begin_line": 240,
      "end_line": 287,
      "comment": "\n     * Test method does three tests on the supplied data: 1. encoded ---[DECODE]--\u003e decoded 2. decoded ---[ENCODE]--\u003e\n     * encoded 3. decoded ---[WRAP-WRAP-WRAP-etc...] --\u003e decoded\n     * \u003cp/\u003e\n     * By \"[WRAP-WRAP-WRAP-etc...]\" we mean situation where the Base64OutputStream wraps itself in encode and decode\n     * mode over and over again.\n     * \n     * @param encoded\n     *            base64 encoded data\n     * @param decoded\n     *            the data from above, but decoded\n     * @param chunkSize\n     *            chunk size (line-length) of the base64 encoded data.\n     * @param seperator\n     *            Line separator in the base64 encoded data.\n     * @throws Exception\n     *             Usually signifies a bug in the Base64 commons-codec implementation.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 68)",
        "(line 244,col 9)-(line 244,col 87)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 20)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 91)",
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 20)",
        "(line 259,col 9)-(line 259,col 39)",
        "(line 260,col 9)-(line 260,col 91)",
        "(line 263,col 9)-(line 263,col 46)",
        "(line 264,col 9)-(line 264,col 53)",
        "(line 265,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 20)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 99)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 275,col 9)-(line 275,col 22)",
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 20)",
        "(line 284,col 9)-(line 284,col 39)",
        "(line 286,col 9)-(line 286,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64OutputStreamTest.testWriteOutOfBounds()",
      "begin_line": 295,
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
      "end_line": 346,
      "comment": "\n     * Tests Base64OutputStream.write(null).\n     * \n     * @throws Exception\n     *             for some failure scenarios.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 65)",
        "(line 339,col 9)-(line 339,col 62)",
        "(line 340,col 9)-(line 345,col 9)"
      ]
    }
  ]
}