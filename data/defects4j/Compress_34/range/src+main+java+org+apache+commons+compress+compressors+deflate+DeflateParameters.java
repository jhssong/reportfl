{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateParameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateParameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 77,
      "comment": "\n * Parameters for the Deflate compressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "zlibHeader"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressionLevel"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.withZlibHeader()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Whether or not the zlib header shall be written (when\n     * compressing) or expected (when decompressing).\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.setWithZlibHeader(boolean)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Sets the zlib header presence parameter.\n     *\n     * \u003cp\u003eThis affects whether or not the zlib header will be written\n     * (when compressing) or expected (when decompressing).\u003c/p\u003e\n     *\n     * @param zlibHeader\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.getCompressionLevel()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * The compression level.\n     * @see #setCompressionLevel\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.setCompressionLevel(int)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Sets the compression level.\n     *\n     * @param compressionLevel the compression level (between 0 and 9)\n     * @see Deflater#NO_COMPRESSION\n     * @see Deflater#BEST_SPEED\n     * @see Deflater#DEFAULT_COMPRESSION\n     * @see Deflater#BEST_COMPRESSION\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 49)"
      ]
    }
  ]
}