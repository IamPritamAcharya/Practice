#include <iostream>
#include <vector>
using namespace std;

void deleteAtPosition(vector<int> &vec, int pos) {
    if (pos < 0 || pos >= vec.size()) {
        cout << "Invalid position!" << endl;
        return;
    }
    vec.erase(vec.begin() + pos);
}

int main() {
    int n, choice, pos;
    vector<int> vec;

    cout << "Enter the number of elements: ";
    cin >> n;

    cout << "Enter the elements: ";
    for (int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;
        vec.push_back(temp);
    }

    cout << "Choose where to delete the element from:" << endl;
    cout << "1. Beginning" << endl;
    cout << "2. Middle" << endl;
    cout << "3. End" << endl;
    cout << "4. Any position" << endl;
    cin >> choice;

    switch (choice) {
        case 1:
            pos = 0;
            break;
        case 2:
            pos = vec.size() / 2;
            break;
        case 3:
            pos = vec.size() - 1;
            break;
        case 4:
            cout << "Enter the position to delete (0 to " << vec.size() - 1 << "): ";
            cin >> pos;
            break;
        default:
            cout << "Invalid choice!" << endl;
            return 1;
    }

    deleteAtPosition(vec, pos);

    cout << "Array after deletion: ";
    for (int i = 0; i < vec.size(); ++i) {
        cout << vec[i] << " ";
    }
    cout << endl;

    return 0;
}
