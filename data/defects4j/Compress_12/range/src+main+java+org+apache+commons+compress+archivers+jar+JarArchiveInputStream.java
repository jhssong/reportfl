{
  "filepath": "/tmp/Compress-12b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"
      ],
      "begin_line": 33,
      "end_line": 62,
      "comment": "\n * Implements an input stream that can read entries from jar files.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.JarArchiveInputStream(java.io.InputStream)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.getNextJarEntry()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 50)",
        "(line 41,col 9)-(line 41,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.getNextEntry()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byte[], int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Checks if the signature matches what is expected for a jar file\n     * (in this case it is the same as for a zip file).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a jar archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 64)"
      ]
    }
  ]
}