<template>
  <v-container>

      <v-row>
        <v-col>

          <v-card
            color="primary"
            title="FORMULAIRE D'AJOUT CLIENT"
            subtitle="Yanager..."
            variant="outlined"
          >
            <v-card-text>
              <v-text-field label="Nom" variant="outlined"></v-text-field>
              <v-text-field label="Prenom" variant="outlined"></v-text-field>
              <v-text-field label="Date Naissance" variant="outlined"></v-text-field>
              <v-text-field label="Adresse" variant="outlined"></v-text-field>
              <v-text-field label="Code postal" variant="outlined"></v-text-field>
              <v-text-field label="Ville" variant="outlined"></v-text-field>
            </v-card-text>
            <v-card-actions class="flex-row-reverse">

              <v-btn class="ma-1" color="warning" variant="outlined">
                Annuler
              </v-btn>
              <v-btn color="success" class="ma-1" variant="outlined">
                Ajouter
              </v-btn>
            </v-card-actions>
          </v-card>
        </v-col>
        <v-col>
          <v-table>
            <template v-slot:default>
              <thead>
              <tr>
                <th class="text-left">
                  <strong>Nom</strong>
                </th>
                <th class="text-left">
                  <strong>Prenom</strong>

                </th>
                <th class="text-left">
                  <strong>dateNaissance</strong>
                </th>
                <th class="text-left">
                  <strong>adresse</strong>
                </th>
                <th class="text-left">
                  <strong>cp</strong>
                </th>
                <th class="text-left">
                  <strong>ville</strong>
                </th>
                <th class="text-left">
                  <strong>Action</strong>
                </th>
              </tr>
              </thead>
              <tbody>
              <tr
                v-for="item in desserts"
                :key="item.name"
              >
                <td>{{ item.name }}</td>
                <td>{{ item.calories }}</td>

                <td>{{ item.name }}</td>
                <td>{{ item.calories }}</td>

                <td>{{ item.name }}</td>
                <td>{{ item.calories }}</td>
                <td>
                  <v-row align="center" justify="center">
                    <v-col cols="auto">
                      <v-btn variant="outlined" color="blue" icon="mdi-pencil" size="x-small"></v-btn>
                    </v-col>

                    <v-col cols="auto">
                      <v-btn variant="outlined" color="red"  icon="mdi-delete" size="x-small"></v-btn>
                    </v-col>

                  </v-row>

                </td>
              </tr>
              </tbody>
            </template>
          </v-table>
        </v-col>
      </v-row>


  </v-container>
</template>

<script>
import ClientService from "@/services/ClientService";
export default {
  name: 'Client',
  data () {
    return {
      client: [],
      desserts: [
        {
          name: 'Frozen Yogurt',
          prenom: 159,
          age: 159,
        },
        {
          name: 'Ice cream sandwich',
          calories: 237,
        },
        {
          name: 'Eclair',
          calories: 262,
        },
        {
          name: 'Cupcake',
          calories: 305,
        },
        {
          name: 'Gingerbread',
          calories: 356,
        },
        {
          name: 'Jelly bean',
          calories: 375,
        },
        {
          name: 'Lollipop',
          calories: 392,
        },
        {
          name: 'Honeycomb',
          calories: 408,
        },
        {
          name: 'Donut',
          calories: 452,
        },
        {
          name: 'KitKat',
          calories: 518,
        },
      ],
    }
  },
  methods: {
    getClient(){
      ClientService.getClient().then((response) => {
        this.client = response.data;
        console.log("Donnée Client ==> ", response.data)
      })
    }

  },
  created() {
    this.getClient();
  },
  mounted() {
  }
}
</script>
