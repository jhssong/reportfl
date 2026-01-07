{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/NioZipEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NioZipEncoding",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipEncoding",
        "org.apache.commons.compress.archivers.zip.CharsetAccessor"
      ],
      "begin_line": 37,
      "end_line": 216,
      "comment": "\n * A ZipEncoding, which uses a java.nio {@link\n * java.nio.charset.Charset Charset} to encode names.\n * \u003cp\u003eThe methods of this class are reentrant.\u003c/p\u003e\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useReplacement"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACEMENT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACEMENT_BYTES"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACEMENT_STRING"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HEX_CHARS"
      ],
      "begin_line": 44,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.NioZipEncoding(java.nio.charset.Charset, boolean)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Construct an NioZipEncoding using the given charset.\n     * @param charset  The character set to use.\n     * @param useReplacement should invalid characters be replaced, or reported.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 31)",
        "(line 56,col 9)-(line 56,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.getCharset()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.canEncode(java.lang.String)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * @see  ZipEncoding#canEncode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 48)",
        "(line 71,col 9)-(line 71,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.encode(java.lang.String)",
      "begin_line": 77,
      "end_line": 124,
      "comment": "\n     * @see ZipEncoding#encode(java.lang.String)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 48)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 93)",
        "(line 85,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 21)",
        "(line 123,col 9)-(line 123,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.decode(byte[])",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * @see\n     * ZipEncoding#decode(byte[])\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 133,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.encodeFully(java.nio.charset.CharsetEncoder, java.nio.CharBuffer, java.nio.ByteBuffer)",
      "begin_line": 136,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.encodeSurrogate(java.nio.CharBuffer, char)",
      "begin_line": 148,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)",
        "(line 150,col 9)-(line 150,col 20)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 155,col 43)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 157,col 18)",
        "(line 158,col 9)-(line 158,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.newEncoder()",
      "begin_line": 161,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.newDecoder()",
      "begin_line": 174,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.estimateInitialBufferSize(java.nio.charset.CharsetEncoder, int)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n     * Estimate the initial encoded size (in bytes) for a character buffer.\n     * \u003cp\u003e\n     * The estimate assumes that one character consumes uses the maximum length encoding,\n     * whilst the rest use an average size encoding. This accounts for any BOM for UTF-16, at\n     * the expense of a couple of extra bytes for UTF-8 encoded ASCII.\n     * \u003c/p\u003e\n     *\n     * @param enc        encoder to use for estimates\n     * @param charChount number of characters in string\n     * @return estimated size in bytes.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 44)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.NioZipEncoding.estimateIncrementalEncodingSize(java.nio.charset.CharsetEncoder, int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Estimate the size needed for remaining characters\n     *\n     * @param enc       encoder to use for estimates\n     * @param charCount number of characters remaining\n     * @return estimated size in bytes.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 70)"
      ]
    }
  ]
}