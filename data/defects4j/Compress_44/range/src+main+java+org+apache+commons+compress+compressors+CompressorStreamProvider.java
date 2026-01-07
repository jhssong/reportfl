{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamProvider",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 103,
      "comment": "\n * Creates Compressor {@link CompressorInputStream}s and\n * {@link CompressorOutputStream}s.\n * \n * @since 1.13\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamProvider.createCompressorInputStream(java.lang.String, java.io.InputStream, boolean)",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Creates a compressor input stream from a compressor name and an input\n     * stream.\n     * \n     * @param name\n     *            of the compressor, i.e.\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_FRAMED},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#Z}\n     *            or\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}\n     * @param in\n     *            the input stream\n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     * @return compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the name or input stream is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamProvider.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n     * Creates a compressor output stream from an compressor name and an output\n     * stream.\n     * \n     * @param name\n     *            the compressor name, i.e.\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200}\n     *            or\n     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}\n     * @param out\n     *            the output stream\n     * @return the compressor output stream\n     * @throws CompressorException\n     *             if the archiver name is not known\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamProvider.getInputStreamCompressorNames()",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Gets all the input stream compressor names for this provider\n     * \n     * @return all the input compressor names for this provider\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamProvider.getOutputStreamCompressorNames()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Gets all the output stream compressor names for this provider\n     * \n     * @return all the output compressor names for this provider\n     ",
      "child_ranges": []
    }
  ]
}