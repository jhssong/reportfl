{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 101,
      "comment": "\n * XZ compressor.\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.XZCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Creates a new XZ compressor using the default LZMA2 options.\n     * This is equivalent to \u003ccode\u003eXZCompressorOutputStream(outputStream, 6)\u003c/code\u003e.\n     * @param outputStream the stream to wrap\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.XZCompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Creates a new XZ compressor using the specified LZMA2 preset level.\n     * \u003cp\u003e\n     * The presets 0-3 are fast presets with medium compression.\n     * The presets 4-6 are fairly slow presets with high compression.\n     * The default preset is 6.\n     * \u003cp\u003e\n     * The presets 7-9 are like the preset 6 but use bigger dictionaries\n     * and have higher compressor and decompressor memory requirements.\n     * Unless the uncompressed size of the file exceeds 8\u0026nbsp;MiB,\n     * 16\u0026nbsp;MiB, or 32\u0026nbsp;MiB, it is waste of memory to use the\n     * presets 7, 8, or 9, respectively.\n     * @param outputStream the stream to wrap\n     * @param preset the preset\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.write(int)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.flush()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Flushes the encoder and calls \u003ccode\u003eoutputStream.flush()\u003c/code\u003e.\n     * All buffered pending data will then be decompressible from\n     * the output stream. Calling this function very often may increase\n     * the compressed file size a lot.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.finish()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * No more data can be written to this stream after finishing.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.close()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)"
      ]
    }
  ]
}