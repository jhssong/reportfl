{
  "filepath": "/tmp/Csv-4b/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 30,
      "end_line": 189,
      "comment": "\n * A CSV record parsed from a CSV file.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The accumulated comments (if any) "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The record number. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The values of the record "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 41)",
        "(line 51,col 9)-(line 51,col 67)",
        "(line 52,col 9)-(line 52,col 31)",
        "(line 53,col 9)-(line 53,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.Enum\u003c?\u003e)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Returns a value by {@link Enum}.\n     *\n     * @param e\n     *            an enum\n     * @return the String at the given enum String\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 91,
      "end_line": 108,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, maybe null depending on {@link CSVFormat#getNullString()}.\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if {@code name} is not mapped or if the record is inconsistent\n     * @see #isConsistent()\n     * @see CSVFormat#withNullString(String)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the comment for this record, if any.\n     *\n     * @return the comment for this record, or null if no comment for this\n     *         record is available.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * @return the number of this record.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns true if this record is consistent, false if not. Currently, the only check is matching the record size to\n     * the header size. Some programs can export files that fails this test but still produce parsable files.\n     *\n     * @return true of this record is valid, false if not\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Checks whether a given column is mapped, i.e. its name has been defined to the parser.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given column is mapped.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped and has a value\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 22)"
      ]
    }
  ]
}