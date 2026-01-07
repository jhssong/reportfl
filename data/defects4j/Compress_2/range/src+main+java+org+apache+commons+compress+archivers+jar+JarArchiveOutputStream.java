{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"
      ],
      "begin_line": 35,
      "end_line": 50,
      "comment": "\n * Subclass that adds a special extra field to the very first entry\n * which allows the created archive to be used as an executable jar on\n * Solaris.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "jarMarkerAdded"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.JarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 43,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 31)"
      ]
    }
  ]
}