{
  "filepath": "/tmp/Codec-3b/src/test/org/apache/commons/codec/binary/Base64TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 211,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_64_CHARS_PER_LINE"
      ],
      "begin_line": 37,
      "end_line": 59,
      "comment": " to further parameterize commons-codec to support this pointless variation."
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_76_CHARS_PER_LINE"
      ],
      "begin_line": 61,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECODED"
      ],
      "begin_line": 81,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 134,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 159,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.resizeArray(byte[])",
      "begin_line": 175,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 56)",
        "(line 177,col 9)-(line 177,col 65)",
        "(line 178,col 9)-(line 178,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.randomData(int, boolean)",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     * \n     * @param size amount of random data to generate and encode\n     * @param urlSafe true if encoding be urlSafe\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded \n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)",
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 102)",
        "(line 194,col 9)-(line 194,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.bytesContain(byte[], byte)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 21)"
      ]
    }
  ]
}