{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/AbstractObjectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractObjectTest",
      "is_interface": false,
      "parent_types": [
        "BulkTest"
      ],
      "begin_line": 43,
      "end_line": 337,
      "comment": "\n * Abstract test class for {@link java.lang.Object} methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject()} method.\n * \u003cp\u003e\n * If your {@link Object} fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your {@link Object} fails.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "COLLECTIONS_MAJOR_VERSION"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Current major release for Collections "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.AbstractObjectTest(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.makeObject()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Implement this method to return the object to test.\n     *\n     * @return the object to test\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.supportsEmptyCollections()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Override this method if a subclass is testing an object\n     * that cannot serialize an \"empty\" Collection.\n     * (e.g. Comparators have no contents)\n     *\n     * @return true\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.supportsFullCollections()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Override this method if a subclass is testing an object\n     * that cannot serialize a \"full\" Collection.\n     * (e.g. Comparators have no contents)\n     *\n     * @return true\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.isTestSerialization()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Is serialization testing supported.\n     * Default is true.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.isEqualsCheckable()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns true to indicate that the collection supports equals() comparisons.\n     * This implementation returns true;\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testObjectEqualsSelf()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 40)",
        "(line 106,col 9)-(line 106,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testEqualsNull()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testObjectHashCodeEqualsSelfHashCode()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testObjectHashCodeEqualsContract()",
      "begin_line": 119,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 41)",
        "(line 127,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.serializeDeserialize(java.lang.Object)",
      "begin_line": 137,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 73)",
        "(line 139,col 9)-(line 139,col 70)",
        "(line 140,col 9)-(line 140,col 29)",
        "(line 141,col 9)-(line 141,col 20)",
        "(line 143,col 9)-(line 143,col 107)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 19)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testSerializeDeserializeThenCompare()",
      "begin_line": 150,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testSimpleSerialization()",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     * Sanity check method, makes sure that any Serializable\n     * class can be serialized and de-serialized in memory,\n     * using the handy makeObject() method\n     *\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 38)",
        "(line 170,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testCanonicalEmptyCollectionExists()",
      "begin_line": 180,
      "end_line": 190,
      "comment": "\n     * Tests serialization by comparing against a previously stored version in SVN.\n     * If the test object is serializable, confirm that a canonical form exists.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.testCanonicalFullCollectionExists()",
      "begin_line": 196,
      "end_line": 206,
      "comment": "\n     * Tests serialization by comparing against a previously stored version in SVN.\n     * If the test object is serializable, confirm that a canonical form exists.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.getCompatibilityVersion()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Get the version of Collections that this object tries to\n     * maintain serialization compatibility with. Defaults to 4, due to\n     * the package change to collections4 introduced in version 4.\n     *\n     * This constant makes it possible for TestMap (and other subclasses,\n     * if necessary) to automatically check SVN for a versionX copy of a\n     * Serialized object, so we can make sure that compatibility is maintained.\n     * See, for example, TestMap.getCanonicalFullMapName(Map map).\n     * Subclasses can override this variable, indicating compatibility\n     * with earlier Collections versions.\n     *\n     * @return The version, or \u003ccode\u003enull\u003c/code\u003e if this object shouldn\u0027t be\n     * tested for compatibility with previous versions.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.getCanonicalEmptyCollectionName(java.lang.Object)",
      "begin_line": 229,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 57)",
        "(line 231,col 9)-(line 231,col 38)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 84)",
        "(line 234,col 9)-(line 234,col 31)",
        "(line 235,col 9)-(line 235,col 50)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 238,col 9)-(line 238,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.getCanonicalFullCollectionName(java.lang.Object)",
      "begin_line": 241,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 57)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 53)",
        "(line 245,col 9)-(line 245,col 84)",
        "(line 246,col 9)-(line 246,col 31)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 30)",
        "(line 250,col 9)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.writeExternalFormToDisk(java.io.Serializable, java.lang.String)",
      "begin_line": 265,
      "end_line": 272,
      "comment": "\n     * Writes a Serializable or Externalizable object as\n     * a file at the given path.  NOT USEFUL as part\n     * of a unit test; this is just a utility method\n     * for creating disk-based objects in SVN that can become\n     * the basis for compatibility tests using\n     * readExternalFormFromDisk(String path)\n     *\n     * @param o Object to serialize\n     * @param path path to write the serialized Object\n     * @exception IOException\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 71)",
        "(line 267,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.writeExternalFormToBytes(java.io.Serializable)",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\n     * Converts a Serializable or Externalizable object to\n     * bytes.  Useful for in-memory tests of serialization\n     *\n     * @param o Object to convert to bytes\n     * @return serialized form of the Object\n     * @exception IOException\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 77)",
        "(line 284,col 9)-(line 284,col 49)",
        "(line 285,col 9)-(line 285,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.readExternalFormFromDisk(java.lang.String)",
      "begin_line": 298,
      "end_line": 305,
      "comment": "\n     * Reads a Serialized or Externalized Object from disk.\n     * Useful for creating compatibility tests between\n     * different SVN versions of the same class\n     *\n     * @param path path to the serialized Object\n     * @return the Object at the given path\n     * @exception IOException\n     * @exception ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 65)",
        "(line 300,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.readExternalFormFromBytes(byte[])",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n     * Read a Serialized or Externalized Object from bytes.\n     * Useful for verifying serialization in memory.\n     *\n     * @param b byte array containing a serialized Object\n     * @return Object contained in the bytes\n     * @exception IOException\n     * @exception ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 72)",
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.skipSerializedCanonicalTests()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.readExternalFormFromStream(java.io.InputStream)",
      "begin_line": 327,
      "end_line": 330,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 72)",
        "(line 329,col 9)-(line 329,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.AbstractObjectTest.writeExternalFormToStream(java.io.Serializable, java.io.OutputStream)",
      "begin_line": 332,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 74)",
        "(line 334,col 9)-(line 334,col 31)"
      ]
    }
  ]
}