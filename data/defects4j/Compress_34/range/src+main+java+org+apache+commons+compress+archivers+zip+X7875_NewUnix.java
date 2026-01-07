{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X7875_NewUnix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 345,
      "comment": "\n * An extra field that stores UNIX UID/GID data (owner \u0026amp; group ownership) for a given\n * zip entry.  We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n *\n * \u003cpre\u003e\n * Local-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7875        Short       tag for this extra block type (\"ux\")\n * TSize         Short       total data size for this block\n * Version       1 byte      version of this extra field, currently 1\n * UIDSize       1 byte      Size of UID field\n * UID           Variable    UID for this entry (little endian)\n * GIDSize       1 byte      Size of GID field\n * GID           Variable    GID for this entry (little endian)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7855        Short       tag for this extra block type (\"Ux\")\n * TSize         Short       total data size for this block (0)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THOUSAND"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " always \u00271\u0027 according to current info-zip spec."
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " NOTE:  equals() and hashCode() currently assume these can never be null."
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.X7875_NewUnix()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Constructor for X7875_NewUnix.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getHeaderId()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getUID()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Gets the UID as a long.  UID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the UID value.\n     ",
      "child_ranges": [
        "(line 95,col 28)-(line 95,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getGID()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Gets the GID as a long.  GID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the GID value.\n     ",
      "child_ranges": [
        "(line 105,col 28)-(line 105,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setUID(long)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Sets the UID.\n     *\n     * @param l UID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setGID(long)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Sets the GID.\n     *\n     * @param l GID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength()",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 80)",
        "(line 133,col 9)-(line 133,col 80)",
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Length of the extra field in the central directory data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData()",
      "begin_line": 155,
      "end_line": 184,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 162,col 9)-(line 162,col 61)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 170,col 9)-(line 170,col 70)",
        "(line 173,col 9)-(line 173,col 26)",
        "(line 174,col 9)-(line 174,col 26)",
        "(line 176,col 9)-(line 176,col 20)",
        "(line 177,col 9)-(line 177,col 55)",
        "(line 178,col 9)-(line 178,col 63)",
        "(line 179,col 9)-(line 179,col 66)",
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 63)",
        "(line 182,col 9)-(line 182,col 66)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryData()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 204,
      "end_line": 219,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 16)",
        "(line 208,col 9)-(line 208,col 63)",
        "(line 209,col 9)-(line 209,col 62)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 212,col 9)-(line 212,col 26)",
        "(line 213,col 9)-(line 213,col 56)",
        "(line 215,col 9)-(line 215,col 62)",
        "(line 216,col 9)-(line 216,col 44)",
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 218,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Doesn\u0027t do anything since this class doesn\u0027t store anything\n     * inside the central directory.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.reset()",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 27)",
        "(line 237,col 9)-(line 237,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.clone()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(java.lang.Object)",
      "begin_line": 257,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode()",
      "begin_line": 267,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 36)",
        "(line 273,col 9)-(line 273,col 53)",
        "(line 274,col 9)-(line 274,col 29)",
        "(line 275,col 9)-(line 275,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byte[])",
      "begin_line": 287,
      "end_line": 344,
      "comment": "\n     * Not really for external usage, but marked \"package\" visibility\n     * to help us JUnit it.   Trims a byte array of leading zeroes while\n     * also enforcing a minimum length, and thus it really trims AND pads\n     * at the same time.\n     *\n     * @param array byte[] array to trim \u0026 pad.\n     * @return trimmed \u0026 padded byte[] array.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 20)",
        "(line 293,col 9)-(line 299,col 9)",
        "(line 338,col 9)-(line 338,col 33)",
        "(line 340,col 9)-(line 340,col 81)",
        "(line 341,col 9)-(line 341,col 66)",
        "(line 342,col 9)-(line 342,col 93)",
        "(line 343,col 9)-(line 343,col 28)"
      ]
    }
  ]
}