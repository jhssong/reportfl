{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200Utils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200Utils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 158,
      "comment": "\n * Utility methods for Pack200.\n *\n * @ThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200Utils.Pack200Utils()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(java.io.File)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Normalizes a JAR archive in-place so it can be safely signed\n     * and packed.\n     *\n     * \u003cp\u003eAs stated in \u003ca\n     * href\u003d\"http://download.oracle.com/javase/1.5.0/docs/api/java/util/jar/Pack200.Packer.html\"\u003ePack200.Packer\u0027s\u003c/a\u003e\n     * javadocs applying a Pack200 compression to a JAR archive will\n     * in general make its sigantures invalid.  In order to prepare a\n     * JAR for signing it should be \"normalized\" by packing and\n     * unpacking it.  This is what this method does.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote this methods implicitly sets the segment length to\n     * -1.\u003c/p\u003e\n     *\n     * @param jar the JAR archive to normalize\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Normalizes a JAR archive in-place so it can be safely signed\n     * and packed.\n     *\n     * \u003cp\u003eAs stated in \u003ca\n     * href\u003d\"http://download.oracle.com/javase/1.5.0/docs/api/java/util/jar/Pack200.Packer.html\"\u003ePack200.Packer\u0027s\u003c/a\u003e\n     * javadocs applying a Pack200 compression to a JAR archive will\n     * in general make its sigantures invalid.  In order to prepare a\n     * JAR for signing it should be \"normalized\" by packing and\n     * unpacking it.  This is what this method does.\u003c/p\u003e\n     *\n     * @param jar the JAR archive to normalize\n     * @param props properties to set for the pack operation.  This\n     * method will implicitly set the segment limit to -1.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(java.io.File, java.io.File)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Normalizes a JAR archive so it can be safely signed and packed.\n     *\n     * \u003cp\u003eAs stated in \u003ca\n     * href\u003d\"http://download.oracle.com/javase/1.5.0/docs/api/java/util/jar/Pack200.Packer.html\"\u003ePack200.Packer\u0027s\u003c/a\u003e\n     * javadocs applying a Pack200 compression to a JAR archive will\n     * in general make its sigantures invalid.  In order to prepare a\n     * JAR for signing it should be \"normalized\" by packing and\n     * unpacking it.  This is what this method does.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not replace the existing archive but creates\n     * a new one.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote this methods implicitly sets the segment length to\n     * -1.\u003c/p\u003e\n     *\n     * @param from the JAR archive to normalize\n     * @param to the normalized archive\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(java.io.File, java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 124,
      "end_line": 157,
      "comment": "\n     * Normalizes a JAR archive so it can be safely signed and packed.\n     *\n     * \u003cp\u003eAs stated in \u003ca\n     * href\u003d\"http://download.oracle.com/javase/1.5.0/docs/api/java/util/jar/Pack200.Packer.html\"\u003ePack200.Packer\u0027s\u003c/a\u003e\n     * javadocs applying a Pack200 compression to a JAR archive will\n     * in general make its sigantures invalid.  In order to prepare a\n     * JAR for signing it should be \"normalized\" by packing and\n     * unpacking it.  This is what this method does.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not replace the existing archive but creates\n     * a new one.\u003c/p\u003e\n     *\n     * @param from the JAR archive to normalize\n     * @param to the normalized archive\n     * @param props properties to set for the pack operation.  This\n     * method will implicitly set the segment limit to -1.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 54)",
        "(line 130,col 9)-(line 130,col 77)",
        "(line 131,col 9)-(line 131,col 25)",
        "(line 132,col 9)-(line 156,col 9)"
      ]
    }
  ]
}